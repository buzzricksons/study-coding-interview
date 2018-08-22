package category.topinterviewquestions.easy;

public class SortingAndSearching_FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(2));

    }

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public static int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }


    private static boolean isBadVersion(int n) {
        return n >= 2 ;
    }

}
