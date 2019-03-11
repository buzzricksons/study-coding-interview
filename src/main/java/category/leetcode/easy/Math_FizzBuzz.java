package category.topinterviewquestions.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 주어진 숫자를 1부터 프린팅 하는데 3의 배수는 Fizz, 5의 배수는 Buzz, 15의 배수는 FizzBuzz를 출력
 */
public class Math_FizzBuzz {
    public static void main(String[] args) {
        System.out.println(String.join(", ", fizzBuzzByMe(15)));

    }

    public static List<String> fizzBuzzByMe(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i % 15 == 0 ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i));
        }
        return list;
    }
    public static List<String> fizzBuzzByAnswer(int n) {
        List<String> ret = new ArrayList<String>(n);
        for(int i=1,fizz=0,buzz=0;i<=n ;i++){
            fizz++;
            buzz++;
            if(fizz==3 && buzz==5){
                ret.add("FizzBuzz");
                fizz=0;
                buzz=0;
            }else if(fizz==3){
                ret.add("Fizz");
                fizz=0;
            }else if(buzz==5){
                ret.add("Buzz");
                buzz=0;
            }else{
                ret.add(String.valueOf(i));
            }
        }
        return ret;
    }

}
