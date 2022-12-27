package latihan4;

import java.util.Scanner;

/**
 *
 * @author akbar adityah
 */
public class Latihan4_KonversiSuhu {
    
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int celcius;
        float fahreinhet, reamur, kelvin;
        
        System.out.print("Masukkan derajat Celcius : ");
        celcius = masuk.nextInt();
        
        fahreinhet = 9f/5f * celcius + 32f;
        reamur = (4 * celcius)/5;
        kelvin = 273 + celcius;
        
        System.out.println("Fahreinhet : "+ fahreinhet + " F");
        System.out.println("Reamur : "+ reamur + " R");
        System.out.println("Kelvin : "+ kelvin + " K");
    }
    
}
