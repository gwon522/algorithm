package beakjoon.class1.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClockAlarm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] strArr = br.readLine().split(" ");
        int hour = Integer.parseInt(strArr[0]);
        int min = Integer.parseInt(strArr[1]);

        if(min-45<0){
            sb.append(hour==0?23:hour-1).append(" ").append(60+(min-45));
        }else {
            sb.append(hour).append(" ").append(min-45);
        }
        System.out.println(sb);
    }
}
