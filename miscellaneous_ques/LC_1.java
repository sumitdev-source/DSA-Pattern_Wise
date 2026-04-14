package miscellaneous_ques;

import java.util.Arrays;

public class LC_1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6 };
        int target = 8;
        int[] res = twoSum(arr, target);
        System.out.println(Arrays.toString(res));
    }
}

// it's time complexity is O(n2).
// but i will write it in O(n).
// tested