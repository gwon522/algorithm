package programmers.lv2;

import java.util.ArrayList;
import java.util.HashMap;

public class Zip {

    HashMap<String,Integer> dictionary = new HashMap<>();
    int num = 27;

    public void setDictionary(){
        char ch = 'A';
        for(int i = 1; i < 27; i++ ){
            dictionary.put(ch+"",i);
            ch++;
        }
    }
    public void addDictionary(String str){
        System.out.println(str+"추가");
        dictionary.put(str,num++);
    }

    public int[] listToArray(ArrayList<Integer> list){
        int[] result = new int[list.size()];

        for(int i = 0; i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public int[] solution(String msg){
        ArrayList<Integer> result = new ArrayList<>();
        setDictionary();

        int size = msg.length();

        for(int i = 0; i < size; i++){
            int a = 1;

            //i+a가 크거나 dictionary에 값이 없으면 종료
            while(i+a<=size && dictionary.containsKey(msg.substring(i,i+a))){
                a++;
            }

            if(i+a>size){
                //i+a가 size보다 더 클 경우 즉 문자열이 끝났을 경우
                result.add(dictionary.get(msg.substring(i)));
                break;
            }

            System.out.println("a의 값 : "+a);
            result.add(dictionary.get(msg.substring(i,i+a-1)));
            addDictionary(msg.substring(i,i+a));
            //a가 1이상일 경우 -> i를 a보다 1작은수로 바꿔줘야함 하지만 for문 돌면서 ++하므로 2를 빼준다
            if(a>1)i+=a-2;
        }

        return listToArray(result);
    }

    public void print(String msg){
    int [] arr = solution(msg);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
