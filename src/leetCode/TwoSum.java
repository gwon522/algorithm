package leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] input1 = {2,7,11,15};
        int[] input2 = {3,2,4};
        int[] input3 = {3,3};
        int[] target = {9,6,6};
        System.out.println(Arrays.toString(solution(input3,target[2])));
    }

    private static int[] solution(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needValue = target-nums[i];
            if(map.containsKey(needValue)){
                return new int[]{map.get(needValue),i};
            }
            map.put(nums[i],i);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        return new int[]{-1,-1};
    }
}
