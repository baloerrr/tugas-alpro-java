package tugas3_operatoraritmatika;

import java.util.Scanner;
/**
 *
 * @author akbar adityah
 */
public class Tugas3_operatorAritmatika {
    
    // Operasi Aritmatika
    public static void main(String args[]) {
    
        Scanner input = new Scanner(System.in);
        int num1,num2,addition,subtraction,multiplication,division;
        
        System.out.println("Bilangan 1: ");
        num1 = input.nextInt();
        
        System.out.println("Bilangan 2: ");
        num2 = input.nextInt();
        
        addition = num1 + num2;
        subtraction = num1 - num2;
        multiplication = num1 * num2;
        division = num1 / num2;
        
        System.out.println("");
        System.out.println("Hasil Operator Aritmatika");
        System.out.println("=========================");
        
        System.out.println("Jumlah = " + addition);
        System.out.println("Jumlah = " + subtraction);
        System.out.println("Jumlah = " + multiplication);
        System.out.println("Jumlah = " + division);
        
        System.out.print("Press any key to continue...");
        try {
            System.in.read();
            input.nextLine();
        } catch (Exception e) {
            
        }
        
       
    }
    
    
}


