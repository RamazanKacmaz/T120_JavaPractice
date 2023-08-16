package practice_day08;

public class Product {
    String urunAdi ;
    int fiati;
    int stokAdedi;

    public Product(String urunAdi, int fiati, int stokAdedi) {
        this.urunAdi = urunAdi;
        this.fiati = fiati;
        this.stokAdedi = stokAdedi;
        display();
    }

    private void display() {
        System.out.println("Urunun ADi : " + urunAdi+ ", Urun Fiati: "+ fiati + ", Stok Adedi : " + stokAdedi);
    }

    public static void main(String[] args) {
        Product yeni = new Product("Labtop ",4000,15);
    }
}
