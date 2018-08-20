package category.topinterviewquestions.easy;

public class String_ReverseInteger {
    public static void main(String[] args) {
//        Input: 123
//        Output: 321
//
//        Input: -123
//        Output: -321
//
//        Input: 120
//        Output: 21

        System.out.println(reverseByAnswer(-2403));
    }
    public static int reverseByMe(int x) {
        return 0;
    }

    public static int reverseByAnswer(int x) {
        int result = 0;
        System.out.println("INPUT: "+x);
        while (x != 0) {
            System.out.println("------------------------------------");
            int tail = x % 10;
            System.out.println("result: "+result);
            System.out.println("tail: "+tail);
            int newResult = result * 10 + tail;
            System.out.println("newResult: "+newResult);
            System.out.println("(newResult - tail) / 10 : "+ ((newResult - tail) / 10));
            if ((newResult - tail) / 10 != result){
                return 0;
            }
            result = newResult;
            System.out.println("after result: "+result);
            x = x / 10;
            System.out.println("after x: "+x);
            System.out.println("------------------------------------");
        }
        return result;
    }
}
