package 자바.이론.Thread;

class PriorityThread extends Thread{

    public void run(){

        int sum = 0;

        Thread t = Thread.currentThread();
        System.out.println(t + "start");

        for(int i = 0; i <= 1000; i++){
            sum += i;
        }

        System.out.println(t.getPriority() + "end");
    }
}

public class PriorityTest {

    public static void main(String[] args) {
        int i;
        for(i= Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++){

            PriorityThread pt = new PriorityThread();
            pt.setPriority(i);
            pt.start();
        }
    }
}
