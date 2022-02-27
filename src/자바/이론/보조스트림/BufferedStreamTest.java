package 자바.이론.보조스트림;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) {

        long millisecond = 0;
        try(FileInputStream fis = new FileInputStream("a.zip");
                        FileOutputStream fos = new FileOutputStream("copy.zip");
                        BufferedInputStream bis = new BufferedInputStream(fis);
                        BufferedOutputStream bos = new BufferedOutputStream(fos)){
            millisecond = System.currentTimeMillis();

            int i;
            while(( i = bis.read()) != -1) {
                bos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        };

        System.out.println(millisecond);
    }
}
