package practice_day06;

import java.util.Scanner;

public class Kacmaz_Market {

    static Scanner scan = new Scanner(System.in);
    static String urunAdi;
    static double urunFiati;
    static double urunMiktari;
    static int urunKodu;
    static String sepet = "";
    static double toplam;
    static boolean ekUrun = false;

    public static void main(String[] args) {
        girisEkrani();

    }

    private static void girisEkrani() {
        System.out.println("===================== Kacmaz_Market =====================");
        System.out.println("=====================  Willkommen  ======================");
        System.out.println("---------------------     Menü    ------------------------");
        System.out.println(" Lütfen alisveris yapmak istediginiz Reyonu seciniz  ");
        System.out.println("1 - Sarkuteri  \n2- Manav  \n3- Market  \n4 - Fis Yazdir \n5- Cikis");

        int secim = scan.nextInt();
        if (secim < 1 || secim > 5) {
            System.out.println("Uyari : Gecersiz bir tusa bastiniz. Tekrar giriniz ");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:

            }
        }

    }

    private static void cikis() {
        System.exit(0);
    }

    private static void fisYazdir() {
        System.out.println("===================== Kacmaz_Market =====================");
        System.out.println("====== Bizi tercih ettiginiz icin tesekkur ederiz...  ======");
        System.out.println("--------------------- Alisveris Bilgileriniz    ------------------------");
        System.out.println("\n  \n");
        System.out.println("Alisversi Listeniz \n" + sepet );
        System.out.println(" ");
        System.out.println("Toplam Tutar : " + toplam);
        System.out.println("\n  \n");
        System.out.println("------------      İyi Günler Dileriz         --------------");
        System.out.println("ana menüye dönmek için 0 tuşuna basınız. Çıkış yapmak için 5 tuşuna basınız");
        urunKodu = scan.nextInt();
        if (urunKodu == 0){
            girisEkrani();
        } else if (urunKodu == 5) {
            cikis();
        }

    }

    private static void market() {
        System.out.println("Market reyonuna hosgeldiniz..");
        System.out.println("Lutfen almak istediginiz urun numarasini giriniz. \n81- Nutella - 103$ \n82 - Ekmet - 8$ \n83- Yumurta 76$ \n84- Yogurt - 29$ ");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 81 && urunKodu <= 84) {
                System.out.println("Kac kg alacaksiniz ??? ");
                urunMiktari = scan.nextDouble();
                switch (urunKodu) {
                    case 81:
                        urunAdi = "Nutella";
                        urunFiati = 103;
                        break;
                    case 82:
                        urunAdi = "Ekmek";
                        urunFiati = 8;
                        break;
                    case 83:
                        urunAdi = "Yumurta";
                        urunFiati = 76;
                        break;
                    case 84:
                        urunAdi = "Yogurt";
                        urunFiati = 29;
                        break;

                }
                System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiati * urunMiktari) + " $ ");
                urunFiati = urunMiktari * urunFiati;
                toplam += urunFiati;
                System.out.println("olusan sepet tutari : " + toplam);
                sepet += urunAdi + ": " + urunFiati + "\n";
                System.out.println("Baska bir urun eklemek isterseniz urun kodunu girinz. \nAna menuye donmek icin 0 tusuna basiniz");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

    private static void manav() {
        System.out.println("Manav reyonuna hosgeldiniz..");
        System.out.println("Lutfen almak istediginiz urun numarasini giriniz. \n71- Muz - 60$ \n72 - Patetes - 25$ \n73- Elma - 49$ \n74- Sogan 20$ \n75- Domates - 39$  \n76- Ananas - 59$ ");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 71 && urunKodu <= 76) {
                System.out.println("Kac kg alacaksiniz ??? ");
                urunMiktari = scan.nextDouble();
                switch (urunKodu) {
                    case 71:
                        urunAdi = "Muz";
                        urunFiati = 60;
                        break;
                    case 72:
                        urunAdi = "Patetes";
                        urunFiati = 25;
                        break;
                    case 73:
                        urunAdi = "Elma";
                        urunFiati = 49;
                        break;
                    case 74:
                        urunAdi = "Sogan";
                        urunFiati = 20;
                        break;
                    case 75:
                        urunAdi = "Domates";
                        urunFiati = 39;
                        break;
                    case 76:
                        urunAdi = "Ananas";
                        urunFiati = 59;
                        break;

                }
                System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiati * urunMiktari) + " $ ");
                urunFiati = urunMiktari * urunFiati;
                toplam += urunFiati;
                System.out.println("olusan sepet tutari : " + toplam);
                sepet += urunAdi + ": " + urunFiati + "\n";
                System.out.println("Baska bir urun eklemek isterseniz urun kodunu girinz. \nAna menuye donmek icin 0 tusuna basiniz");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }

    }

    private static void sarkuteri () {
        System.out.println("Sarkuteri reyonuna hosgeldiniz..");
        System.out.println("Lutfen almak istediginiz urun numarasini giriniz. \n61- Kasar Peyniri 130$ \n62 - Zeytin 120$ \n63- Sucuk 300$ \n64- Kiyma 350$ ");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 61 && urunKodu <= 64) {
                System.out.println("Kac kg alacaksiniz ??? ");
                urunMiktari = scan.nextDouble();
                switch (urunKodu) {
                    case 61:
                        urunAdi = "Kasar Peyniri";
                        urunFiati = 130;
                        break;
                    case 62:
                        urunAdi = "Zeytin";
                        urunFiati = 120;
                        break;
                    case 63:
                        urunAdi = "Sucuk";
                        urunFiati = 300;
                        break;
                    case 64:
                        urunAdi = "Kiyma";
                        urunFiati = 350;
                        break;

                }
                System.out.println(urunMiktari + " kg " + urunAdi + " : " + (urunFiati * urunMiktari) + " $ ");
                urunFiati = urunMiktari * urunFiati;
                toplam += urunFiati;
                System.out.println("olusan sepet tutari : " + toplam);
                sepet += urunAdi + ": " + urunFiati + "\n";
                System.out.println("Baska bir urun eklemek isterseniz urun kodunu girinz. \nAna menuye donmek icin 0 tusuna basiniz");
            } else if (urunKodu == 0) {
                girisEkrani();
            }
        }
    }

}