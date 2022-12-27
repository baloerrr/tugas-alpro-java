package latihan15_oop_lingkaran;

/**
 *
 * @author akbar
 */
class Lingkaran {
    private double radius;
    void IsiJari(double radius)
    {
        this.radius=radius;
    }
    public double perolehPi() {
        return 3.14;
    }
    public double perolehLuas() {
        return perolehPi() * (radius * radius);
    }
     public double perolehKeliling() {
        return 2*perolehPi() * radius;
    }
}

public class Latihan15_OOP_Lingkaran{
    public static void main(String[] args) {
        Lingkaran bulatan = new Lingkaran();
        bulatan.IsiJari(75);
        System.out.println("Luas = " + bulatan.perolehLuas());
        System.out.println("Keliling = " + bulatan.perolehKeliling());
        System.out.println("pi = " + bulatan.perolehPi());
    }
}
