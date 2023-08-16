package reCAP;

import java.util.Scanner;

public class C02 {

    public static void main(String[] args) {

        int sayi = 100;
        sayi++;
        System.out.println(sayi);
        sayi += 1 ;
        sayi+=98;

        sayi --;
        sayi -= 1;
        sayi -= 98;


        Scanner scanner = new Scanner(System.in);
        System.out.println("bolunecek saiyii giriniz");
        int bolunen = scanner.nextInt();
        System.out.println("boleceginiz sayiyi girniiz..");
        int bolen = scanner.nextInt();
        int sayac = 0;
        while (bolunen >= bolen){
            bolunen -= bolen;
            sayac++;
        }
        System.out.println(bolunen);
        System.out.println(bolen);
    }
}
