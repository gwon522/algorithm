package beakjoon.class1.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindAlphabet {
    public static void main(String[] args) throws IOException {
        solution1();
        System.out.println(" ");
        solution2();
    }

    public static void solution1() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char [] charArr = br.readLine().toCharArray();
        int [] alphaArr=new int[26];
        Arrays.fill(alphaArr,-1);

        for (int i = 0; i < charArr.length; i++) {
            char ch = charArr[i];
            if(alphaArr[ch-'a']==-1) alphaArr[ch-'a'] = i;
        }

        for (int i : alphaArr) {
            sb.append(i+" ");
        }
        System.out.print(sb);
    }
    public static void solution2() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(str.indexOf(i)+" ");
        }

        System.out.print(sb);
    }
}
