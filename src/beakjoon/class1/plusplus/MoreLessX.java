package beakjoon.class1.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MoreLessX {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String [] exam = br.readLine().split(" ");
        int [] intArr = new int[Integer.parseInt(exam[0])];
        int num = Integer.parseInt(exam[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < intArr.length; i++) {
            int ref = Integer.parseInt(st.nextToken());
            if(ref < num) sb.append(ref + " ");
        }

        System.out.print(sb);
    }
}
