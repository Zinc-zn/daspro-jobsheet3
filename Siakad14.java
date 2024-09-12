
import java.util.Scanner;

public class Siakad14 {
    
    public static void main(String[] args) {
        String nama, nim;
        String kelas;
        String programStudi;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan Program Studi: ");
        programStudi = sc.nextLine();
        System.out.println("Masukkan Kelas : ");
        kelas = sc.nextLine();
        System.out.println("Masukkan Nomor Absen : ");
        absen = sc.nextByte();
        System.out.println("Masukkan Nilai Kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.println("Masukkan Nilai Tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan Nilai UTS : ");
        nilaiUTS = sc.nextDouble();
        System.out.println("Masukkan Nilai UAS : ");
        nilaiUAS = sc.nextDouble();

        nilaiKuis = (nilaiKuis*0.2);
        nilaiTugas = (nilaiTugas*0.15);
        nilaiUTS = (nilaiUTS*0.3);
        nilaiUAS = (nilaiUAS*0.35);
        nilaiAkhir = (nilaiKuis+nilaiTugas+nilaiUTS+nilaiUAS);

        System.out.println("Nama : " + nama + "NIM : " + nim);
        System.out.println("kelas : " +programStudi+"-"+kelas);
        System.out.println("Absen : "+absen);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
    }
}
