package 자바.이론.문자단위입출력스트림;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {

        try(FileWriter fw = new FileWriter("writer.txt")){
            fw.write('A');
            char buf[] = {'B','C','D','E'};

            fw.write(buf);
            fw.write("안녕하세요. 잘 써지네요");
            fw.write(buf, 1, 2);
            fw.write("65");
            fw.write(65);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
