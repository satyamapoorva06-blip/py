import java.util.concurrent.CountDownLatch;

class Foo {
    CountDownLatch a= new CountDownLatch(1);
    CountDownLatch b= new CountDownLatch(1);

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        a.countDown();
    }
    public void second(Runnable printSecond) throws InterruptedException {
        a.await();
        printSecond.run();
        b.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
        b.await();
        printThird.run();
    }
}