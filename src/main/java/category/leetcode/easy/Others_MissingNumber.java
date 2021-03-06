package category.topinterviewquestions.easy;


/**
 * 0부터 N까지의 연속된 숫자가 들어있는 배열에서 중간에 빠진 숫자를 찾아라
 *
 */
public class Others_MissingNumber {
    public static void main(String[] args) {
//        Input: [3,0,1]
//        Output: 2
        int[] array1 = new int[]{2, 0, 1};
        int[] array2 = new int[]{9,6,4,2,3,5,7,0,1};
//
//        Input: [9,6,4,2,3,5,7,0,1]
//        Output: 8
        System.out.println("resutl: "+missingNumberByAnswer(array1));

    }

    public static int missingNumberByAnswer(int[] nums) {
        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(String.format("before: result-%s, i-%s, nums[i]-%s", result, i, nums[i]));
            result = result^i^nums[i];
            System.out.println("after: "+result);
        }
        return result;
    }
}
