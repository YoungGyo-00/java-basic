package 자바.이론.디자인패턴.adapter.singleton;

public class BClazz {
    private SocketClient socketClient;

    public BClazz(){
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
