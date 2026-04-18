import java.util.Random;

public class AdminTebakAngka {
    private int jawaban;
    private int tryCount;
    private boolean sudahTerjawab;

    public AdminTebakAngka() {
        Random random = new Random();
        this.jawaban = random.nextInt(100) + 1; // 1 - 100
        this.tryCount = 0;
        this.sudahTerjawab = false;
    }

    public void tebak(int angka) {
        if (sudahTerjawab) {
            return;
        }

        if (jawaban > angka) {
            System.out.println("Terlalu kecil");
        } else if (jawaban < angka) {
            System.out.println("Terlalu besar");
        } else {
            System.out.println("🎉 TEBAKAN ANDA BENAR");
            sudahTerjawab = true;
        }

        tryCount++;
    }

    public int getTryCount() {
        return tryCount;
    }

    public boolean isSudahTerjawab() {
        return sudahTerjawab;
    }
}