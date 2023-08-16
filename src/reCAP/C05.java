package reCAP;

import java.util.Scanner;

public class C05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("sifre olustur");
        System.out.println("sifre icinde en ay bir adet buyuk harf kucukharf rakam özel karakterler olamlidir");

        String sifre = scanner.next();
        int sayacBK = 0;
        int sayacKH = 0;
        int sayacRK = 0;
        int sayac0Kr = 0;

        boolean pass = true;

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                sayacBK++;
                pass = false;
            } else if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                sayacKH++;
                pass = false;
            } else if (sifre.charAt(i) >= '0' && sifre.charAt(i) <= '9') {
                sayac0Kr++;
            } else if (sifre.charAt(i) >= '!' && sifre.charAt(i) <= '/') {
                sayac0Kr++;
                pass = false;
            } else {
                System.out.println("kdlksdsds");
                break;

            }
        }
        if (sifre.length() < 8) {
            System.out.println("sifre 8 krakterli olmalisir");
        }

        if (sayacBK == 0) {
            System.out.println("sifrenz buyuk harf olamli");
        }

        if (sayacKH == 0) {
            System.out.println("kucuk harf olmali");

        }
        if (sayac0Kr == 0) {
            System.out.println("krakter olmai");
        }

        if (pass) {
            System.out.println("basarili");
        }
    }
}
