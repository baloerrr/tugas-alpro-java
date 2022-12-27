package tugas6_switch;

import java.util.Scanner;

/**
 *
 * @author akbar
 */
public class Tugas6_Switch {
    
    public static void main(String args[]) {
    
        Scanner masuk = new Scanner(System.in);
        int pil;
        System.out.println("Pilihan 1 Naik Pesawat Terbang");
        System.out.println("Pilihan 2 Naik Kereta Api");
        System.out.println("Pilihan 3 Naik Bus");
        System.out.println("Pilihan 4 Naik Taks");
        System.out.println("Pilihan 5 Naik Mobil Pribadi");
        System.out.println("Pilihan 6 Naik Motor");
        System.out.println("=====================");
        System.out.println("Pilihlah Kendaraan : ");
        pil = masuk.nextInt();
        
        switch (pil) {
            case 1:System.out.println("Naik Pesawat Terbang");break;
            case 2:System.out.println("Naik Kereta Api");break;
            case 3:System.out.println("Naik Bus");break;
            case 4:System.out.println("Naik Taksi");break;
            case 5:System.out.println("Naik Mobil Pribadi");break;
            case 6:System.out.println("Naik Motor");break;
            default: System.out.println("Anda Salah Memilih");
            break;
        }

        
    }
    
}
