package tugas16_oop_nilaiujian;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */


class Ujian {
    protected String namaMahasiswa;
    protected double nilaiUts , nilaiUas, nilaiAkhir;
  
    public void setNama(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }
    
    public void setNIlaiAkhir(double nilaiUts, double nilaiUas) {
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    
    public String getNama() {
        return namaMahasiswa;
    }
    
    public double getNilaiAkhir() {
        return nilaiUts + nilaiUas;
    }
    
}

class UTS extends Ujian {
    public void setNilaiUTS(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }
    
    public double getNilaiUts() {
        return (nilaiUts * 40)/100;
    }
}

class UAS extends Ujian { 
    public void setNilaiUAS(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }
    
    public double getNilaiUas() {
        return (nilaiUas * 60)/100;
    }
}

public class Tugas16_OOP_NIlaiUjian {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Ujian exam = new Ujian();
        UTS nilai1 = new UTS();
        UAS nilai2 = new UAS();
      
        System.err.print("Masukkan Nama: ");
        exam.namaMahasiswa = input.next();
        System.err.print("Masukkan UTS: ");
        nilai1.nilaiUts = input.nextDouble();
        System.err.print("Masukkan UAS: ");
        nilai2.nilaiUas = input.nextDouble();
        
        exam.setNama(exam.namaMahasiswa);
        nilai1.setNilaiUTS(nilai1.nilaiUts);
        nilai2.setNilaiUAS(nilai2.nilaiUas);
        
        System.out.println("Nama: " + exam.getNama());
        System.out.println("Nilai Murni UTS: " + nilai1.getNilaiUts());
        System.out.println("Nilai Murni UAS: " + nilai2.getNilaiUas());
        
        exam.setNIlaiAkhir(nilai1.getNilaiUts(), nilai2.getNilaiUas());
        System.err.println("Nilai Akhir: " + exam.getNilaiAkhir());
        
        if(exam.getNilaiAkhir() >= 90) {
            System.out.println("Nilai Grade: " + "A");
        } else if(exam.getNilaiAkhir() >= 80 && exam.getNilaiAkhir() <= 90) {
            System.out.println("Nilai Grade: " + "B");
        } else if(exam.getNilaiAkhir() >= 70 && exam.getNilaiAkhir() <= 80) {
            System.out.println("Nilai Grade: " + "C");
        } else if(exam.getNilaiAkhir() >= 60 && exam.getNilaiAkhir() <= 70) {
             System.out.println("Nilai Grade: " + "D");
        } else {
            System.out.println("Nilai Grade: " + "E");
        }
    }
}
