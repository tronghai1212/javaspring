package vn.plus.ex4;

import vn.plus.ex3.Bai3;

import java.util.Random;

public class GenDay extends Thread{
    @Override
    public void run() {
        while (true){
            if (Bai4.flag == false){
                Bai4.key = new Random().nextInt(7);
            }
        }
    }
}
