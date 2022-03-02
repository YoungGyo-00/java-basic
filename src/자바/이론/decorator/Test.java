package 자바.이론.decorator;

public class Test {
    public static void main(String[] args) {
        Coffee kenyAmericano = new KenyAmericano();
        kenyAmericano.brewing();
        System.out.println();

        Coffee kenyaLette = new Latte(kenyAmericano);
        kenyaLette.brewing();
    }
}
