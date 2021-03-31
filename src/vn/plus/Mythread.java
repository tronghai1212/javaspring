package vn.plus;

public class Mythread extends Thread{
    int STT;

    public Mythread(int STT) {
        this.STT = STT;
    }


    @Override
    public void run() {
        System.out.println("Thread " +STT);
    }
}
