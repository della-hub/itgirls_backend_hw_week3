package hw_week7_1.util;


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


        int count = 1;

        for (int g = 1; g < nums1.length; g++) {

            if (nums1[g] != 0) {
                nums1[count++] = nums1[g];
            }

        }
        while (count < nums1.length) {
            nums1[count++] = 0;

        }

        return nums1;
    }



    }







