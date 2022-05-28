public class testThread extends Thread {
    public void run() {
        System.out.println("This code is running in a thread in different class through 'extends'");
    }
}

class testThread1 implements Runnable {
    public void run() {
        System.out.println("Code is also running in a thread");
    }
}