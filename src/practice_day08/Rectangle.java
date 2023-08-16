package practice_day08;

public class Rectangle {
    int uzunluk;
    int genislik;

    public Rectangle(int uzunluk, int genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
        display();
    }

    public Rectangle(int side) {
        this.uzunluk=side;
        this.genislik=side;
        display();
    }

    private void display() {

        if (uzunluk==genislik){
            System.out.println("Kenar uzunlugu " + uzunluk + "(Kare)" );
        }else {
            System.out.println("Uzunluk " + uzunluk + " Genislik " + genislik );
        }
    }

    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle(8,6);
        Rectangle rec2 = new Rectangle(9);
    }
}
