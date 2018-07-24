package leetcode.easy;

public class Solution1 {
    public static void main(String[] args) {

    }

    //Remove Duplicates from Sorted Array
    public int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        return i;
    }


}
