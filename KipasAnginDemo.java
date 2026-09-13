public class KipasAnginDemo {
    public static void main(String[] args) {
        // Instansiasi objek 1
        KipasAngin kipas1 = new KipasAngin();
        kipas1.merk = "Miyako";
        kipas1.jumlahBalingBaling = 3;

        // Instansiasi objek 2
        KipasAngin kipas2 = new KipasAngin();
        kipas2.merk = "Maspion";
        kipas2.jumlahBalingBaling = 5;

        // Menampilkan data awal 
        System.out.println("--- DATA AWAL KIPAS 1 ---");
        kipas1.displayInfo();

        System.out.println("\n--- DATA AWAL KIPAS 2 ---");
        kipas2.displayInfo();

        // Operasi & Update atribut pada objek 1
        System.out.println("\n--- Eksekusi Objek 1 ---");
        kipas1.nyalakan();
        kipas1.ubahKecepatan(3);
        kipas1.aktifkanModeSwing();

        // Operasi & Update atribut Objek 2
        System.out.println("\n--- Eksekusi Objek 2 ---");
        kipas2.nyalakan();
        kipas2.ubahKecepatan(2);

        // Menampilkan info akhir setelah update
        System.out.println("\n--- HASIL AKHIR KIPAS 1 ---");
        kipas1.displayInfo();

        System.out.println("\n--- HASIL AKHIR KIPAS 2 ---");
        kipas2.displayInfo();
    }
}
