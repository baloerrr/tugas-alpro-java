package tugas15_oop_konversisuhu;

/**
 *
 * @author akbar adityah
 */

class Celcius {
    private float fahrenheit;
    void inputFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public float getCelcius() {
        return ((fahrenheit - 32) * 5) / 9;
    }
    
}


public class Tugas15_OOP_KonversiSuhu {
    public static void main(String args[]) {
        Celcius celcius = new Celcius();
        celcius.inputFahrenheit(100);
        
        System.out.println("Celcius: " + celcius.getCelcius());
    }
}
