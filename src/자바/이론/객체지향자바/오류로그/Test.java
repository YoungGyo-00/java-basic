package 자바.이론.오류로그;

public class Test {
    public static void main(String[] args) {

        MyLogger myLogger = MyLogger.getLogger();

        myLogger.log("test");
    }
}
