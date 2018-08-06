package category.topinterviewquestions.easy;

import java.util.Arrays;

public class Array_MoveZeroes {
    public static void main(String[] args) {
        int[] param = {0,1,0,3,12};
        moveZeroes(param);

    }

    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int add = 1;
            while (nums[i] == 0 && i != nums.length - 1 && i + add <= nums.length - 1) {
                int temp = nums[i];
                nums[i] = nums[i + add];
                nums[i + add] = temp;
                add++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
