package category.topinterviewquestions.easy;

/**
 * 두개의 스트링 문자열이 전부 같은 문자열로 구성되어 있는지 판단하라
 *
 */
public class Strings_ValidAnagram {
    public static void main(String[] args) {

    }
    public static boolean isAnagramByAnswer(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
