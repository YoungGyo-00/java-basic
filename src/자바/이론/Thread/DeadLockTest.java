package 자바.이론.Thread;

public class DeadLockTest {

    public static Object obj1 = new Object();
    public static Object obj2 = new Object();

    public static void main(String[] args) {
        FirstThread thread1 = new FirstThread();
        SecondThread thread2 = new SecondThread();

        thread1.start();
        thread2.start();
    }

    private static class FirstThread extends Thread{
        @Override
        public void run(){
            synchronized (obj1) {
                System.out.println("First Thread has object1's lock");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("First Thread want to have object2's lock so wait");

                synchronized (obj2) {
                    System.out.println("First Thread has object2's lock too");
                }
            }
        }
    }

    private static class SecondThread extends Thread{
        @Override
        public void run(){
            synchronized (obj1) {
                System.out.println("Second Thread has object1's lock");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Second Thread want to have object2's lock so wait");

                synchronized (obj2) {
                    System.out.println("Second Thread has object2's lock too");
                }
            }
        }
    }
}
