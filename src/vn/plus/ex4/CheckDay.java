package vn.plus.ex4;

import vn.plus.ex3.Bai3;

public class CheckDay extends Thread {

    @Override
    public void run() {
        while (true) {
            if (Bai4.flag == true) {
                String value = Bai4.map.get(Bai4.key);
                System.out.println("Check: " + value);
                Bai4.flag = false;
            }
        }
    }
}
