package category.topinterviewquestions.easy;

import java.util.*;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {
        //i: 5
//        int[] param = new int[]{0,1,2,2,3,4,4 };
//        System.out.println("i: "+removeDuplicatesAnswer(param));
//        System.out.println("i: "+removeDuplicatesByMe(param));


        //[7,1,2,3,4,5,6]
        //[6,7,1,2,3,4,5]
        //[5,6,7,1,2,3,4]
//        int[] param = new int[]{1,2,3,4,5,6,7};
//        rotateByMe4(param, 3);



        int[] param1 = new int[]{1,2,3,1};
        int[] param2 = new int[]{1,2,3,4};
        int[] param3 = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicateByMe2(param1));
        System.out.println(containsDuplicateByMe2(param2));
        System.out.println(containsDuplicateByMe2(param3));





    }

    //Remove Duplicates from Sorted Array------------------------------------------
    //O(n)
    public static int removeDuplicatesAnswer(int[] nums) {
        int total = nums.length > 0 ? 1 : 0;
        for (int n : nums) {
            if (n > nums[total - 1]) {
                nums[total++] = n;
            }
        System.out.println("array: "+Arrays.toString(nums));
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
    //------------------------------------------------------------------------------------





    //Rotate Array------------------------------------------------------------------------
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
    public void rotate(int[] nums, int k) { // k = 2
        k %= nums.length;
        // {0,1,2,3,4}

        reverse(nums, 0, nums.length - 1); // Reverse the whole Array
        // {4,3,2,1,0}

        reverse(nums, 0, k - 1); // Reverse first part (4,3 -> 3,4)
        // {3,4,2,1,0}

        reverse(nums, k, nums.length - 1); //Reverse second part (2,1,0 -> 0,1,2)
        // {3,4,0,1,2}
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
    //------------------------------------------------------------------------------------


    //Contains DuplicateContains Duplicate
    public static boolean containsDuplicateByMe1(int[] nums) {
        for (int i=0; i < nums.length; i++) {
            for (int j=0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicateByMe2(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (int n : nums) {
            if (!temp.add(n)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateByMe3(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        return Arrays.stream(nums).filter(n -> !temp.add(n)).findAny().isPresent();
    }
    //------------------------------------------------------------------------------------






















}
