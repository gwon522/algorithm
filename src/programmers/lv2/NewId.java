package programmers.lv2;

public class NewId {

    /*
        다른사람들이 짠 코드
        1. 객체지향으로 class 를 생성한 후 해당 클래스에 체이닝 메서드를 사용하여 변환
        2. 이외는 나와 비슷한 코드
    */
    public String solution(String id){
        String answer=id;
        answer = answer.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9\\-_.]","") ;
        answer = answer.replaceAll("[.]{2,}",".");

        if(answer.startsWith("."))
            answer = answer.substring(1);
        if(answer.endsWith("."))
            answer = answer.substring(0,answer.length()-1);
        /*
          위의 코드를 대체할수 있는코드
          answer = answer.replaceAll("^[.]|[.]$","");
          정규표현식 REGEX
              ^ : 시작
              $ : 끝
              | : ~이거나
              [a-z] : 소문자 a부터z까지
              [A-Z] : 대문자A부터Z까지
              [0-9] : 0부터9까지
              {} : 횟수 표시
              []안에서의 ^ : 제외하고

         */


        if(answer.equals("")){
            answer ="a";
        }
        if(answer.length()>=16){
            answer = answer.substring(0,15);
        }
        if(answer.endsWith("."))
            answer = answer.substring(0,answer.length()-1);

        while(answer.length()<=2){
            answer+=answer.charAt(answer.length()-1);
        }
        return answer;
    }
}
