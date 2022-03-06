package 자바.이론.디자인패턴.adapter.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
