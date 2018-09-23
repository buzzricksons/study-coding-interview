package category.topinterviewquestions.easy;

import java.util.Arrays;

/**
 * 배열에서 0은 전부 뒤로 보내고 실수는 오름차순으로 정렬
 *
 */
public class Array_MoveZeroes {
    public static void main(String[] args) {
        int[] param = {0,1,0,3,12};
        moveZeroesByMe(param);
        moveZeroesByAnser(param);

    }

    public static void moveZeroesByMe(int[] nums) {
        int noneZeroCount = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[noneZeroCount++] = n;
            }
        }
        while (noneZeroCount < nums.length) {
            nums[noneZeroCount++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesByAnser(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
