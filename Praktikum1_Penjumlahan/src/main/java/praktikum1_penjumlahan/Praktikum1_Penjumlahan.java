package praktikum1_penjumlahan;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Praktikum1_Penjumlahan {
    
    //   Penjumlahan
    public static void main(String[] args) {
        
        Scanner masuk = new Scanner(System.in);
        int A,B, jumlah;
        System.out.print("Bilangan 1 : ");
        A = masuk.nextInt();
        System.out.print("Bilangan 2 : ");
        B = masuk.nextInt();
        jumlah = A + B;
        System.out.println("Jumlah = "+ jumlah);

    }
    
}
