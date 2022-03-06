package 자바.이론.디자인패턴.adapter.singleton;

public class Main {

    public static void main(String[] args) {

        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.println("두개의 객체가 동인한가?");
        System.out.println(aClient.equals(bClient));
    }
}
