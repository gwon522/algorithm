package beakjoon.class1.plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MaxNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int max = 0;
        ArrayList<Integer> numArray = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int num = Integer.parseInt(br.readLine().trim());
            numArray.add(num);
            max = Math.max(max,num);
        }
        sb.append(max).append("\n").append(numArray.indexOf(max)+1);
        System.out.println(sb);
    }
}
