public class Tetap extends Karyawan {
    private double tuDas;

    public Tetap(String nama, double gaDas, double tuDas) {
        super(nama, gaDas);
        this.tuDas = tuDas;
    }

    @Override
    public void display() {
        System.out.println("Karyawan Tetap :\nNama : " + super.nama + " Gaji Dasar : " + super.gaDas + " Gaji Tetap : " + tuDas);
        System.out.println("");
    }
}
