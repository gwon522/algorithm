package beakjoon.class1.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerficateOfNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] strArr = br.readLine().split(" ");
        int sum = 0;
//        Arrays.stream(strArr).forEach(s -> Math.pow(Double.parseDouble(s),2));
        for (String str: strArr) {
            int num = Integer.parseInt(str);
            sum+=num*num;
        }
        System.out.println(sum%10);
    }
}
