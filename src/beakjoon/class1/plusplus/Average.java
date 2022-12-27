package beakjoon.class1.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat = Integer.parseInt(br.readLine());
        String [] strArr = br.readLine().split(" ");
        Double max=0.0;

        for (int i = 0; i < repeat; i++) {
            if(i==0){
                max = Double.parseDouble(strArr[0]);
            }else {
                Double temp = Double.parseDouble(strArr[i]);
                max = temp > max ? temp : max;

            }
        }
        Double sum =0.0;
        for (String str :strArr) {
             sum+=(Double.parseDouble(str)/max)*100;
        }
        System.out.println(sum/repeat);
    }
}

