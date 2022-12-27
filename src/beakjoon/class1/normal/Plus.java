package beakjoon.class1.normal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Plus {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] n = br.readLine().split(" ");
        int num = 0;

        for (int i = 0; i < n.length; i++) {
            num += Integer.parseInt(n[i]);
        }
        System.out.println(num);
        
    }
}
