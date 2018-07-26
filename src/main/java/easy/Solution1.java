package easy;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        //array: [0, 1, 2, 3, 4, 4, 4]
        //i: 5
        System.out.println("i: "+removeDuplicates(new int[]{0,1,2,2,3,4,4 }));
    }

    //Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            if (n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        System.out.println("array: "+Arrays.toString(nums));
        return i;
    }
}
