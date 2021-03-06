package 자바.이론.객체지향자바.File.Thread;

import java.io.IOException;

public class TerminateThread extends Thread{

    private boolean flag = false;
    int i;

    public TerminateThread(String name){
        super(name);
    }

    public void run(){

        while(!flag){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getName() + " end");
    }

    public void setFlag(boolean flag){
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {

        TerminateThread threadA = new TerminateThread("A");
        TerminateThread threadB = new TerminateThread("B");
        TerminateThread threadC = new TerminateThread("C");

        threadA.start();
        threadB.start();
        threadC.start();

        int in;
        while(true){
            in = System.in.read();

            if (in=='A'){
                threadA.setFlag(false);
            } else if (in == 'B') {
                threadB.setFlag(false);
            } else if (in == 'C'){
                threadC.setFlag(false);
            } else if (in == 'M') {
                threadA.setFlag(false);
                threadB.setFlag(false);
                threadC.setFlag(false);
                break;
            } else {
                System.out.println("type again");
            }
        }
        System.out.println("main end");
    }
}
