package beakjoon.class1.plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OxQuiz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int repeat = Integer.parseInt(br.readLine());
        int [] result = new int[repeat];

        for (int i = 0; i < repeat; i++) {
            String [] strArr = br.readLine().split("");

            int cnt = 1;
            for (int j = 0; j < strArr.length; j++) {
                if(strArr[j].equals("O")) result[i] +=cnt++;
                else cnt = 1;
            }
        }

        for (int num: result) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
