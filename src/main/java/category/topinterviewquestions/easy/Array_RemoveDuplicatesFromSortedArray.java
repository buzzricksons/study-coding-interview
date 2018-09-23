package category.topinterviewquestions.easy;

import java.util.Arrays;

/**
 * 오름차순으로 정렬되있는 배열에서 중복된 요소 제거하기
 *
 */
public class Array_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
//        i: 5
        int[] param = new int[]{0,1,2,2,3,4,4 };
        System.out.println("i: "+removeDuplicatesAnswer(param));
        System.out.println("i: "+removeDuplicatesByMe(param));

    }

    public static int removeDuplicatesAnswer(int[] nums) {
        int total = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            if (n > nums[total - 1]) {
                nums[total++] = n;
            }
            System.out.println("array: "+ Arrays.toString(nums));
        }
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
}
