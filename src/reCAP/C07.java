package reCAP;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir harf");
        char harf = scanner.next().charAt(0);

        System.out.println("sonraki harfler   "  + ((char) (harf+1)) + ", " + ((char) (harf+2)) +"," + ((char) (harf+3)) );

    }
}
