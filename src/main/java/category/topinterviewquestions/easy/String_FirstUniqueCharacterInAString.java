package category.topinterviewquestions.easy;

/**
 * 주어진 문자열에서 요소가 한개밖에 문자중에 첫번째를 구하라
 *
 */
public class String_FirstUniqueCharacterInAString {
    public static void main(String[] args) {
//        s = "leetcode"
//        return 0.
//
//        s = "loveleetcode",
//        return 2.
        String s = "aadadaad";
        System.out.println(firstUniqCharByMe(s));
    }
    public static int firstUniqCharByMe(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (s.indexOf(c[i]) == s.lastIndexOf(c[i])) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqCharByAnswer(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
