package 자바.이론.객체지향자바.File.reduce함수;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class Comparing implements BinaryOperator<String>{

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) return s1;
        else return s2;
    }
}

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"한글자", "한두글자", "한두세글자"};
        System.out.println(Arrays.stream(greetings).reduce("", (s1, s2)-> {
            if (s1.getBytes().length >= s2.getBytes().length) return s1;
            else return s2;
        }));

        String str = Arrays.stream(greetings).reduce(new Comparing()).get();
        System.out.println(str);
    }
}
