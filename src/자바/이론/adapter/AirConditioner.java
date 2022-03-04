package 자바.이론.adapter;

public class AirConditioner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("에어컨 220V on");
    }
}
