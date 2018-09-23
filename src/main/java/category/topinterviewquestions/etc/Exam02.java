package category.topinterviewquestions.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exam02 {
    private static int[] nums;
    public static void main (String[] args) throws java.lang.Exception {
        for(;;) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] str = br.readLine().split("\\s+");
            int target = Integer.parseInt(str[0]);

            if (nums == null) {
                nums = new int[str.length];
                for (int i =0; i <str.length; i++)
                nums[i] = Integer.parseInt(str[i]);
            } else {
                for (int i = 0; i < nums.length; i++) {//O(n^2)
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] + nums[j] == target) {
                            System.out.println(Arrays.toString(new int[]{nums[i], nums[j]}));
                            return;
                        }
                    }
                }
                System.out.println("-1");
            }

//            Map<Integer, Integer> map = new HashMap<>();
//            for (int i = 0; i < nums.length; i++) {//O(n)
//                if (map.containsKey(target - nums[i])) {
//                    System.out.println(Arrays.toString(new int[]{map.get(target - nums[i]), i + 1}));
//                } else {
//                    map.put(nums[i], i + 1);
//                }
//            }
//            System.out.println("-1");

        }
    }
}
