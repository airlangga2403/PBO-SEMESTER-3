package Tugas1;

public class Main {
    public static void main(String[] args) {

//        1. Nama penjual
//        2. Alamat penjual
//        3. Nama pembeli
//        4. Alamat pembeli
//        5. Ongkos Kirim
//        6. Nama ekspedisi
//        7. No resi

//        Struktur konstruktor overloading harus dapat memfasilitasi
//        1. Data utama saja
//        2. Data utama + data asuransi
//        3. Data utama + data dropshipper
//        4. Data utama + data asuransi + data dropshipper

        // Data utama + Asuransi + Dropshipper Transaksi 1
        PengirimBarang.Batas();
        PengirimBarang barang1 = new PengirimBarang("Eiger","Bandung Kopo","Bejo",
                "DayeuhKolot",  21000.0,"JNE",
                "N0001","40000.0","DropShip1","Surabaya");

        System.out.println("No Transaksi : 1");
        System.out.println("No Resi : " + barang1.getNoResi());
        System.out.println("Nama Ekspedisi : " + barang1.getNamaEkspedisi());
        System.out.println("Ongkos Kirim : " + barang1.getOngkosKirim());
        System.out.println("Nama Penjual : " + barang1.getNamaPenjual());
        System.out.println("Alamat Penjual : " + barang1.getAlamatPenjual());
        System.out.println("Nama Pembeli : " + barang1.getNamaPembeli());
        System.out.println("Alamat Pembeli : " + barang1.getAlamatPembeli());
        System.out.println("Nama DropShipper : " + barang1.getNamaDropShipper());
        System.out.println("Alamat DropShipper : " + barang1.getAlamatDropShipper());
        System.out.println("Status Asuransi : " + barang1.getStatusAsuransi());
        System.out.println("Status DropShip : " + barang1.getStatusDropShip());
        PengirimBarang.Batas();



        // Data utama saja + Asuransi 2
        PengirimBarang barang2 = new PengirimBarang("Eiger","Bandung Kopo","Tini",
                "DayeuhKolot",  50000.0,"J&T","N0003","40000.0");

        System.out.println("No Transaksi : 2");
        System.out.println("No Resi : " + barang2.getNoResi());
        System.out.println("Nama Ekspedisi : " + barang2.getNamaEkspedisi());
        System.out.println("Ongkos Kirim : " + barang2.getOngkosKirim());
        System.out.println("Nama Penjual : " + barang2.getNamaPenjual());
        System.out.println("Alamat Penjual : " + barang2.getAlamatPenjual());
        System.out.println("Nama Pembeli : " + barang2.getNamaPembeli());
        System.out.println("Alamat Pembeli : " + barang2.getAlamatPembeli());
        System.out.println("Nama DropShipper : " + barang2.getNamaDropShipper());
        System.out.println("Alamat DropShipper : " + barang2.getAlamatDropShipper());
        System.out.println("Status Asuransi : " + barang2.getStatusAsuransi());
        System.out.println("Status DropShip : " + barang2.getStatusDropShip());
        PengirimBarang.Batas();


        // Data utama saja Transaksi 3
        PengirimBarang barang3 = new PengirimBarang("Eiger","Bandung Kopo","Bambang","DayeuhKolot", 23000,"Pos Indonesia","N0004");
        System.out.println("No Transaksi : 3");
        System.out.println("No Resi : " + barang3.getNoResi());
        System.out.println("Nama Ekspedisi : " + barang3.getNamaEkspedisi());
        System.out.println("Ongkos Kirim : " + barang3.getOngkosKirim());
        System.out.println("Nama Penjual : " + barang3.getNamaPenjual());
        System.out.println("Alamat Penjual : " + barang3.getAlamatPenjual());
        System.out.println("Nama Pembeli : " + barang3.getNamaPembeli());
        System.out.println("Alamat Pembeli : " + barang3.getAlamatPembeli());
        System.out.println("Nama DropShipper : " + barang3.getNamaDropShipper());
        System.out.println("Alamat DropShipper : " + barang3.getAlamatDropShipper());
        System.out.println("Status Asuransi : " + barang3.getStatusAsuransi());
        System.out.println("Status DropShip : " + barang3.getStatusDropShip());
        PengirimBarang.Batas();

        // Data utama saja + DrpShipper Transaksi 4
        PengirimBarang barang4 = new PengirimBarang("Joko","Bandung Kopo","Bambang",
                "DayeuhKolot",  24000.0,"siCepat","N0002","Dropship2","Pontianak");
        System.out.println("No Transaksi : 4");
        System.out.println("No Resi : " + barang4.getNoResi());
        System.out.println("Nama Ekspedisi : " + barang4.getNamaEkspedisi());
        System.out.println("Ongkos Kirim : " + barang4.getOngkosKirim());
        System.out.println("Nama Penjual : " + barang4.getNamaPenjual());
        System.out.println("Alamat Penjual : " + barang4.getAlamatPenjual());
        System.out.println("Nama Pembeli : " + barang4.getNamaPembeli());
        System.out.println("Alamat Pembeli : " + barang4.getAlamatPembeli());
        System.out.println("Nama DropShipper : " + barang4.getNamaDropShipper());
        System.out.println("Alamat DropShipper : " + barang4.getAlamatDropShipper());
        System.out.println("Status Asuransi : " + barang4.getStatusAsuransi());
        System.out.println("Status DropShip : " + barang4.getStatusDropShip());



    }
}
