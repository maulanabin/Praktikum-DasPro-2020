import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class cobaSaja {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        double total = 0; // inisialiasasi variabel
        double rata; // deklarasi variabel

        System.out.print("Masukkan jumlah mahasiswa: "); // menerima masukkan dari user berupa jumlah mahasiswa
        int jumlah_mhs = inputUser.nextInt();
        int[] nilai = new int[jumlah_mhs]; // deklarasi dan instansiasi dengan isi elemen dari variabel jumlah_mhs
        // for loop untuk menerima inputan dari user berupa nilai mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke " + (i + 1) + ": ");
            nilai[i] = inputUser.nextInt();
        }
        for  (int i = 0; i < nilai.length; i++) { // perulangan untuk menjumlahkan variabel total dan nilai
            total += nilai[i];
        }
        rata = total / nilai.length; // perhitungan operasi pembagian antara total dengan banyaknya data / elemen untuk mendapatkan rata-rata
        System.out.println("Rata-rata nilai kelas adalah " + rata);
    }
}