package practice_day07;

import java.util.ArrayList;
import java.util.Scanner;

public class C07_forEachLoop {
    public static void main(String[] args) {
// Kullanıcıdan 5 adet not alarak bir ArrayList oluşturun.
// Bu notların ortalamasını hesaplayarak ekrana yazdırın.
// Örnek çıktı:
// Notların ortalaması: 78.5

        Scanner scan=new Scanner(System.in);
        System.out.println("Sizden istenen not bilgilierini sırayla giriniz");
        ArrayList<Double> notlar=new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            System.out.println((i+1) + " .Dersinizin Notu : ");
            double not = scan.nextDouble();
            notlar.add(not);
        }

        double toplam = 0;
        for (double not:notlar
             ) {
            toplam += not;
        }

        double gano = toplam/notlar.size();

        System.out.println("Genel akademik not ortalamaniz." + gano);


    }
}
