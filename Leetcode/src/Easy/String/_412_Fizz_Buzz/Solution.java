package Easy.String._412_Fizz_Buzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List fizzBuzz(int n) {
        List ans = new ArrayList();
        for (int i = 1; i <= n; i++) {
            ans.add(
                    i % 15 == 0 ? "FizzBuzz" :
                    i % 5 == 0 ? "Buzz" :
                    i % 3 == 0 ? "Fizz" :
                    String.valueOf(i)
            );
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 15;

        System.out.println(fizzBuzz(n));
    }
}
