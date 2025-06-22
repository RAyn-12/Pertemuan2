class Kendaraan {
    String merk;
    String tipe;
    int kecepatan;

    Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " 
                          + kecepatan + " km/jam");
    }

    void tambahKecepatan(int km) {
        this.kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
    }

    void kurangiKecepatan(int km) {
        if (this.kecepatan - km < 0) {
            this.kecepatan = 0;
        } else {
            this.kecepatan -= km;
        }
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
    }

    void berhenti() {
        this.kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }
}

public class Tugas1 {
    public static void main(String[] args) {

        Kendaraan kendaraan1 = new Kendaraan("Toyota Supra Mk5", "Mobil", 60);

        kendaraan1.tampilkanInfo();

        kendaraan1.tambahKecepatan(20);

        kendaraan1.kurangiKecepatan(30);

        kendaraan1.berhenti();

        kendaraan1.tampilkanInfo();

        Kendaraan kendaraan2 = new Kendaraan("Yamaha R1M", "Motor", 40);

        kendaraan2.tampilkanInfo();
        kendaraan2.tambahKecepatan(30);
        kendaraan2.kurangiKecepatan(40);
        kendaraan2.berhenti();
        kendaraan2.tampilkanInfo();
    }
}