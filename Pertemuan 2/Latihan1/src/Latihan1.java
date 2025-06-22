public class Latihan1 {
    // Atribut
    private final String nama;
    private final String jenis;
    private int umur;

    // Konstruktor
    public Latihan1(String nama, String jenis, int umur) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + ", Jenis: " + jenis + ", Umur: " + umur + " tahun");
    }

    // Metode untuk menambah umur
    public void bertambahUmur(int tahun) {
        this.umur += tahun;
    }

    // Metode suara khas hewan
    public void suaraHewan() {
        if (nama.equalsIgnoreCase("Kucing")) {
            System.out.println("Kucing: Meong!");
        } else if (nama.equalsIgnoreCase("Anjing")) {
            System.out.println("Anjing: Guk guk!");
        } else {
            System.out.println(nama + ": Suara tidak dikenal.");
        }
    }

    // Main untuk pengujian
    public static void main(String[] args) {
        Latihan1 kucing = new Latihan1("Kucing", "Mamalia", 3);
        kucing.tampilkanInfo();
        kucing.suaraHewan();
        System.out.println("Setelah bertambah umur:");
        kucing.bertambahUmur(2);
        kucing.tampilkanInfo();

        System.out.println();

        Latihan1 anjing = new Latihan1("Anjing", "Mamalia", 2);
        anjing.tampilkanInfo();
        anjing.suaraHewan();
        System.out.println("Setelah bertambah umur:");
        anjing.bertambahUmur(2);
        anjing.tampilkanInfo();
    }
}
