public class Main {
    public static void main(String[] args) {

        // Create Objek
        Buku buku1 = new Buku("Harry Potter","J.K Rowling",300000);
        Buku buku2 = new Buku("UML","Ivar Jacobson",400000);


        // Tampilkan Data
        System.out.println("Judul" + " | " + "Pengarang" + " | " + "Harga" + " | ");
        System.out.println("---------------------------------------");
        System.out.println(buku1.getJudul() + " | " + buku1.getPengarang() + " | " + buku1.getHarga());
        System.out.println(buku2.getJudul() + " | " + buku2.getPengarang() + " | " + buku2.getHarga());


    }
}
