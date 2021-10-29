package Tugas2;

public class Mobil {
    private String merk;
    private String tahunKeluaran;
    private int stok;
    private Double harga;

    public Mobil(String merk, String tahunKeluaran, int stok, Double harga) {
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.stok = stok;
        this.harga = harga;
    }
    public String getMerk() {
        return merk;
    }

    public String getTahunKeluaran() {
        return tahunKeluaran;
    }

    public Double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void displayInfo(){
        System.out.println("\nInformasi Mobil :\n " +
                "\nMerek : " + getMerk() +
                "\nHarga : " + getHarga() +
                "\nTahun Keluaran : " + getTahunKeluaran() +
                "\nSisa Stok : " + getStok());
    }


}
