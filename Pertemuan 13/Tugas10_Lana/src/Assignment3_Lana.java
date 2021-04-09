// Maulana Bintang Irfansyah_16_2041720132_TI-1H
import java.util.Scanner;
public class Assignment3_Lana {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int jumlahMahasiswa = 10;
        String[] namaMahasiswa = new String[10];
        int[] nilaiMahasiswa = new int[10];
        dataMahasiswa(userInput, namaMahasiswa, nilaiMahasiswa);
        nilaiRataRata(jumlahMahasiswa, nilaiMahasiswa);
    }
    static void dataMahasiswa(Scanner userInput, String[] namaMahasiswa, int[] nilaiMahasiswa) {
        int x = 0;
        while (x < namaMahasiswa.length) {
            System.out.print("Masukkan nama mahasiswa ke " + (x + 1) + ": ");
            namaMahasiswa[x] = userInput.next();
            System.out.print("Masukkan nilai " + namaMahasiswa[x] + ": ");
            nilaiMahasiswa[x] = userInput.nextInt();
            x++;
        }
    }
    static void nilaiRataRata(int jumlahMahasiswa, int[] nilaiMahasiswa) {
        double total = 0;
        int x = 0;
        while (x < nilaiMahasiswa.length) {
            total += nilaiMahasiswa[x];
            x++;
        }
        double rerata = total / jumlahMahasiswa;
        System.out.println("Nilai rata-rata ujian seluruh mahasiswa adalah " + rerata);
    }
}
