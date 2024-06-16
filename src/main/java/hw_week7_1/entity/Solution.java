package hw_week7_1.entity;

import java.util.Arrays;

import static hw_week7_1.util.RemoveDuplicates.removeDuplicates;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4, 5, 5};
        int[] expectedNums = {0, 1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        int[] result = removeDuplicates(nums);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.equals(result, expectedNums));
    }
}
