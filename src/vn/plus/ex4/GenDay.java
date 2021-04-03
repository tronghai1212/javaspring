package vn.plus.ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class GenDay extends Thread {
    @Override
    public void run() {
        while (true) {
            if (Bai4.flag == false) {
                Random random = new Random();
                int index = random.nextInt(7);
                Set keys = Bai4.map.keySet();
                List<String> list = new ArrayList<>(keys);
                Bai4.key = list.get(index);
                System.out.println("Gen: " + Bai4.key );
                Bai4.flag = true;
            }
        }
    }
}
