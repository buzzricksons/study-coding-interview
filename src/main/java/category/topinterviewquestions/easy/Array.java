package category.topinterviewquestions.easy;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //i: 5
        int[] param = new int[]{0,1,2,2,3,4,4 };
        System.out.println("i: "+removeDuplicatesAnswer(param));
        System.out.println("i: "+removeDuplicatesByMe(param));







    }

    //Remove Duplicates from Sorted Array------------------------------------------
    //O(n)
    public static int removeDuplicatesAnswer(int[] nums) {
        int total = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            if (n > nums[total - 1]) {
                nums[total++] = n;
            }
        }
        System.out.println("array: "+Arrays.toString(nums));
        return total;
    }

    public static int removeDuplicatesByMe(int[] nums) {
        int index = 0;
        int total = nums.length !=0 ? 1 : 0;
        for(int i : nums) {
            if (nums[index] < i) {
                nums[++index] = i;
                total++;
            }
        }
        System.out.println("array: "+Arrays.toString(nums));
        return total;
    }
    //------------------------------------------------------------------------------------





    //Rotate Array------------------------------------------------------------------------

































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
