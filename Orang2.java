public class Orang2 {

    // 1. Properti
    private String namaDepan;
    private String namaBelakang;

    // 2. Constructor
    public Orang2(String namaDepan, String namaBelakang) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
    }

    // 3. Getter
    public String getNamaDepan() {
        return this.namaDepan;
    }

    public String getNamaBelakang() {
        return this.namaBelakang;
    }

    // 4. Method tambahan (ini yang kamu kurang)
    public String getNamaPanggilan() {
        return "Mas " + this.namaDepan;
    }

    // 5. Main method
    public static void main(String[] args) {
        Orang2 orang = new Orang2("Budi", "Raharjo");

        System.out.println("Nama depan = " + orang.getNamaDepan());
        System.out.println("Nama belakang = " + orang.getNamaBelakang());

        // versi huruf besar
        System.out.println("Nama depan (UPPER) = " + orang.getNamaDepan().toUpperCase());
        System.out.println("Nama belakang (UPPER) = " + orang.getNamaBelakang().toUpperCase());

        System.out.println("Nama Panggilan = " + orang.getNamaPanggilan());
    }
}