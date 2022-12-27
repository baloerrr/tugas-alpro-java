package praktikum10_methodparam_fungsi4a;

/**
 *
 * @author akbar adityah
 */
public class Praktikum10_MethodParam_Fungsi4a {
    
    public static int jumlah(int a){
        return (a + a);
    }
    public static void main(String args[]){
        System.out.println("Panggil method jumlah dengan parameter 5");
        System.out.println(jumlah(5));
        System.out.println("Panggil method jumlah dengan parameter 15");
        System.out.println(jumlah(15));
    }
    
}
