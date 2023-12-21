import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Jabatan (Manager/Akuntan/HRD/IT/Satpam): "); 
        String jabatan = input.nextLine();
        
        System.out.print("Masukkan Jumlah Hari Telat: ");
        int telat = input.nextInt();
        
        System.out.print("Masukkan Jumlah Hari Sakit: ");
        int sakit = input.nextInt();
        
        System.out.print("Masukkan Jumlah Hari Lembur: ");
        int lembur = input.nextInt();
        
        System.out.print("Masukkan Jumlah Hari Rapat: ");
        int rapat = input.nextInt();
        
        System.out.print("Masukkan Jumlah Hari Dinas: ");
        int dinas = input.nextInt();
        
        Pegawai pegawai;
        
        if(jabatan.equalsIgnoreCase("Manager")) {
            pegawai = new Manager(); 
        } else if(jabatan.equalsIgnoreCase("Akuntan")) {
            pegawai = new Akuntan();
        }   else if(jabatan.equalsIgnoreCase("Akuntan")) {
            pegawai = new HRD();
        } else if(jabatan.equalsIgnoreCase("IT")) {
            pegawai = new IT();
        } else if(jabatan.equalsIgnoreCase("Satpam")) {
            pegawai = new Satpam();
        } else {
            pegawai = null;
        }
        
        if(pegawai != null) {
            pegawai.setNama(nama);
            pegawai.setTelat(telat);
            pegawai.setSakit(sakit);
            pegawai.setLembur(lembur);
            pegawai.setRapat(rapat); 
            pegawai.setDinas(dinas);
            
            System.out.println("Total Gaji " + pegawai.getNama() + " Adalah " + pegawai.hitungGaji());
        } else {
            System.out.println("Jabatan tidak ditemukan");
        }
        
    }

}
