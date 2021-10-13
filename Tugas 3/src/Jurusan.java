import java.util.ArrayList;

public class Jurusan {
    private ArrayList <Mahasiswa> mhs = new ArrayList<>();
    private String kode;
    private String nama;



    public Jurusan(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }

    public void addMhs(Mahasiswa m){
        this.mhs.add(m);
    }

    public String getKode(){
        return this.kode;
    }

    public String getNama(){
        return this.nama;
    }
    public ArrayList<Mahasiswa> getMhs(){
      //  return new ArrayList<Mahasiswa>(this.mhs);
        //return new ArrayList<Mahasiswa>(mhs);
        return mhs;

    }


}
