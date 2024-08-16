import java.util.concurrent.atomic.AtomicInteger;

public class DemoIncrement {
  private int x; // 0

  // Solutio 2 - AtomicInteger (for single code)
  private AtomicInteger y = new AtomicInteger(0);

  // Solution 3 - Locked a code block
  private int k;
  private final Object lock = new Object();

// Solution 1 - synchronized method (落閘)
// instance method
public synchronized void increment(){
  // 1000 line of code...
  this.x++;
}
// most useful method

// Solution 3 - lock a code block
public void increment2(){
  this.k++; // multi-thread may access variable k for read/write
  synchronized (lock) { // locked below code, the above is not locked
  this.x++;
  }
}

  public static void main(String[] args) {
    DemoIncrement ball = new DemoIncrement();

    Runnable task = () -> {

      Thread threadInfo = Thread.currentThread(); // call current thread
      System.out.println(threadInfo.getId()); // 15, 16
      System.out.println(threadInfo.getName()); // Thread-1, Thread-0

      for (int i = 0; i < 1_000_000; i++) {
        ball.x++; // by default, x++ support multi thread
      }
    };

    Thread thread1 = new Thread(task);
    Thread thread2 = new Thread(task);

    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println("x=" + ball.x);


    // Solution 1
    ball.x = 0;

    Runnable task2 = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        ball.increment();
      }
    };

    Thread thread3 = new Thread(task2);
    Thread thread4 = new Thread(task2);

    thread3.start();
    thread4.start();
    try {
      thread3.join();
      thread4.join();
    } catch (InterruptedException e) {

    }
    System.out.println("x2=" + ball.x);
    //

    // Solution 2
    Runnable task3 = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        ball.y.incrementAndGet(); // similar to y++, revise itself. Thread-safe
      }
    };

    Thread thread5 = new Thread(task3);
    Thread thread6 = new Thread(task3);

    thread5.start();
    thread6.start();
    try {
      thread5.join();
      thread6.join();
    } catch (InterruptedException e) {

    }
    System.out.println("y3=" + ball.y.get());
    //

    // Solution 3
    ball.x = 0;

    Runnable task4 = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        ball.increment2();
      }
    };

    Thread thread7 = new Thread(task4);
    Thread thread8 = new Thread(task4);

    thread7.start();
    thread8.start();
    try {
      thread7.join();
      thread8.join();
    } catch (InterruptedException e) {

    }
    System.out.println("k5=" + ball.k);
    System.out.println("x4=" + ball.x);
    //

    System.out.println("Program ends ...");






  }
}
