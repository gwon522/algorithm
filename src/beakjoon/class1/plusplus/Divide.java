package beakjoon.class1.plusplus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Divide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 10;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < cnt; i++) {
            set.add(Integer.parseInt(br.readLine())%42);
        }
        System.out.println(set.size());
    }
}
