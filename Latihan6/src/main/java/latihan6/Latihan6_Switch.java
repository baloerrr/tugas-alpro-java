 package latihan6;
 
import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Latihan6_Switch {
    
    public static void main(String args[]) {
    
       Scanner masuk = new Scanner(System.in);
        int pil;
        System.out.print("Masukkan pilihan : ");
        pil = masuk.nextInt();
        switch (pil) {
        case 1 -> System.out.println("RCTI");
        case 2 -> System.out.println("SCTV");
        case 3 -> System.out.println("TPI");
        case 4 -> System.out.println("INDOSIAR");
        case 5 -> System.out.println("TRANS7");
        case 6 -> System.out.println("TVONE");
        case 7 -> System.out.println("METRO");
        case 8 -> System.out.println("GLOBAL");
        case 9 -> System.out.println("TRANS7");
        case 10 -> System.out.println("TVRI");
        default -> System.out.println("Salah masukkan pilihan");
      }
        
    }
    
}
