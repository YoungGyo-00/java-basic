package 자바.이론.바이트단위입출력스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void main(String[] args) {

        try(FileOutputStream fos = new FileOutputStream("output1.txt")) {

            byte[] bs = new byte[26];
            byte data = 65;
            for (int i = 0; i < bs.length; i++){
                bs[i] = data;
                data++;
            }
            fos.write(bs, 2, 10);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
