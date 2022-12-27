package latihan10_stringinsert;

/**
 *
 * @author akbar adityah
 */
public class Latihan10_StringInsert {
    
    public static void main(String args[])
    {
        StringBuffer sbuf = new StringBuffer("THE STMIK");
        sbuf.insert(4, "REAL ");
        System.out.println("Hasil : ");
        System.out.println(sbuf.toString());
    }
    
}
