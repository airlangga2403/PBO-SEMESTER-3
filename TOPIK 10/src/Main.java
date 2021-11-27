import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner inputUser = new Scanner(System.in);
    static ArrayList<Customer> arListCustomer = new ArrayList<>();
    static ArrayList<Driver> arListDriver = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("1. Input driver atau customer");
            System.out.println("2. Info driver atau customer");
            System.out.println("3. Top up saldo customer");
            System.out.println("4. Transaksi jasa antar");
            System.out.println("5. Keluar");
            System.out.print("Masukan Input : ");
            choice = inputUser.nextInt();

            switch (choice) {
                case 1:
                    inputMember();
                    break;
                case 2:
                    infoMember();
                    break;
                case 3:
                    topUpSaldo();
                    break;
                case 4:
                    transaksiJasaAntar();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input Salah\nSilahkan Input Dari 1-5");
                    break;
            }

        } while (choice != 5);
    }

    public static void inputMember() {
        int saldo;
        String nik;
        String nama;
        String noTelpon;
        System.out.println("1. Customer");
        System.out.println("2. Driver");
        System.out.print("Pilih type member: ");
        int typeMember = inputUser.nextInt();

        System.out.print("Saldo member: ");
        saldo = inputUser.nextInt();

        System.out.print("Nik member: ");
        nik = inputUser.next();

        System.out.print("Nama member: ");
        nama = inputUser.next();

        System.out.print("No telp member: ");
        noTelpon = inputUser.next();

        if (typeMember == 1) {
            Customer arCustomer = new Customer(saldo, nik, nama, noTelpon);
            arListCustomer.add(arCustomer);
        } else if (typeMember == 2) {
            System.out.print("Plat no member: ");
            String noPlat = inputUser.next();
            System.out.print("Jenis kendaraan member: ");
            String jenisKendaraan = inputUser.next();
            Driver inputDriver = new Driver(saldo, nik, nama, noTelpon, noPlat, jenisKendaraan);
            arListDriver.add(inputDriver);
        } else {
            System.out.println("Tidak ada tipe member tersebut");
        }
    }

    public static void infoMember() {
        System.out.println("1. Customer");
        System.out.println("2. Driver");
        System.out.print("Pilih type member: ");
        int typeMember = inputUser.nextInt();
        System.out.println();
        if (typeMember == 1) {
            for (int i = 0; i < arListCustomer.size(); i++) {
                System.out.println("No: " + (i + 1));
                arListCustomer.get(i).infoMember();
            }
        } else if (typeMember == 2) {
            for (int i = 0; i < arListDriver.size(); i++) {
                System.out.println("No: " + (i + 1));
                arListDriver.get(i).infoMember();
            }
        } else {
            System.out.println("Tidak ada tipe member tersebut");
        }
        System.out.println();
    }

    public static void topUpSaldo() {
        System.out.print("No customer: ");
        int noCustomer = inputUser.nextInt();
        System.out.print("No driver: ");
        int noDriver = inputUser.nextInt();
        System.out.print("Jumlah saldo yang akan di topup: ");
        int jumlahSaldo = inputUser.nextInt();
        Customer customer = arListCustomer.get(noCustomer - 1);
        Driver driver = arListDriver.get(noDriver - 1);
        customer.topUpSaldo(driver, jumlahSaldo);

    }

    public static void transaksiJasaAntar() {
        System.out.print("No customer: ");
        int noCustomer = inputUser.nextInt();
        System.out.print("No driver: ");
        int noDriver = inputUser.nextInt();
        System.out.print("Jumlah saldo yang akan di berikan: ");
        int jumlahSaldo = inputUser.nextInt();
        Driver driver = arListDriver.get(noDriver - 1);
        Customer customer = arListCustomer.get(noCustomer - 1);
        driver.transaksiJasaAntar(customer, jumlahSaldo);
    }

}
