package Bagian2;
import java.util.Scanner;

public class Main{
    private static Scanner s = new Scanner(System.in);
    public static void inputUser(){
        System.out.println("Pilih Type Input : ");
        System.out.println("1. Informasi berupa alas dan tinggi segitiga");
        System.out.println("2. Informasi berupa alas dan sisi segitiga");
        System.out.println("Pilih : "); int i = s.nextInt();
        if (i == 1){
            System.out.println("Masukkan Nilai Alas dan Tinggi Segitiga ");
            Segitiga segitiga = new Segitiga(5.1d,2.5d);
            System.out.println("Luas : " + segitiga.getLuas());
            System.out.println("keliling : " + segitiga.getKeliling());
            System.out.println("------");
            segitiga.displaySegitiga();
        }
        else if (i == 2){
            System.out.println("Masukkan Nilai Alas dan Sisi Segitiga ");
            Segitiga segitiga = new Segitiga(5.1d,5.1f);
            System.out.println("Luas : " + segitiga.getLuas());
            System.out.println("keliling : " + segitiga.getKeliling());
            System.out.println("------");
            segitiga.displaySegitiga();
        }
        else {
            System.out.println("Wrong Input");
        }

    }

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Input Pilihan  : ");
            System.out.println("1. Hitung Luas dan keliling segitiga sama sisi ");
            System.out.println("2. Keluar dari apps");
            i = s.nextInt();
            if (i == 1) {
                inputUser();
            }
            else if (i == 2){
                System.out.println("Close Apps");
            }

            else {
                System.out.println("Wrong Input");
            }


        }while (i != 2);


    }
}
