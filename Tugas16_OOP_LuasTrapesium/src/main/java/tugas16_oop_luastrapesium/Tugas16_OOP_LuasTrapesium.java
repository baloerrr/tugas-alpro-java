package tugas16_oop_luastrapesium;

import java.util.Scanner;
/**
 *
 * @author akbar adityah
 */
class Trapesium {
    public double panjangAtas, panjangBawah, tinggi;
    
    public void setLuas(double panjangAtas, double panjangBawah, double tinggi) {
        this.panjangAtas = panjangAtas;
        this.panjangBawah = panjangBawah;
        this.tinggi = tinggi;
    }
    
    public double getLuas() {
        return ((panjangAtas + panjangBawah) * tinggi)/2;
    }
}

public class Tugas16_OOP_LuasTrapesium {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Trapesium luasTrapesium = new Trapesium();
        System.out.print("Masukkan Panjang Atas: ");
        luasTrapesium.panjangAtas = input.nextDouble();
        System.out.print("Masukkan Panjang Bawah: "); 
        luasTrapesium.panjangBawah = input.nextDouble();
        System.out.print("Masukkan Panjang Tinggi: ");
        luasTrapesium.tinggi = input.nextDouble();
        System.err.print("");
        luasTrapesium.setLuas(luasTrapesium.panjangAtas,luasTrapesium.panjangBawah, luasTrapesium.tinggi);
        System.out.println("Luas Trapesium: " + luasTrapesium.getLuas() );
    }
}
