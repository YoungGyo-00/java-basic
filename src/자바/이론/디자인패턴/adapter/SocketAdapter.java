package 자바.이론.디자인패턴.adapter;

public class SocketAdapter implements Electronic110V{

    private Electronic220V electronic220V;

    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }

    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
