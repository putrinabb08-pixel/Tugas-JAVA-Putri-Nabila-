public class Orang1 {

    String namaDepan;
    String namaBelakang;
    String titel;

    public Orang1(String namaDepan, String namaBelakang, String jenisKelamin) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        setJenisKelamin(jenisKelamin);
    }

    public String namaLengkap() {
        return titel + " " + namaDepan + " " + namaBelakang;
    }

    public void setJenisKelamin(String jenisKelamin) {
        if (jenisKelamin != null) {
            if (jenisKelamin.equalsIgnoreCase("L")) {
                this.titel = "Bapak";
            } else if (jenisKelamin.equalsIgnoreCase("P")) {
                this.titel = "Ibu";
            } else {
                this.titel = "";
            }
        } else {
            this.titel = "";
        }
    }
}