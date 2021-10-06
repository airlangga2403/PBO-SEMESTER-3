import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> isbn = new ArrayList<>();
        List<String> judulBuku = new ArrayList<>();
        List<String> pengarang = new ArrayList<>();
        List<String> tahunTerbit = new ArrayList<>();
        List<Integer> harga = new ArrayList<>();
        List<Float> rating = new ArrayList<>();

        Scanner inputUser = new Scanner(System.in);
        Scanner inputUserChange = new Scanner(System.in);
        Scanner inputUserInt = new Scanner(System.in);
        Scanner inputUserChangeInt = new Scanner(System.in);
        Scanner inputPilihan = new Scanner(System.in);

        String inputIsbn;
        String inputJudulBuku;
        String inputPengarang;
        String inputTahunTerbit;
        int inputHarga;
        float inputRating;

        //

        System.out.println("Ini adalah Program input Data Perpus");
        String lanjut;
        lanjut = "Y";
        while (lanjut.equals("Y")) {
            System.out.println("-------------");
            System.out.println("Masukkan ISBN : "); inputIsbn = inputUser.nextLine();
            System.out.println("Masukkan Judul Buku : "); inputJudulBuku = inputUser.nextLine();
            System.out.println("Masukkan Nama Pengarang : "); inputPengarang = inputUser.nextLine();
            System.out.println("Masukkan Tahun Terbit : "); inputTahunTerbit = inputUser.nextLine();
            System.out.println("Masukkan Harga Buku : "); inputHarga = inputUserInt.nextInt();
            System.out.println("Masukkan Rating Buku : "); inputRating = inputUserInt.nextFloat();
            isbn.add(inputIsbn);
            judulBuku.add(inputJudulBuku);
            pengarang.add(inputPengarang);
            tahunTerbit.add(inputTahunTerbit);
            harga.add(inputHarga);
            rating.add(inputRating);
            System.out.println("Lanjut Masukkan Data Buku (Y/N) : "); lanjut = inputPilihan.nextLine().toUpperCase();
        }

        // tampilkan data
        for(int i = 0; i < isbn.size(); i++) {
            System.out.println("ISBN : "+ isbn.get(i));
            System.out.println("Judul Buku :  " + judulBuku.get(i));
            System.out.println("Nama Pengarang : " + pengarang.get(i));
            System.out.println("Tahun Terbit : " + tahunTerbit.get(i));
            System.out.println("Harga Buku : " + harga.get(i));
            System.out.println("Rating Buku : " + rating.get(i));
        }

        // Set Data Kecuali ISBN
        System.out.println("----------\nGanti Data Kecuali Isbn-------");
        System.out.println("Index Ke Berapa Yang Ingin di ganti : ");
        int changeIndex = inputUserChangeInt.nextInt();
        System.out.println("Masukkan Judul Buku : "); inputJudulBuku = inputUserChange.nextLine();
        System.out.println("Masukkan Nama Pengarang : "); inputPengarang = inputUserChange.nextLine();
        System.out.println("Masukkan Tahun Terbit : "); inputTahunTerbit = inputUserChange.nextLine();
        System.out.println("Masukkan Harga Buku : "); inputHarga = inputUserChangeInt.nextInt();
        System.out.println("Masukkan Rating Buku : "); inputRating = inputUserChangeInt.nextFloat();
        judulBuku.set(changeIndex,inputJudulBuku);
        pengarang.set(changeIndex,inputPengarang);
        tahunTerbit.set(changeIndex,inputTahunTerbit);
        harga.set(changeIndex,inputHarga);
        rating.set(changeIndex,inputRating);

        // tampilkan data yang sudah di ubah
        for(int i = 0; i < isbn.size(); i++) {
            System.out.println("ISBN : "+ isbn.get(i));
            System.out.println("Judul Buku :  " + judulBuku.get(i));
            System.out.println("Nama Pengarang : " + pengarang.get(i));
            System.out.println("Tahun Terbit : " + tahunTerbit.get(i));
            System.out.println("Harga Buku : " + harga.get(i));
            System.out.println("Rating Buku : " + rating.get(i));
        }

        // tampilkan salah satu data buku melalui isbn

        System.out.println("Silahkan Masukkan ISBN : "); inputIsbn = inputUser.nextLine();
        for(int i = isbn.indexOf(inputIsbn); i < isbn.size();) {
            System.out.println("ISBN : "+ isbn.get(i));
            System.out.println("Judul Buku :  " + judulBuku.get(i));
            System.out.println("Nama Pengarang : " + pengarang.get(i));
            System.out.println("Tahun Terbit : " + tahunTerbit.get(i));
            System.out.println("Harga Buku : " + harga.get(i));
            System.out.println("Rating Buku : " + rating.get(i));
            break;
        }

        // Delete Data
        for(int i = isbn.indexOf(inputIsbn); i < isbn.size();) {
            System.out.println("ISBN : "+ isbn.remove(i));
            System.out.println("Judul Buku :  " + judulBuku.remove(i));
            System.out.println("Nama Pengarang : " + pengarang.remove(i));
            System.out.println("Tahun Terbit : " + tahunTerbit.remove(i));
            System.out.println("Harga Buku : " + harga.remove(i));
            System.out.println("Rating Buku : " + rating.remove(i));
            break;
        }

    }
}


