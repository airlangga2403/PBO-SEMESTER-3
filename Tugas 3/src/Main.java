public class Main {
    public static void main(String[] args) {

        // Buat Object
        Mahasiswa m1 = new Mahasiswa("6701","Rendi");
        Mahasiswa m2 = new Mahasiswa("6702","Chaca");
        Mahasiswa m3 = new Mahasiswa("6703","Agus");

        Mahasiswa m4 = new Mahasiswa("6301","Rendi");
        Mahasiswa m5 = new Mahasiswa("6302","Siska");
        Mahasiswa m6 = new Mahasiswa("6303","Zayn");
        Mahasiswa m7 = new Mahasiswa("6304","Rahmat");

        Jurusan rpla = new Jurusan("D3IF","Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan si = new Jurusan("D3SI","Diploma 3 Sistem Informasi");


        // Gabungkan / Relasi antara kedua kelas
        rpla.addMhs(m1);
        rpla.addMhs(m2);
        rpla.addMhs(m3);

        si.addMhs(m4);
        si.addMhs(m5);
        si.addMhs(m6);
        si.addMhs(m7);


        // Tampilkan data RPLA

        System.out.println("Kode " + rpla.getKode());
        System.out.println("Nama : " + rpla.getNama());
        System.out.println("Daftar Mahasiswa : ");

        int no = 1;
        for (Mahasiswa m : rpla.getMhs()){
            System.out.println("    " + no + ". " + m.getNim()  + " - " + m.getNama());
            no++;
        }
        System.out.println("");

        // Tampilkan data Sistem Informasi

        System.out.println("Kode " + si.getKode());
        System.out.println("Nama : " + si.getNama());
        System.out.println("Daftar Mahasiswa : ");
        no = 1;
        for (Mahasiswa m : si.getMhs()){
            System.out.println("    " + no + ". " + m.getNim()  + " - " + m.getNama());
            no++;
        }




//        for (Mahasiswa data : rpla.getMhs()){
//            System.out.println(rpla.get(data));
//        }










    }
}
