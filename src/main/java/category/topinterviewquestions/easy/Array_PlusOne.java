package category.topinterviewquestions.easy;

public class Array_PlusOne {
    public static void main(String[] args) {
//        Input: [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
        int[] param = {1, 2, 3};


    }
    public static int[] plusOneByMe(int[] digits) {
        if (digits.length == 1){
            int result = digits[0] + 1;
            if (result > 9) {
                return new int[]{1,0};
            } else {
                digits[0] = digits[0] + 1;
                return digits;
            }
        }

        int last = digits[digits.length - 1];
        if (last + 1 > 9) {
            digits[digits.length - 1] = 0;
            for (int i = digits.length - 2;i >=0; i--){
                int result = digits[i] + 1;
                if (result > 9) {
                    digits[i] = 0;
                    if (i == 0) {
                        int[] r = new int[digits.length+1];
                        r[0] = 1;
                        for (int j = 1; i < digits.length;i++) {
                            r[j] = digits[j - 1];
                        }
                        return r;
                    }
                } else {
                    digits[i] = result;
                    break;
                }
            }
        } else {
            digits[digits.length - 1] = last + 1;
        }
        return digits;
    }
}
