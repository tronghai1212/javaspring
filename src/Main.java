import vn.plus.Mythread;

public class Main {
    public static void main(String[] args) {
        for(int i =0; i<10; i++){
            Mythread mythread = new Mythread(i);
            mythread.start();
        }
    }
}
