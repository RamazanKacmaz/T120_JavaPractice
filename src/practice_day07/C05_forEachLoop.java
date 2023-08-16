package practice_day07;

import java.util.ArrayList;
import java.util.List;

public class C05_forEachLoop {
    public static void main(String[] args) {

        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("armut");
        meyveler.add("kiraz");
        System.out.println(meyveler);

        for (String each:meyveler
        ) {
            System.out.println(each.toUpperCase());
        }
    }
}
