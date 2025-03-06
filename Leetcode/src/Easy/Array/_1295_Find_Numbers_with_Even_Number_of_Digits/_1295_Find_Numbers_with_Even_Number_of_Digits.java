package Easy.Array._1295_Find_Numbers_with_Even_Number_of_Digits;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    static int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (countNumOfLetter(num) % 2 == 0) counter++;
        }
        return counter;
    }

    static int countNumOfLetter(int a) {
        int counter = 0;
        while (a != 0){
            a/=10;
            counter++;
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {1,32,43,54,65,3323,32122,32332,122,132132};
        System.out.println(findNumbers(arr));
    }
}
