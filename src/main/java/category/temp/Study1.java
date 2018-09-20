package category.temp;

public class Study1 {
    public static void main(String[] args) {

        System.out.println(solutionB( new int[]{1, 3, 6, 4, 1, 2}));


    }

    public static int solutionA(int[] A) {
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.


        int B[] = new int[100000];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                B[A[i]-1] = -1;
            }
        }

        for (int j = 0; j < B.length; j++) {
            if (B[j] >= 0) {
                return j+1;
            }
        }

        return -1;
    }

    public static int solutionB(int[] A) {
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.


        int B[] = new int[100000];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                B[A[i]-1] = 1;
            }
            while (B[index] > 0) {
                index++;
            }
        }
        return index == 0 ? 1 : index+1;
    }
}
