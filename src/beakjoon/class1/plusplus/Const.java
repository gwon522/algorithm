package beakjoon.class1.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Const {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str1 = st.nextToken();
        String str2 = st.nextToken();

        String chgStr1 ="";
        String chgStr2 ="";
        for (int i = 0; i < 3; i++) {
            chgStr1+=str1.charAt(2-i);
            chgStr2+=str2.charAt(2-i);
        }
        System.out.println(Integer.parseInt(chgStr1)>Integer.parseInt(chgStr2)?chgStr1:chgStr2);
    }
}
