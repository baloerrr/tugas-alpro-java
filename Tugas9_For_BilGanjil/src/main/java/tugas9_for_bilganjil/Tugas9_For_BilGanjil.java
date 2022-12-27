package tugas9_for_bilganjil;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Tugas9_For_BilGanjil {
    
    public static void main(String args[]) {
    
       Scanner input = new Scanner(System.in);
       int bil_ganjil, bil_awal, bil_akhir;
        
       System.out.print("Masukkan Bilangan Awal: ");
       bil_awal = input.nextInt();
       System.out.print("Masukkan Bilangan Akhir: ");
       bil_akhir = input.nextInt();
       
       for(bil_ganjil = bil_awal; bil_ganjil <= bil_akhir; bil_ganjil++) {
       
           if(bil_ganjil % 2 != 0) {
           
               System.out.println(bil_ganjil);
           }
           
       }
    }
    
}
