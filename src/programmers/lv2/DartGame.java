package programmers.lv2;


public class DartGame {
    /*
        다른사람 풀이
        1. 스택으로 풀었음
        2. regex의 pattern, Matcher 사용하여 풀이
        - https://school.programmers.co.kr/learn/courses/30/lessons/17682/solution_groups?language=java&type=all (신지웅 풀이)
     */
    public int solution(String dartResult){
        int answer = 0;
        int[] scoreArr = new int[3];
        String number = "";
        int idx=0;
        for (int i = 0; i < dartResult.length(); i++) {
            String c = dartResult.charAt(i)+"";

            if(c.matches("[0-9]")){
                number+=String.valueOf(c);
                continue;
            }

            if(c.matches("[S|D|T]")){
                int multi = 1;
                if(c.equals("D")) multi = 2;
                else if (c.equals("T")) multi = 3;

                scoreArr[idx++] = (int)Math.pow(Integer.parseInt(number),multi);
                number ="";
                continue;
            }

            if(c.matches("[*|#]")){
                // 아차상은 중복적용안됨
                switch (c){
                    case "*":
                        scoreArr[idx-1]*=2;
                        if(idx-2>=0){
                            scoreArr[idx-2]*=2;
                        }
                        break;
                    default:
                        scoreArr[idx-1]*=-1;
                        break;
                }
            }
        }
        answer = scoreArr[0]+scoreArr[1]+scoreArr[2];

        return answer;
    }

}
