package tugas8_dowhile;

import java.util.Scanner;

/**
 *
 * @author akbar
 */
public class Tugas8_DoWhile {
    
    public static void main(String args[]) {
    
        Scanner input = new Scanner(System.in);
        int data_ke;
        float banyak_data, data, rata_rata, jumlah;
        
        System.out.println("Banyak Data: ");
        banyak_data = input.nextFloat();
        data = 0;
        jumlah = 0;
        data_ke = 1;
        
        do {
            System.out.println("Data ke-" + data_ke + " : ");
            data = input.nextFloat();
            jumlah += data;
            data_ke++;
        } while(data_ke<=banyak_data);
            
            rata_rata = (jumlah/banyak_data);
            System.out.println("Rata-rata : " + rata_rata);
        
        
    }
    
}
