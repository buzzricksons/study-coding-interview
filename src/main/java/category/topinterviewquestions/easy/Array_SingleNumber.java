package category.topinterviewquestions.easy;

public class Array_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,2,1,3};//1
        System.out.println(singleNumberByMe2(nums));


    }
    public static int singleNumberByMe1(int[] nums) {
        int[] temp = nums.clone();

        for(int i=0; i < nums.length; i++) {
            int n = 0;
            for (int j=0; j < nums.length; j++) {
                if (nums[i] == temp[j]) {
                    n++;
                }
            }
            if (n != 2) {
                return nums[i];
            }
        }
        throw new IllegalArgumentException();
    }

    public static int singleNumberByMe2(int[] nums) {

        return 0;
    }


}
