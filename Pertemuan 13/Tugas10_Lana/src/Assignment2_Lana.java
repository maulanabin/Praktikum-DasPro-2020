// Maulana Bintang Irfansyah_16_2041720132_TI-1H
import java.util.Scanner;
public class Assignment2_Lana {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("=======================================");
    System.out.println("Menghitung Luas dan Keliling Lingkaran");
    System.out.println("=======================================");
    System.out.print("Masukkan jari-jari lingkaran: ");
    double radiusLingkaran = userInput.nextDouble();
    double luasLingkaran = luas(radiusLingkaran);
    double kelilingLingkaran = keliling(radiusLingkaran);
    System.out.println("♥ Hasil luas lingkaran\t\t = " + luasLingkaran);
    System.out.println("♥ Hasil keliling lingkaran\t = " + kelilingLingkaran);
    }
    static double luas(double r) {
        double rumus1 = 3.14 * r * r;
        return (rumus1);
    }
    static double keliling(double r) {
        double rumus2 = 2 * 3.14 * r;
        return (rumus2);
    }
}
