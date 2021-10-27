package Bagian1;
public class Lingkaran {
    // jari2 r = float
    // diameter d = double


    static double luas(float r){
        return (float) (Math.PI * r * r);
    }

    static double luas(double d){
        double jari = d/2;
        return (Math.PI * jari * jari);
    }

    static double keliling(float r){
        return (float) (2 * Math.PI * r);
    }

    static double keliling(double d){
        return (Math.PI * d);
    }







}
