package beakjoon.class1.plus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int [] numArr = new int[repeat];
        int max =0;
        int min =0;

        for (int i = 0; i < repeat; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
            if(i==0){
                max = numArr[i];
                min = numArr[i];
            }else{
                max = numArr[i]>max?numArr[i]:max;//Math.max(numArr[i],max);
                min = numArr[i]<min?numArr[i]:min;//Math.min(numArr[i],min);
            }
        }
        System.out.printf("%d %d",min,max);
    }
}
