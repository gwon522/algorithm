package beakjoon.class1.plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Plus5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = "";
        while(!(str=br.readLine()).equals("0 0")){
            String [] strArr = str.split(" ");

            sb.append(Integer.parseInt(strArr[0])+Integer.parseInt(strArr[1])+"\n");
        }
        System.out.print(sb);
    }
}
