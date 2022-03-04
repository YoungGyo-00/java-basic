package 자바.이론.adapter;

public class Main {
    public static void main(String[] args) {

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner);
        connect(adapter);
    }

    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}
