package practice_day07;

public class C01_multiDimensional {
    public static void main(String[] args) {
        /*
    Bir okulun öğrencilerinin matematik sınav notlarını saklamak için
    bir program yapmanız gerekmektedir. Her öğrenci için
    iki dönemlik (örneğin, ilk ve ikinci dönem) sınav notlarını saklamak için
    kullanmanız gerekmektedir. öğrencilere ait notları ve yıl ortalamasını hesaplayan
    Java programını yazınız:*/

        int [][] sinavNotlari = {
                {80,100},
                {75,90},
                {100,100},
                {60,60},
                {30,90}

        };

        for (int i = 0; i <sinavNotlari.length ; i++) {
            int ilkdonemnotu = sinavNotlari[i][0];
            int ikincidonemnotlari = sinavNotlari[i][1];
            System.out.println(i+1 + " . ogrenci notlari");
            System.out.println("Birinci donmem notu : " + ilkdonemnotu);
            System.out.println("Ikinci donem notu: " + ikincidonemnotlari );

            double yilsonuNotu = (ikincidonemnotlari+ilkdonemnotu)/2.0;
            System.out.println("yil sonu sotlasmi " + yilsonuNotu);
            System.out.println("_----------------------------------------");
        }

    }
}
