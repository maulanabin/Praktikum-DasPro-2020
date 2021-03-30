import java.util.Scanner;

// Maulana Bintang Irfansyah_20041720132
public class Tugas1_Lana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.println("                Program Menentukan Jenis Segitiga              ");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        /*
         * segitiga sama sisi (ketiga sisinya bernilai sama), segitiga sama kaki (kedua
         * sisinya bernilai sama), segitiga sembarang (tidak ada sisi yang bernilai
         * sama)
         */
        int nilai_sisiA, nilai_sisiB, nilai_sisiC;
        System.out.print("Masukkan nilai sisi segitiga A: ");
        nilai_sisiA = sc.nextInt();
        System.out.print("Masukkan nilai sisi segitiga B: ");
        nilai_sisiB = sc.nextInt();
        System.out.print("Masukkan nilai sisi segitiga C: ");
        nilai_sisiC = sc.nextInt();

        if ((nilai_sisiA == 0) || (nilai_sisiB == 0) || (nilai_sisiC == 0)) {
            System.out.println("Bukan Segitiga");
        } else if ((nilai_sisiA == nilai_sisiB) && (nilai_sisiC == nilai_sisiA)) {
            System.out.println("Segitiga Sama Sisi");
        } else if ((nilai_sisiA == nilai_sisiB) || (nilai_sisiA == nilai_sisiC) || (nilai_sisiB == nilai_sisiC)) {
            System.out.println("Segitiga Sama Kaki");
        } else {
            System.out.println("Segitiga Sembarang");
        }
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
    }
}