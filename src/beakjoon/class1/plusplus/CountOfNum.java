package beakjoon.class1.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOfNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = 1;
        for (int i = 0; i < 3; i++) {
            num*=Integer.parseInt(br.readLine());
        }
        int [] intArr = new int[10];
        String [] strArr = (num+"").split("");

        for (int i = 0; i < strArr.length; i++) {
            int val = Integer.parseInt(strArr[i]);
            intArr[val]++;
        }
        for (int i = 0; i < intArr.length; i++) {
            sb.append(intArr[i]+"\n");
        }
        System.out.println(sb);
    }
}
