public class Customer extends Member {
    // Create Constructor
    public Customer(int saldo, String nik, String nama, String noTelpon) {
        super(saldo, nik, nama, noTelpon);
    }

    public void topUpSaldo(Driver driver, int jumlahSaldo) {
        if (driver.getSaldo() < jumlahSaldo) {
            System.out.println("Saldo driver kurang");
        } else {
            this.setSaldo(this.getSaldo() + jumlahSaldo);
            driver.setSaldo(driver.getSaldo() - jumlahSaldo);
            System.out.println("Berhasil melakukan top up");
        }
    }
}
