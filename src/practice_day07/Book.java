package practice_day07;

public class Book {


        // Bir "Book" sınıfı oluşturun ve bu sınıfın bir constructor'ı olsun.
        // Bu constructor, kitap adını, yazarını ve yayın yılını alacak şekilde tasarlanmalıdır.
        // Örnek çıktı:
        // Book nesnesi oluşturuldu: "Java Programlama" - Ahmet Bulutluöz (2021)

    String title;
    String yazar ;
    int yayinYil;

        public Book(String title, String yazar , int yayinYil){
            this.title=title;
            this.yazar=yazar;
            this.yayinYil=yayinYil;

        }

    public static void main(String[] args) {
        Book book1 = new Book("Java Proglama" , "Ahmet Bulutluoz" ,2023);
        System.out.println(book1 + "\n");
        Book book2 = new Book("Java Proglama1" , "Ahmet Bulutluoz1" ,2025);
        System.out.println(book2);

    }



}
