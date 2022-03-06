package 자바.이론.디자인패턴.adapter;

public class HairDryer implements Electronic110V{

    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110v On");
    }
}
