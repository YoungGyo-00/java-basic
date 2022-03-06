package 자바.이론.디자인패턴.adapter.decorator;

public class KenyAmericano extends Coffee{


    @Override
    public void brewing() {
        System.out.println("KenyaAmericano");
    }
}
