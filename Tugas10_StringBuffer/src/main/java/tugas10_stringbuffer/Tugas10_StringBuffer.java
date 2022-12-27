package tugas10_stringbuffer;

/**
 *
 * @author akbar adityah
 */
public class Tugas10_StringBuffer {
    
    public static void main(String args[])
    {
        StringBuffer sbuf = new StringBuffer(25);
        System.out.println("Isi : " + sbuf.toString());
        System.out.println("Kapasitas : " + sbuf.capacity());
        System.out.println("Panjang : " + sbuf.length());
        sbuf.append("Selamat");
        sbuf.append("Belajar Java");
        System.out.println("");
        
        StringBuffer sbuf2 = new StringBuffer(25);
        System.out.println("Isi : " + sbuf2.toString() + sbuf2.append("Selamat Belajar Java"));
        System.out.println("Kapasitas : " + sbuf2.capacity());
        System.out.println("Panjang : " + sbuf2.length());
        System.out.println("");
        
        StringBuffer sbuf3 = new StringBuffer(25);
        System.out.println("Isi : " + sbuf3.toString() + sbuf3.append("Selamat"));
        System.out.println("Kapasitas : " + sbuf3.capacity());
        System.out.println("Panjang : " + sbuf3.length());
        System.out.println("");
    }
    
}
