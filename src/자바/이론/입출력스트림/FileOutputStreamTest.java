package 자바.이론.입출력스트림;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("output.txt")){
            fos.write(65);
            fos.write(66);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
