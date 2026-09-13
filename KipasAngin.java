public class KipasAngin {
    // Atribut
    public String merk;
    public int jumlahBalingBaling;
    public int tingkatKecepatan;
    public boolean statusSwing;
    public boolean statusDaya;

    // Method
    public void nyalakan() {
        statusDaya = true;
        tingkatKecepatan = 1;
        System.out.println(merk + " berhasil dinyalakan.");
    }

    public void matikan() {
        statusDaya = false;
        tingkatKecepatan = 0;
        statusSwing = false;
        System.out.println(merk + " berhasil dimatikan.");
    }

    public void ubahKecepatan(int kecepatanBaru) {
        if (statusDaya) {
            tingkatKecepatan = kecepatanBaru;
            System.out.println("Kecepatan " + merk + " diubah ke level " + tingkatKecepatan);
        } else {
            System.out.println("Gagal: Kipas angin masih dalam keadaan mati!");
        }
    }

    public void aktifkanModeSwing() {
        if (statusDaya) {
            statusSwing = true;
            System.out.println("Mode Swing " + merk + " diaktifkan.");  
        } else {
            System.out.println("Gagal: Kipas angin belum dinyalakan.");
        }
    }

    public void hentikanModeSwing() {
        if (statusDaya) {
            statusSwing = false;
            System.out.println("Mode swing " + merk + " dihentikan.");
        } else {
            System.out.println("Mode swing " + merk + " sudah dalam keadaan tidak aktif.");
        }
    }

    public void displayInfo() {
        System.out.println("Merk                    : " + merk);
        System.out.println("Jumlah baling-baling    : " + jumlahBalingBaling);
        System.out.println("Status Daya             : " + (statusDaya ? "Menyala (ON)" : "Mati (OFF)"));
        System.out.println("Tingkat Kecepatan       : " + tingkatKecepatan);
        System.out.println("Status Swing            : " + (statusSwing ? "Berputar (ON)" : "Diam (OFF)"));
    }
}

