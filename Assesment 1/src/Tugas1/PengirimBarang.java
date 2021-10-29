package Tugas1;

public class PengirimBarang {
    // Data Utama
    private String namaPenjual;
    private String alamatPenjual;
    private String namaPembeli;
    private String alamatPembeli;
    private double ongkosKirim;
    private String namaEkspedisi;
    private String noResi;

    // Data Utama  + Asuransi
    private String nominalAsuransi;
    private String statusAsuransi;

    // Data utama + Dropship
    private String namaDropShipper;
    private String alamatDropShipper;
    private String statusDropShip;

    // Batas Atribut
    // Getter And Setter data Utama
    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getAlamatPenjual() {
        return alamatPenjual;
    }

    public void setAlamatPenjual(String alamatPenjual) {
        this.alamatPenjual = alamatPenjual;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }

    public double getOngkosKirim() {
        if ((ongkosKirim > 20000) && (getStatusAsuransi().equals("Active")) && (getStatusDropShip().equals("Not Active"))){
            return this.ongkosKirim - 5000;
        } else {
            return this.ongkosKirim;
        }
    }

    public void setOngkosKirim(double ongkosKirim) {
        this.ongkosKirim = ongkosKirim;
    }

    public String getNamaEkspedisi() {
        return namaEkspedisi;
    }

    public void setNamaEkspedisi(String namaEkspedisi) {
        this.namaEkspedisi = namaEkspedisi;
    }

    public String getNoResi() {
        return noResi;
    }

    public void setNoResi(String noResi) {
        this.noResi = noResi;
    }

    // Getter And Setter Asuransi
    public String getNominalAsuransi() {
        return nominalAsuransi;
    }

    public void setNominalAsuransi(String nominalAsuransi) {
        this.nominalAsuransi = nominalAsuransi;
    }

    public String getStatusAsuransi() {
//        if (this.statusAsuransi.equals("Active")){
//            return this.statusAsuransi;
//        }else {
//            this.statusAsuransi = "Not Active";
//            return this.statusAsuransi;
//        }
        return this.statusAsuransi;
    }

    public void setStatusAsuransi(String statusAsuransi) {
        this.statusAsuransi = statusAsuransi;
    }

    // Getter And Setter Dropshipper
    public String getNamaDropShipper() {
        return namaDropShipper;
    }

    public void setNamaDropShipper(String namaDropShipper) {
        this.namaDropShipper = namaDropShipper;
    }

    public String getAlamatDropShipper() {
        return alamatDropShipper;
    }

    public void setAlamatDropShipper(String alamatDropShipper) {
        this.alamatDropShipper = alamatDropShipper;
    }

    public String getStatusDropShip() {
        return this.statusDropShip;
    }

    public void setStatusDropShip(String statusDropShip) {
        this.statusDropShip = statusDropShip;
    }

    // Data utama
    public PengirimBarang(String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, double ongkosKirim, String namaEkspedisi, String noResi) {
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.statusAsuransi = "Not Active";
        this.statusDropShip = "Not Active";
    }

    // Data Utama + Asuransi
    public PengirimBarang(String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, double ongkosKirim, String namaEkspedisi, String noResi, String nominalAsuransi) {
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.nominalAsuransi = nominalAsuransi;
        this.statusAsuransi = "Active";
        this.statusDropShip = "Not Active";
    }

    // Data utama + DropShipper
    public PengirimBarang(String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, double ongkosKirim, String namaEkspedisi, String noResi, String namaDropShipper, String alamatDropShipper) {
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.namaDropShipper = namaDropShipper;
        this.alamatDropShipper = alamatDropShipper;
        this.statusAsuransi = "Not Active";
        this.statusDropShip = "Active";
    }

    // Data utama + Asuransi + Dropshipper
    public PengirimBarang(String namaPenjual, String alamatPenjual, String namaPembeli, String alamatPembeli, double ongkosKirim, String namaEkspedisi, String noResi, String nominalAsuransi, String namaDropShipper, String alamatDropShipper) {
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.ongkosKirim = ongkosKirim;
        this.namaEkspedisi = namaEkspedisi;
        this.noResi = noResi;
        this.nominalAsuransi = nominalAsuransi;
        this.namaDropShipper = namaDropShipper;
        this.alamatDropShipper = alamatDropShipper;
        this.statusAsuransi = "Active";
        this.statusDropShip = "Active";
    }

    public static void Batas(){
        System.out.println("-------------");
    }



}
