public abstract class Pegawai {
    
    protected String nama;
    protected int gajiPokok;
    protected int telat;
    protected int sakit; 
    protected int lembur;
    protected int rapat;
    protected int dinas;
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama; 
    }
    
    public void setTelat(int telat) {
        this.telat = telat;
    }
    
    public void setSakit(int sakit) {
        this.sakit = sakit;
    }
    
    public void setLembur(int lembur) {
        this.lembur = lembur;
    }
    
    public void setRapat(int rapat) {
        this.rapat = rapat;
    }
    
    public void setDinas(int dinas) {
        this.dinas = dinas;
    }
    
    public int hitungGaji() {
        int totalGaji = gajiPokok;
        
        totalGaji -= telat * 25000; 
        totalGaji -= sakit * 20000;
        totalGaji += lembur * 50000;
        totalGaji += rapat * 100000;
        totalGaji += dinas * 150000;
        
        return totalGaji;
    }
    
}