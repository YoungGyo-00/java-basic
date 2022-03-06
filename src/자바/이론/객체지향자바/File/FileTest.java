package 자바.이론.객체지향자바.File;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\user\\Desktop\\프로젝트\\newFile.txt");
        file.createNewFile();

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.delete();

    }
}
