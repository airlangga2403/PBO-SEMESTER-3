package Tugas2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowroomJaya {
    private static final ArrayList<Mobil> arrMobil = new ArrayList<>();
    private static final Scanner s = new Scanner(System.in);
    private static final Scanner scanner = new Scanner(System.in);


    // Comparing Data Object
    public static Mobil getMerkMobilArr(String cek){
        Mobil cekData = null;
        for (Mobil data: arrMobil) {
            // Now you have the product. Just get the Id
            if (cek.equalsIgnoreCase(data.getMerk())) {
                cekData = data;
            }
        }
        return cekData;
    }

    public static void tambahMobil(){
        System.out.print("Merk Mobil: ");
        String merk = s.nextLine();
        System.out.print("Harga Mobil: ");
        double harga = scanner.nextDouble();
        System.out.print("Tahun Keluaran: ");
        String tahunKeluaran = scanner.next();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();

        Mobil data = new Mobil(merk,tahunKeluaran,stock,harga);
        arrMobil.add(data);
        System.out.println("Data berhasil ditambahkan!");
        main(null);
    }

    public static void beliMobil(){
        System.out.print("Merk Mobil: ");
        String merk = s.nextLine();
        Mobil beliMobil = getMerkMobilArr(merk);

        if (beliMobil == null){
            System.out.println("Merk Mobil tidak ditemukan!");
            beliMobil();
        }
        System.out.print("Jumlah Pembelian: ");
        int jumlahBeli = scanner.nextInt();

        if (jumlahBeli > beliMobil.getStok()){
            System.out.println("Stock Kendaraan tidak mencukupi!");
            main(null);
        }

        double totalHarga;
        double diskon = 0;
        double totalDiskon;
        double totalBayar;

        totalHarga = jumlahBeli * beliMobil.getHarga();
        if (jumlahBeli == 2){
            diskon = 10;
        } else if (jumlahBeli > 2){
            diskon = 20;
        }
        totalDiskon = (totalHarga * diskon) / 100;
        totalBayar = totalHarga - totalDiskon;

        System.out.println("Merk:" + beliMobil.getMerk());
        System.out.println("Harga Satuan:" + beliMobil.getHarga());
        System.out.println("Tahun Keluaran:" + beliMobil.getTahunKeluaran());
        System.out.println("Jumlah Beli:" + jumlahBeli);
        System.out.println("Total Harga:" + totalHarga);
        System.out.println("Diskon:" + diskon);
        System.out.println("Total Diskon:" + totalDiskon);
        System.out.println("Total Bayar:" + totalBayar);
        beliMobil.setStok(beliMobil.getStok() - jumlahBeli);
        main(null);
    }


    public static void viewStock(){
        for (Mobil mobil : arrMobil) {
            mobil.displayInfo();
        }
        main(null);
    }

    public static void main(String[] args) {
        System.out.println("-------------");
        System.out.println("1. Tambah Mobil");
        System.out.println("2. Beli Mobil");
        System.out.println("3. Lihat Stock");
        System.out.println("4. Keluar");
        System.out.print("Pilihan: ");
        int pilih = scanner.nextInt();

        switch (pilih){
            case 1:
                tambahMobil();
                break;
            case 2:
                beliMobil();
                break;
            case 3:
                viewStock();
                break;
            case 4:
                return;
            default:
                System.out.println("Anda memasukkan pilihan yang salah!");
                break;
        }
    }
}