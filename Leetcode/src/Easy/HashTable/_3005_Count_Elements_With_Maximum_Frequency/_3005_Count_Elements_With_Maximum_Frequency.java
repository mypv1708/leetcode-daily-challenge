package Easy.HashTable._3005_Count_Elements_With_Maximum_Frequency;

import java.util.*;

public class _3005_Count_Elements_With_Maximum_Frequency {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freMap = new HashMap<>();
        for (int num : nums) {
            freMap.put(num, freMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : freMap.entrySet()) {
            int freq = entry.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(entry.getKey());
        }

        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null){
                result.addAll(bucket[i]);
                return result.size() * i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(maxFrequencyElements(arr));
    }
}
