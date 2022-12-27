package practice;

import java.util.ArrayList;
import java.util.Collections;

public class Test {


    public static void main(String[] args) {
        ArrayList<Temp> t = new ArrayList<>();
        t.add(new Temp(1));
        t.add(new Temp(5));
        t.add(new Temp(3));
        t.add(new Temp(2));

        Collections.sort(t);

        for (Temp data: t) {
            System.out.println(data.num);
        }
    }
}
class Temp implements Comparable<Temp>{
    int num;
    public Temp(int num){
        this.num = num;
    }
    @Override
    public int compareTo(Temp o) {
        return o.num-this.num;
    }
}