public class Main {
    public static void main(String[] args) {


//        // objek 1
//        Barang brg1 = new Barang("BRG-001","Tas Guci",1200);
//        Barang brg2 = new Barang("BRG-002","Printer Epson L355",200);
//
//        //objek 2
//        Barang brg3 = new Barang("BRG-003","Koper",150);
//        Barang brg4 = new Barang("BRG-004","Helm",20);

        // Menggunakan Konstruktor 2 Parameter
        Barang brg1 = new Barang("BRG-001","Tas Guci");brg1.setHarga(1200);
        Barang brg2 = new Barang("BRG-002","Printer Epson L355");brg2.setHarga(200);

        // Menggunakan Konstruktor 3 Parameter
        Barang brg3 = new Barang("BRG-003","Koper",150);
        Barang brg4 = new Barang("BRG-004","Helm",20);

        // tampilkan data
        System.out.println("Membuat Objek dengan Konstruktor 2 Parameter");
        System.out.println("---------------------");
        System.out.println("idProduk" + " | " + "Nama" + " | " + "Harga" + " | ");
        System.out.println("---------------------");
        System.out.println(brg1.getIdProduk() + " | " + brg1.getNama() + " | " + brg1.getHarga() + " | ");
        System.out.println(brg2.getIdProduk() + " | " + brg2.getNama() + " | " + brg2.getHarga() + " | ");

        System.out.println(" "); // enter line

        System.out.println("Membuat Objek dengan Konstruktor 3 Parameter");
        System.out.println("---------------------");
        System.out.println("idProduk" + " | " + "Nama" + " | " + "Harga" + " | ");
        System.out.println("---------------------");
        System.out.println(brg3.getIdProduk() + " | " + brg3.getNama() + " | " + brg3.getHarga() + " | ");
        System.out.println(brg4.getIdProduk() + " | " + brg4.getNama() + " | " + brg4.getHarga() + " | ");





    }
}
