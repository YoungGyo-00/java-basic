package 자바.이론.객체지향자바.File.Thread;

class MyThread extends Thread{
    public void run(){
        int i;
        for (i = 0; i < 200; i++){
            System.out.print(i);
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread());
        MyThread th1 = new MyThread();
        th1.start();

        MyThread th2 = new MyThread();
        th2.start();
    }
}
