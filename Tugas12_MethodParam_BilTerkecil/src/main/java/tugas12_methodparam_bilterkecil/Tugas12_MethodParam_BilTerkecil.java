package tugas12_methodparam_bilterkecil;

import java.util.Scanner;
/**
 *
 * @author akbar adityah
 */
public class Tugas12_MethodParam_BilTerkecil {
    
    public int bilangan(int a, int b, int c) {
        return (a < b ? a : b < c ? b : c);
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua: ");
        int b = input.nextInt();
        System.out.print("Masukkan Bilangan Ketiga: ");
        int c = input.nextInt();
        Tugas12_MethodParam_BilTerkecil object = new Tugas12_MethodParam_BilTerkecil();
        System.out.println("Bilangan Terkecil: " + object.bilangan(a, b, c));
    }
    
}
