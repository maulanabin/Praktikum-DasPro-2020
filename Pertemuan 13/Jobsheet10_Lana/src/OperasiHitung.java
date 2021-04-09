// Maulana Bintang Irfansyah_16_2041720132_TI-1H
import java.util.Scanner;
public class OperasiHitung {
    public static void main(String[] args) {
        int nilai1, nilai2;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");
        nilai1 = input.nextInt();
        System.out.print("Masukkan nilai 2: ");
        nilai2 = input.nextInt();
        int hasil = Pengurangan(nilai1, nilai2);
        System.out.println("Hasil akhir adalah " + hasil);
        System.out.println("Nilai 1 dan Nilai 2 lebih dari " + bilanganPositif(nilai1, nilai2));
    }
    static int bilanganPositif(int e, int f) {
        int g = 0;
        if (e <= 0 && f <= 0) {
        }
        return g;
    }
    static int Perkalian(int c, int d) {
        int h;
        h = (c + 10) * (d + 19);
        return h;
    }
    static int Pengurangan(int a, int b) {
        int x;
        a -= 7;
        b -= 4;
        x = Perkalian(a, b);
        return x;
    }
}
