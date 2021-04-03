package vn.plus.ex4;

import java.util.HashMap;
import java.util.Map;

public class Bai4 {
    public static Map<String, String> map = new HashMap<>();
    public static boolean flag = false;
    public static String key;
    public static void main(String[] args) {
        map.put("Monday", "thứ 2");
        map.put("Tuesday", "thứ 3");
        map.put("Wednesday", "thứ 4");
        map.put("Thursday", "thứ 5");
        map.put("Friday", "thứ 6");
        map.put("Saturday", "thứ 7");
        map.put("Sunday", "Chủ nhật");

        GenDay m1 = new GenDay();
        CheckDay m2 = new CheckDay();
        m1.start();
        m2.start();
    }
}
