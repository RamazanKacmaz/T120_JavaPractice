package practice_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class C04_arrayList {
    public static void main(String[] args) {
        // Kullanıcıdan 5 adet sayı alarak bir ArrayList oluşturun.
        // Ardından bu sayıların toplamını hesaplayarak ekrana yazdırın.

        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> sayilar=new ArrayList<>();
        System.out.println("Toplanacak Sayıları giriniz");
        for (int i = 0; i <5 ; i++) {
            System.out.print((i+1)+". Sayı:");
            int sayi= scan.nextInt();
            sayilar.add(sayi);
        }
        int toplam=0;
        for (int sayi:sayilar) {
            toplam+=sayi;
        }
        System.out.println("Sayıların toplamı: "+toplam);

    }
}
