package category.topinterviewquestions.easy;

public class String_ReverseString {
    public static void main(String[] args) {
//        Input: "A man, a plan, a canal: Panama"
//        Output: "amanaP :lanac a ,nalp a ,nam A"
        String s = "A man, a plan, a canal: Panama";
        System.out.println(reverseStringByMe(s));

    }

    public static String reverseStringByMe(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }
        return sb.toString();
    }

    public static String reverseStringByAnswer(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
}
