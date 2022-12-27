package praktikum10_methodparam_passbyvalue;

/**
 *
 * @author akbar adityah
 */
public class Praktikum10_MethodParam_PassByValue {
    
    public static void main(String [] args )
    {
        int i =10;
        System.out.println(i);
        test(i);
        System.out.println(i);
    }
    public static void test(int j)
    {
        j=33;
    }
    
}
