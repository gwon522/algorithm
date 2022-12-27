package beakjoon.class1.plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plus3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int repeat = Integer.parseInt(br.readLine());


        for (int i = 0; i < repeat; i++) {
            String [] strArr = br.readLine().split(" ");

            sb.append(Integer.parseInt(strArr[0])+Integer.parseInt(strArr[1])+"\n");
        }
        br.close();
        System.out.print(sb);

    }
}
