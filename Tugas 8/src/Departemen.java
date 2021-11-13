public class Departemen {
    private String nama;
    private Karyawan kar[] = new Karyawan[3];
    private int jml;

    public Departemen(String nama) {
        this.nama = nama;
    }

    public void addKaryawan(Karyawan k){
        if (jml < this.kar.length){
            this.kar[jml] = k;
            jml++;
        }
    }

    public String getNama() {
        return nama;
    }

    public void displayAll(){
        for (Karyawan disA : kar) {
            disA.display();
        }
    }

    public void displayKontrak(){
        for (Karyawan kt: kar) {
            if (kt instanceof Kontrak){
                Kontrak ktt = (Kontrak) kt;
                ktt.display();
            }
        }
    }

    public void displayTetap(){
        for (Karyawan tp: kar) {
            if (tp instanceof Tetap){
                Tetap tpp = (Tetap) tp;
                tpp.display();
            }
        }
    }
}
