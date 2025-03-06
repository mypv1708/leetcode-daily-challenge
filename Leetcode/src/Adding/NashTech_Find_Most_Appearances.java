package Adding;

import java.util.*;

public class NashTech_Find_Most_Appearances {
    public static List<Integer> findMostAppearances(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        int maxFreq = Collections.max(hashMap.values());

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            if (entry.getValue() == maxFreq){
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 3, 4, 4};
        int[] arr2 = {1, 2, 2};

        System.out.println(findMostAppearances(arr1));
        System.out.println(findMostAppearances(arr2));
    }
}
