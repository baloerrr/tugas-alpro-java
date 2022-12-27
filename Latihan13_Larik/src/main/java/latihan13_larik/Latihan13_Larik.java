package latihan13_larik;

/**
 *
 * @author akbar adityah
 */
public class Latihan13_Larik {
    
    public static void main(String args[]) {
    
        int kuadrat[];
        kuadrat = new int[10];
        for(int i = 0; i < 10; i++) {
        
            System.out.println("Data-ke " + (i+1) + " : ");
            kuadrat[i] = (i+1) * (i+1);
            System.out.println(kuadrat[i]);
            
        }
    
    }
    
}
