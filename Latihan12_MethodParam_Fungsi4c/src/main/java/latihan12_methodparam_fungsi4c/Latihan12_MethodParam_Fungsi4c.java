package latihan12_methodparam_fungsi4c;

/**
 *
 * @author akbar adityah
 */
public class Latihan12_MethodParam_Fungsi4c {
    
    public float jumlah(int a, float b, int c) //tanpa static
    {

        return (a+b);
    }

    public static void main(String args[])
    {
        Latihan12_MethodParam_Fungsi4c obyek = new Latihan12_MethodParam_Fungsi4c();
        System.out.print("panggil method jumlah dengan parameter 5 dan 1.5, hasilnya = ");
        System.out.println(obyek.jumlah(5, 1.5f, 10));
        System.out.print("panggil method jumlah denga parameter 10 dan 2.2, hasilnya = ");
        System.out.println(obyek.jumlah(10, 2.2f, 5));
    } 
    
}
