public class Member {
    protected  int saldo;
    protected String nik;
    protected String nama;
    protected String noTelpon;

    // Create Constructor
    public Member(int saldo, String nik, String nama, String noTelpon) {
        this.saldo = saldo;
        this.nik = nik;
        this.nama = nama;
        this.noTelpon = noTelpon;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void infoMember() {
        System.out.println("NIK : " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("No Telp: " + noTelpon);
        System.out.println("Saldo: " + saldo);
    }

}
