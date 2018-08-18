package category.topinterviewquestions.easy;

public class Array_SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,3,2,1,3};//1
        System.out.println(singleNumberByXOR(nums));


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

    public static int singleNumberByXOR(int[] nums) {
//        we use bitwise XOR to solve this problem :
//
//        first , we have to know the bitwise XOR in java
//
//        0 ^ N = N
//        N ^ N = 0
//        So..... if N is the single number
//
//        N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
//
//                = (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
//
//                = 0 ^ 0 ^ ..........^ 0 ^ N
//
//                = N
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
