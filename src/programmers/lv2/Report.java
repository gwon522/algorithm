package programmers.lv2;

import java.util.ArrayList;
import java.util.HashMap;

public class Report {

    /*
    * 다른사람 풀이법
    *
    * 1. 중복으로 신고한것을 체크하기위해 set을 사용하여 걸럿다.
    * 2. Arrays.stream(report).distinct().collect(Collectors.toList());를 사용하여 중복 제거거
    * 3. user 객체를 만들어서 신고 list, cnt 등등 arraylist만들어서 체크
    * */
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, ArrayList<String>> reportList = new HashMap<>();
        HashMap<String,Integer> reportCnt = new HashMap<>();
        int reps = report.length;

        for (int i = 0; i < reps; i++) {
            String[] temp = report[i].split(" ");
            ArrayList<String> list = new ArrayList<>();

            if(reportList.containsKey(temp[0])){
                list = reportList.get(temp[0]);
            }

            if(list.contains(temp[1])){
                continue;
            }

            list.add(temp[1]);
            reportList.put(temp[0],list);
            reportCnt.put(temp[1],reportCnt.getOrDefault(temp[1],0)+1);
        }

        for (int i = 0; i < id_list.length; i++) {
            ArrayList<String> userList = reportList.get(id_list[i]); //신고자 목록 가져옴
            System.out.println("userList 데이터 : "+ userList);
            if(userList != null){
                for (String user : userList) {
                    System.out.println("user : "+user);
                    if(reportCnt.get(user) >= k){
                        answer[i]++;
                    }
                }
            }

        }

        return answer;
    }

}
