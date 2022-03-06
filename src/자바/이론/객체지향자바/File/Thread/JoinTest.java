package 자바.이론.객체지향자바.File.Thread;

public class JoinTest extends Thread{

    int start;
    int end;
    int total;

    public JoinTest(int start, int end){
        this.start = start;
        this.end = end;
    }

    public void run(){
        int i;
        for(i = start; i <= end; i++){
            total += i;
        }
    }

    public static void main(String[] args) {

        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        try {
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int lastTotal = jt1.total + jt2.total;
        System.out.println(lastTotal);
    }

}
