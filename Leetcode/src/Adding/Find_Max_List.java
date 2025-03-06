package Adding;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find_Max_List {
    public static int findMaxInList(List<Integer> list){
        int max = Collections.max(list);
        return max;
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 7, 99, 45, 88);
        System.out.println(findMaxInList(list));
    }
}
