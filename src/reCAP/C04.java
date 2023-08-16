package reCAP;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ondalik sayi");
        double sayi1 = scanner.nextDouble();
        System.out.println("ondlaik sayi2");
        double sayi2 = scanner.nextDouble();

        double sonuc = sayi1/sayi2;
        System.out.println((int) sonuc);
    }
}
