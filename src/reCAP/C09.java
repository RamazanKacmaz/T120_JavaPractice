package reCAP;

import java.util.Arrays;
import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        arrayolustur();



    }

    private static void arrayolustur() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("arr boyutu girniiz");
        int lengt = scanner.nextInt();

        int [] array = new int[lengt];

        for (int i = 0; i <lengt ; i++) {
            System.out.println("tam sayi gitr");
            array[i] = scanner.nextInt();

        }
        System.out.println(Arrays.toString(array));

    }

}
