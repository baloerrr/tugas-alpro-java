package tugas5_determinan;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Tugas5_Determinan {
    
    public static void main(String args[]) {
    
        Scanner input = new Scanner(System.in);
        int a,b,c, D;
        
        System.out.println("masukkan nilai a:");
        a = input.nextInt();
        
        System.out.println("masukkan nilai b:");
        b = input.nextInt();
        
        System.out.println("masukkan nilai c:");
        c = input.nextInt();
        
        D = b * b - (4 * a * c);
        
        if(D == 0) {
            System.out.println("akar kembar");
        } else  if(D > 0) {
            System.out.println("akar beda");
        } else if(D < 0) {
            System.out.println("akar imajiner");
        }
            
    }
    
}
