package category.topinterviewquestions.etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exam01 {
    private static int commandCount = 0;
    private static String[] queue;
    private static int front = -1;
    private static int tail = -1;
    private static int max;
    private static int length = 0;//queueに入っている要素の個数

        //ローカル環境では確認できました。
    public static void main (String[] args) throws java.lang.Exception {
        for(;;) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] s = br.readLine().split("\\s+");
            String param1 = s[0];
            String param2 = s.length > 1 ? s[1] : "";

            if (commandCount == 0 && queue == null) {
                max = Integer.parseInt(param2);
                commandCount = Integer.parseInt(param1);
                queue = new String[max];
            } else if (commandCount == 0) {
                System.out.println("false");
            } else {
                if (param1.equals("OFFER")) {
                    System.out.println(insert(param2));
                } else if (param1.equals("TAKE")) {
                    System.out.println(take());
                } else if (param1.equals("SIZE")) {
                    System.out.println(Integer.toString(length));
                }
                commandCount--;
            }
        }
    }

    private static String take() {
        if (front == -1) {
            return "false";
        }
        String take = queue[front];
        if (front == tail) {
            front = -1;
            tail = -1;
        } else {
            front++;
        }
        length--;
        return take;
    }

    private static String insert(String element) {
        if (tail == -1) {
            front = 0;
            tail = 0;
            queue[tail] = element;
        } else if (tail + 1 >= max) {
            return "false";
        } else if ( tail + 1 < max) {
            queue[++tail] = element;
        }
        length++;
        return "true";
    }
}
