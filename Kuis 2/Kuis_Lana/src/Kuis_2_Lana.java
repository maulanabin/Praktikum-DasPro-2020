// Maulana Bintang Irfansyah_2041720132_TI-1H
import java.util.Scanner;
public class Kuis_2_Lana {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Program Menentukan No Absen Bilangan Ganjil & Genap");
        System.out.println("==========================================================");
        System.out.print("Masukkan Bilangan Angka: ");
        int absen = inputUser.nextInt();
        System.out.println("Mahasiswa Absen Genap");
        for (int i = 1; i <= absen; i++){
            for (int j = 1; j <= i; j++){
                if (i % 2 == 0) {
                    System.out.print(i * 1 + " ");
                }
            }
            System.out.print("\n");
        }
        System.out.println("Mahasiwa Absen Ganjil");
        for (int i = 1; i <= absen; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(i * 1 + " ");
                }
            }
            System.out.print("\n");
        }
    }
}

