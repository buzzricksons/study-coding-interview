package category.topinterviewquestions.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Array_RotateArray {
    public static void main(String[] args) {
        //[7,1,2,3,4,5,6]
        //[6,7,1,2,3,4,5]
        //[5,6,7,1,2,3,4]
        int[] param = new int[]{1,2,3,4,5,6,7};
        rotateByMe1(param, 3);
        rotateByMe2(param, 3);
        rotateByMe3(param, 3);
        rotateByMe4(param, 3);
        rotate(param, 3);

    }

    public static void rotateByMe1(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < nums.length; j++) {
                result[j != nums.length - 1 ? j + 1 : 0] = nums[j];
            }
            nums = result.clone();
        }
        nums = result;
        System.out.println("array: " + Arrays.toString(nums));
    }

    public static void rotateByMe2(int[] nums, int k) {
        int[] result = nums.clone();
        for (int i = 1; i <= k; i++) {
            for (int j = 0;j < result.length ;j++) {
                if (j != result.length - 1) {
                    nums[j + 1] = result[j];
                } else {
                    nums[0] = result[result.length - 1];
                }
            }
            result = nums.clone();
        }
        System.out.println("array: "+Arrays.toString(nums));
    }

    public static void rotateByMe3(int[] nums, int k) {
        if (k == nums.length) return;
        if (k > nums.length) {
            k %= nums.length;
        }
        int[] result = nums.clone();
        for (int i = 0, j = 0; i < nums.length; i++) {
            if (i + k < nums.length) {
                nums[i + k] = result[i];
            } else {
                nums[j++] = result[i];
            }
        }
        System.out.println("array: "+Arrays.toString(nums));
    }

    public static void rotateByMe4(int[] nums, int k) {//Java 8
        List<Integer> temp = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.rotate(temp, k);
        nums = temp.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("array: "+Arrays.toString(nums));
    }


    //From Answer
    //O(1)
    public static void rotate(int[] nums, int k) { // k = 2
        k %= nums.length;
        // {0,1,2,3,4}

        reverse(nums, 0, nums.length - 1); // Reverse the whole Array
        // {4,3,2,1,0}

        reverse(nums, 0, k - 1); // Reverse first part (4,3 -> 3,4)
        // {3,4,2,1,0}

        reverse(nums, k, nums.length - 1); //Reverse second part (2,1,0 -> 0,1,2)
        // {3,4,0,1,2}
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
