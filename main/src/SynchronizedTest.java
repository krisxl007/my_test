
public class SynchronizedTest {
    public void method1(){
        System.out.println(Thread.currentThread().getName() + " :Method 1 start");
        try {
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " :Method 1 execute");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName() + " :Method 1 end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final SynchronizedTest test = new SynchronizedTest();

        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method1();
            }
        }, "T1").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                test.method1();
            }
        }, "T2").start();
    }
}
