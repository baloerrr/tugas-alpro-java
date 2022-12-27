package tugas13_larik;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Tugas13_Larik {
    
    public static void main(String args[]) {
    
        {
        Scanner masuk = new Scanner(System.in);
        float jumlah, rata, min, maks;
        float nilai[]=new float[5];
        
        jumlah = 0;
        
        System.out.println("masukkan 5 buah data nilai");
        
        for(int i=0;i<nilai.length;i++) {
            System.out.print("Data ke-"+(i+1)+": ");
            nilai[i]=masuk.nextFloat();
        }
        
        maks = nilai[0];
        min = nilai[0];
        
        System.out.println("data nilai yang dimasukkan");
        for(int i=0;i<nilai.length;i++) {
            System.out.println(nilai[i]);
            jumlah += nilai[i];
               
            if (nilai[i]>maks){
                maks = nilai[i];
            }else if(nilai[i]<min){
                min = nilai[i];
            }
        }
            
        System.out.println("Jumlah: " + jumlah);
        
        rata = (jumlah/5);
        System.out.println("Rata-rata: " + rata);
        
        System.out.println("Nilai Terbesar: " + maks);
        
        System.out.println("Nilai Terkecil: " + min);
    }
        
    }
    
}


