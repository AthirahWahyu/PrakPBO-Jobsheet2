public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 10;
        pp.lebar = 5;

        System.out.println("--- Data Persegi Panjang ---");
        pp.displayInfo();
        System.out.println("-----------------");
        System.out.println("Luas        : " + pp.getLuas());
        System.out.println("Keliling    : " + pp.getKeliling());
    }
}
