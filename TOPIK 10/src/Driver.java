public class Driver extends Member {
    private String nomorPlat;
    private String jenisKendaraan;

    // Create Constructor
    public Driver(int saldo, String nik, String nama, String noTelpon, String nomorPlat, String jenisKendaraan) {
        super(saldo, nik, nama, noTelpon);
        this.nomorPlat = nomorPlat;
        this.jenisKendaraan = jenisKendaraan;
    }

    public void transaksiJasaAntar(Customer customer, int jumlahBiaya) {
        if (customer.getSaldo() < jumlahBiaya) {
            System.out.println("Saldo member kurang");
        } else {
            this.setSaldo(this.getSaldo() + jumlahBiaya);
            customer.setSaldo(customer.getSaldo() - jumlahBiaya);
            System.out.println("Berhasil melakukan transaksi");
        }
    }

    @Override
    public void infoMember() {
        super.infoMember();
        System.out.println("Info Member Driver : ");
        System.out.println("Plat: " + nomorPlat);
        System.out.println("Kendaraan: " + jenisKendaraan);
    }

}
