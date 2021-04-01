package vn.plus.ex3;

import javafx.scene.control.CheckBox;
import sun.awt.windows.ThemeReader;

import java.util.Random;

public class Bai3 {
    public static int sleep =2000;
    public static int year;
    public static boolean flag = false;


    public static void main(String[] args) {
        CheckNumber m = new CheckNumber();
        GenNumber m2 = new GenNumber();
        m.start();
        m2.start();

    }
}
class  GenNumber extends Thread{
    @Override
    public void run() {
        while (true){
            if (Bai3.flag == false){
                Random random = new Random();
                Bai3.year = random.nextInt(999) +1000;
                System.out.println("So random la : " +Bai3.year);
                Bai3.flag = true;
                try {
                    Thread.sleep(Bai3.sleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class CheckNumber extends Thread{
    @Override
    public void run() {
        while (true){
            if (Bai3.flag == true){
                if (Bai3.year%4==0 && Bai3.year%100 !=0){
                    System.out.println(Thread.currentThread().getName()
                            +" So " + Bai3.year + " la nam nhuan");
                }
                else {
                    System.out.println("Khong la nam nhuan");
                }
            }
            Bai3.flag = false;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}