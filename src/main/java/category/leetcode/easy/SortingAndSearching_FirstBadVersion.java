package category.topinterviewquestions.easy;

/**
 * 첫번째 배드 버전을 찾아라.
 *
 */
public class SortingAndSearching_FirstBadVersion {
    public static void main(String[] args) {
//        Given n = 5, and version = 4 is the first bad version.
//
//        call isBadVersion(3) -> false
//        call isBadVersion(5) -> true
//        call isBadVersion(4) -> true
//
//        Then 4 is the first bad version.
                System.out.println(firstBadVersionByAnswer(2));

    }

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public static int firstBadVersionByAnswer(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }


    private static boolean isBadVersion(int n) {
        return n >= 2 ;
    }

}
