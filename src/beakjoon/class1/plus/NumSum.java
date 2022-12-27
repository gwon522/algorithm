package beakjoon.class1.plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        String [] arr = br.readLine().split("");
        int sum = 0;
        for (int i = 0; i < repeat; i++) {
            if(repeat ==1){
                sum = Integer.parseInt(arr[i]);
                break;
            }
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
