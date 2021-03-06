package category.topinterviewquestions.easy;

/**
 * 3으로 나누었을때 나머지가 0이되는 수인지의 참,거짓
 */
public class Math_PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThreeByAnswer1(45));

    }
    public static boolean isPowerOfThreeByAnswer1(int n) {
        if (n > 1) {
            while (n % 3 == 0) {
                n /= 3;
            }
        }
        return n == 1;
    }
    public static boolean isPowerOfThreeByAnswer2(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }
}
