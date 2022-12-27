package beakjoon.class1.plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int repeat = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < repeat; i++) {

            String [] read = br.readLine().split(" ");

            int num = Integer.parseInt(read[0]);
            String str = read[1];

            for (int k = 0; k < str.length(); k++) {
                for (int j = 0; j < num; j++) {
                    sb.append(str.charAt(k));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
