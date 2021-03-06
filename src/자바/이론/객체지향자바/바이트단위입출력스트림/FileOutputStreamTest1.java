package 자바.이론.바이트단위입출력스트림;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {
    public static void main(String[] args) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream("output2.txt", true);
        try(fos){
            byte[] bs = new byte[26];
            byte data =65;
            for (int i = 0; i < bs.length; i++){
                bs[i] = data;
                data++;
            }
            fos.write(bs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
