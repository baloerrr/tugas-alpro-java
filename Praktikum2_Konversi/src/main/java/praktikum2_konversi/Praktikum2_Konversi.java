package praktikum2_konversi;

import java.util.Scanner;
/**
 *
 * @author akbar adityah
 */
public class Praktikum2_Konversi {
    
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        float m, cm, inci;
        
        System.out.print("Masukan ukuran dalam Meter: ");
        m = masuk.nextFloat();
       
        cm = m * 100;
        inci = m * 100 / 2.54f;
        
        System.out.println("Ukuran dalam CM = " + cm + " cm");
        System.out.println("Ukuran dalam Inci = " + 
        inci + " inch");
    }
    
}
