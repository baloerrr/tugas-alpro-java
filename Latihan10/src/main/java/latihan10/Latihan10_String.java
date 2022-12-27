package latihan10;

/**
 *
 * @author akbar akbar
 */
public class Latihan10_String {
 
    public static void main(String args[])
    {
        String st ="Tes, Tes, tes... 123";
        System.out.println("toLowerCase : " + st.toLowerCase());
        System.out.println("toUpperCase : " + st.toUpperCase().trim());
        System.out.println("Dgn Trim : " + '[' + st.trim() + ']' );
        System.out.println("Jumlah karakter = " + st.length() );
    }

    
}
