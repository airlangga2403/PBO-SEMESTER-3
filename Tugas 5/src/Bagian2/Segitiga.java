package Bagian2;
//1. Informasi berupa alas dan tinggi segitiga
//2. Informasi berupa alas dan sisi segitiga
public class Segitiga {

    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas,double tinggi,double sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public Segitiga(double alas,double tinggi){
        this(alas,tinggi,0);
    }

    public Segitiga(double alas,float sisi){
        this(alas,0,sisi);
    }

    public double getLuas(){
        if (this.sisi == 0){
            return (this.alas*tinggi)/2;
        }else {
            double t = (this.sisi*Math.sqrt(3))/2;
            this.tinggi = t;
            return (this.alas*t)/2;
        }

    }

    public double getKeliling(){
        if (this.sisi == 0){
            double s = Math.sqrt((4*getLuas()*Math.sqrt(3))/3);
            return s*3;

        }
        else {
            return this.sisi*3;
        }

    }

    public void displaySegitiga(){
        System.out.println("Nilai Alas : " + this.alas);
        System.out.println("Nilai Tinggi : " + this.tinggi);
        System.out.println("Nilai Sisi : " + this.sisi);
    }


}
