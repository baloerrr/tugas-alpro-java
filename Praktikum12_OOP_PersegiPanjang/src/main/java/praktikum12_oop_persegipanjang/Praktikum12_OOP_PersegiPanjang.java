package praktikum12_oop_persegipanjang;

/**
 *
 * @author akbar adityah
 */
class PersegiPanjang {
    public int panjang;
    public int lebar;
    public void setPanjang(int nilaiBaru){
        panjang = nilaiBaru;
    }
    public void setLebar(int nilaiBaru) {
        lebar = nilaiBaru;
    }
    public int hitungLuas() {
        return panjang*lebar;
    }
    public int hitungKeliling() {
        return 2*(panjang+lebar);
    }
}

public class Praktikum12_OOP_PersegiPanjang{
   public static void main(String[] args) {
        PersegiPanjang PP = new PersegiPanjang();
        PP.setLebar(3);
        PP.setPanjang(4);
        System.out.println("Luas = " + PP.hitungLuas());
        System.out.println("Keliling= " + PP.hitungKeliling());
    }
}
