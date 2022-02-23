package 자바.이론.예외처리;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finally 구문은 try 실행 시 무조건 실행됨");
        }
        System.out.println("정상 종료 시 실행");
    }
}
