package category.topinterviewquestions.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Array_TwoSum {
    public static void main(String[] args) {
//        Given nums = [2, 7, 11, 15], target = 9,
//        Because nums[0] + nums[1] = 2 + 7 = 9,
//        return [0, 1].
//        int[] param = new int[]{2, 7, 11, 15};
        int[] param = new int[]{-3, 4, 3, 90};
        System.out.println(Arrays.toString(twoSumByMe1(param, 0)));

    }

    //O(n^2)
    public static int[] twoSumByMe1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException();
    }

    //O(n)
    public static int[] twoSumByAnswer(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
