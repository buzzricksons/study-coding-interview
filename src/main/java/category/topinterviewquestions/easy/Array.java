package category.topinterviewquestions.easy;

import java.util.Arrays;

public class Array {
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





    //Rotate Array
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }






}
