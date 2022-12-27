package latihan11_method_fungsi3a;

/**
 *
 * @author akbar adityah
 */
public class Latihan11_Method_Fungsi3a {
    
    public int jumlah(){
        int a = 7, b = 15;
        return (a + b);
    }
    
    public static void main(String args[]){
        Latihan11_Method_Fungsi3a obyek = new Latihan11_Method_Fungsi3a();
        System.out.println("Hasil pemanggilan method jumlah");
        System.out.println(obyek.jumlah());
    }
    
}
