package beakjoon.class1.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCnt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] strArr = br.readLine().split(" ");
        int cnt =0;
        for (String str : strArr) {
            if(str.equals("")) {
                continue;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
