public class LatihanOrang1 {

    String namaDepan;
    String namaBelakang;
    String titel;

    public LatihanOrang1 (String namaDepan, String namaBelakang, String jenisKelamin) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        setJenisKelamin(jenisKelamin);
    }

    public String namaLengkap() {
        return namaDepan + " " + namaBelakang;
    }

    public void setJenisKelamin(String jenisKelamin) {
        if (jenisKelamin.equalsIgnoreCase("L")) {
            titel = "Bapak";
        } else if (jenisKelamin.equalsIgnoreCase("P")) {
            titel = "Ibu";
        } else {
            titel = "";
        }
    }

    public String getTitel() {
        return titel;
    }
}