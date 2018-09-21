package category.topinterviewquestions.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 배열에 중복된 요소가 있는지 체크
 */
public class Array_ContainsDuplicate {
    public static void main(String[] args) {
//        int[] param1 = new int[]{1,2,3,1};
//        int[] param2 = new int[]{1,2,3,4};
//        int[] param3 = new int[]{1,1,1,3,3,4,3,2,4,2};
//        List<int[]> param = List.of(param1, param2, param3);
//        param.stream().forEach(p -> {
//            System.out.println(containsDuplicateByMe1(p));
//            System.out.println(containsDuplicateByMe2(p));
//            System.out.println(containsDuplicateByMe3(p));
//        });
    }

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
}
