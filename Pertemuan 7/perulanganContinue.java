import java.util.Scanner;

// Maulana Bintang Irfansyah_2041720132_TI-1H
public class perulanganContinue {
    public static void main(String[] args) {
        int angka, b, i, count; // variabel integer
        double avg, total; // variabel double
        Scanner inputUser = new Scanner(System.in);
        b = 0;
        count = 0;
        // perulangan (for) untuk menampilkan jumlah dan rerata bilangan
        for (i = 0; i < 5; i++) {
            System.out.print("Masukkan bilangan: "); // menerima inputan dari user
            angka = inputUser.nextInt();
            if (angka >= 50) { // kondisi pemilihan
                continue; // menyelesaikan sampai batasnya, sisa instruksi yang di dalam for tidak
                          // dikerjakan langsung.
            }
            b += angka; // menambahkan nilai
            count++; // menaikkan nilai
        }
        total = (double) b; // mengubah tipe data dengan widening casting
        // hasil pemrosesan untuk jumlah dan rerata angka
        System.out.printf("Jumlah angka kurang dari 50: %.2f\n", total);
        avg = (double) b / count;
        System.out.printf("Rata-rata angka kurang dari 50: %.2f\n", avg);
    }
}