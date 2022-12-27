package praktikum4_switch;

import java.util.Scanner;

/**
 *
 * @author akbar
 */
public class Praktikum4_Switch {
    
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int pil;
        System.out.print("Masukkan pilihan : ");
        pil = masuk.nextInt();
        switch (pil) {
            case 1:System.out.println("Jurusan M/S1");break;
            case 2:System.out.println("Jurusan TK/D3");break;
            case 3:System.out.println("Jurusan SP/D3");break;
            case 4:System.out.println("Jurusan SI/S1");break;
            case 5:System.out.println("Jurusan IF/S1");break;
            default: System.out.println("Pilihan Salah!!!");
            break;
        }
    }

    
}
