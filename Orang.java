public class Orang {
    // atribut / properti
    String namaDepan;
    String namaBelakang;

    // method untuk gabung nama
    public String namaLengkap() {
        return this.namaDepan + " " + this.namaBelakang;
    }

    // method untuk cetak
    public void cetakNamaLengkap() {
        System.out.println(this.namaLengkap());
    }
}