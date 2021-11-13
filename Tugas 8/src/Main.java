public class Main {
    public static void batas(){
        System.out.println("-------------");
    }
    public static void main(String[] args) {
        Departemen dp1 = new Departemen("Departemen Kebersihan");
        Tetap tp1 = new Tetap("Tomi", 5000, 20000);
        Tetap tp2 = new Tetap("Sby", 4000, 15000);
        Kontrak kt1 = new Kontrak("Hartoe", 10000, 40000);
        dp1.addKaryawan(tp1);
        dp1.addKaryawan(tp2);
        dp1.addKaryawan(kt1);

        System.out.println("Nama Departemen : " + dp1.getNama() + "\n");
        System.out.println("Print Semua Karyawan :");
        dp1.displayAll();
        batas();
        batas();
        System.out.println("Print Semua Karyawan Tetap:");
        dp1.displayTetap();
        batas();batas();
        System.out.println("Print Semua Karyawan Kontrak:");
        dp1.displayKontrak();
        batas();batas();

        Departemen dp2 = new Departemen("Departement Service");
        Tetap tp3 = new Tetap("Malik", 70000, 3000);
        Kontrak kt2 = new Kontrak("Setya", 10000, 45);
        Kontrak kt3 = new Kontrak("Mickala", 9000, 32);
        dp2.addKaryawan(tp3);
        dp2.addKaryawan(kt2);
        dp2.addKaryawan(kt3);


        System.out.println("\nNama Departemen : " + dp2.getNama() + "\n");
        System.out.println("Print Semua Karyawan :");
        dp2.displayAll();
        batas();
        batas();

        System.out.println("Print Semua Karyawan Tetap:");
        dp2.displayTetap();
        batas();batas();

        System.out.println("Print Semua Karyawan Kontrak:");
        dp2.displayKontrak();
        batas();batas();
    }

    }
