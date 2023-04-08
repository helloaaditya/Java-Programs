class GoodMorning implements Runnable {
   synchronized  public void run() {
        while (true) {
            System.out.println("Good morning");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }
    }
}

class hello implements Runnable {
    synchronized public void run() {
        while (true) {
            System.out.println("Hello");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }
    }
}

class welcome implements Runnable {
   synchronized  public void run() {
        while (true) {
            System.out.println("Welcome");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.print(e);
            }
        }
    }
}

public class program9 {
    public static void main(String[] args) {
        GoodMorning x = new GoodMorning();
        hello y = new hello();
        welcome z = new welcome();
        Thread t1 = new Thread(x, "Thread 1");
        Thread t2 = new Thread(y, "Thread 2");
        Thread t3 = new Thread(z, "Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}