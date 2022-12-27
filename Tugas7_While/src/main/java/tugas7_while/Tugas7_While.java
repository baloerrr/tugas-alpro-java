package tugas7_while;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Tugas7_While {
    
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int data_ke;
        float banyak_data, jumlah, data,rata_rata ;
        
        System.out.println("Banyak Data: ");
        banyak_data = masuk.nextInt();
        data_ke = 1;
        data = 0;
        jumlah = 0;
        
        while(data_ke <= banyak_data) {
            System.out.println("Data ke-" + data_ke);
            data = masuk.nextInt();
            jumlah += data;
            data_ke++;
        }
        
        rata_rata = (jumlah/banyak_data);
        System.out.println("Rata-rata : " + rata_rata);
        
        System.out.println("Jumlah : " + jumlah);
    }
    
}
