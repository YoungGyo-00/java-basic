package 자바.이론.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){

    }

    public static SocketClient getInstance(){
        if (socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
