package category.topinterviewquestions.easy;

public class Math_CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimesByAnswer(10));

    }

    public static int countPrimesByAnswer(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++ ) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return count;
    }
}
