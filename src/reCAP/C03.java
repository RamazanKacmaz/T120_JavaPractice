package reCAP;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("uc basamakli sayi");
        int sayi = scanner.nextInt();

        int birlerbas = sayi%10;
        sayi/=10;
        int onlarbas = sayi%10;
        sayi/=10;
        int yuzlerbas = sayi%10;

        System.out.println("Birler  " + birlerbas + " onlar " + onlarbas + " yuzler " + yuzlerbas) ;

    }
}
