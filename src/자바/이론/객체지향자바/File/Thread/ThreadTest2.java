package 자바.이론.객체지향자바.File.Thread;

class MyThread2 implements Runnable{


    @Override
    public void run() {
        int i;
        for (i = 0; i < 10; i++){
            System.out.print(i);
        }
    }
}

public class ThreadTest2 {
    public static void main(String[] args) {

        System.out.println("Main start");

        MyThread2 mth = new MyThread2();
        Thread th1 = new Thread(mth);
        th1.start();

        Thread th2 = new Thread(mth);
        th2.start();
    }
}
