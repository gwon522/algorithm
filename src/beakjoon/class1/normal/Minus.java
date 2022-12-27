package beakjoon.class1.normal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Minus {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] data = br.readLine().split(" ");
        int num =Integer.parseInt(data[0])-Integer.parseInt(data[1]);
        System.out.println(num);
    }
}
