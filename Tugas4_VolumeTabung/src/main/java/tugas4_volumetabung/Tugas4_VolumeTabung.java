package tugas4_volumetabung;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Tugas4_VolumeTabung {
    
    public static void main(String args[]) {
    
        Scanner input = new Scanner(System.in);
        double phi = 3.14, r, tinggi, volume;
        
        System.out.println("Masukkan Jari-Jari: ");
        r = input.nextDouble();
        
        System.out.println("Masukkan Tinggi: ");
        tinggi = input.nextDouble();
        
        volume = phi * (r * r) * tinggi;
        System.out.println("Volume Tabung: " + volume);
    }
    
}
