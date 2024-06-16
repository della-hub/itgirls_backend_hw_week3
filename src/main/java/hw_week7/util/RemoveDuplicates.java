package hw_week7.util;

import java.util.Arrays;



public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums) {


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {

                    nums[j] = 0;


                }

            }

        }
        int[] nums1 = nums;
        return nums1;

    }


    public static int[] pushZeroesToTheEnd(int[] nums1) {

        int count = 0;

        for (int i = 0; i < nums1.length; i++) {

                if (nums1[i] != 0) {
                    nums1[count++] = nums1[i];
                }

            }
            while (count < nums1.length) {
                nums1[count++] = 0;

            }

            return nums1;
        }


}





