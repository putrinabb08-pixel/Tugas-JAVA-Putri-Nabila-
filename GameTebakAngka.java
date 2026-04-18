import java.util.Random;
import java.util.Scanner;

public class GameTebakAngka {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sudahTerjawab = false;
        int tryCount = 0;

        Random random = new Random();
        int jawaban = random.nextInt(100) + 1; // 1 - 100

        while (!sudahTerjawab) {

            System.out.print("Masukkan tebakan Anda: ");
            int tebakanUser = scanner.nextInt();
            tryCount++; // 🔥 ini yang penting

            if (jawaban > tebakanUser) {
                System.out.println("Terlalu kecil");
            } else if (jawaban < tebakanUser) {
                System.out.println("Terlalu besar");
            } else {
                System.out.println("🎉 TEBAKAN ANDA BENAR");
                sudahTerjawab = true;
            }

            System.out.println();
        }

        System.out.println("Anda berhasil menjawab dalam " + tryCount + "x tebakan");

        scanner.close();
    }
}