package 자바.이론.입출력스트림;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("input.txt")){
            int i;
            while ( (i = fis.read()) != -1) {
                System.out.println((char)i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
