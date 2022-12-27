/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritma1;

/**
 *
 * @author akbar
 */
public class Tugas11_Method_Aritmatika {
    
    public static int jumlah(){
        int a = 7, b = 15;
        return (a + b);
    }
    
    public static int kurang() {
        int a = 15, b = 7;
        return (a - b);
    }
    
    public static int kali() {
        int a = 15, b = 7;
        return (a * b);
    }
    
    public static int bagi() {
        int a = 15, b = 7;
        return (a / b);
    }
    
    public static void main(String args[]){
        System.out.println("Hasil pemanggilan method jumlah");
        System.out.println(jumlah());
        System.out.println("Hasil pemanggilan method kurang");
        System.out.println(kurang());
        System.out.println("Hasil pemanggilan method kali");
        System.out.println(kali());
        System.out.println("Hasil pemanggilan method bagi");
        System.out.println(bagi());
    }
    
}
