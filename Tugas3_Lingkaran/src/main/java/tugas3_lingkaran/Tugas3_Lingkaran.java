package tugas3_lingkaran;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Tugas3_Lingkaran {
    
    // Menghitung Luas Lingkaran dan Keliling
    
    public static void main(String args[]) {
    
        Scanner input = new Scanner(System.in);
        double phi = 3.14, r, luas, keliling;
        
        System.out.println("Masukkan Jari-Jari: ");
        r = input.nextDouble();
        
        luas = phi * (r * r);
        keliling = 2 * phi * r;
        
        
        System.out.println("");
        System.out.println("Hasil Keliling dan Luas Lingkaran");
        System.out.println("=========================");
        
        System.out.println("Luas Lingkaran =" + luas);
        System.out.println("Keliling LIngkaran =" + keliling);
    
    }
    
}
