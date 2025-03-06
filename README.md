# leetcode-daily-challenge
Daily LeetCode challenge - improving my DSA skills!

# 🚀 My LeetCode Solutions
This repository contains my solutions to LeetCode problems in Java.

## 📂 Folder Structure
- `Easy/` → Solutions to easy problems
- `Medium/` → Solutions to medium problems
- `Hard/` → Solutions to hard problems

## 🔥 Example Solution
```java
// 1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;

        for (int i = 1; i < length; i++) {
            for (int j = i; j < length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[]{j, j - i};
                }
            }
        }

        return new int[]{};
    }
}
