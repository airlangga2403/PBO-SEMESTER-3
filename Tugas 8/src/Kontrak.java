public class Kontrak extends Karyawan{

    private int waktu;

    public Kontrak(String nama, double gaDas, int waktu) {
        super(nama, gaDas);
        this.waktu = waktu;
    }

    @Override
    public void display(){
        System.out.println("Karyawan Kontrak :\nNama : " + super.nama + " Waktu : " + waktu + " Gaji Dasar : " + super.gaDas);
        System.out.println("");
    }
}
