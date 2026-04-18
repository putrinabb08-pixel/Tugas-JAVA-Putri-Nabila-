public class Lingkaran {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    public double luas() {
        return 3.14 * this.r * this.r;
        // atau bisa pakai: return Math.PI * r * r;
    }

    public double keliling() {
        return 2 * Math.PI * this.r;
    }
}