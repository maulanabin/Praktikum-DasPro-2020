// Maulana Bintang Irfansyah_16_2041720132_TI-1H
import java.util.Scanner;
public class Assignment1_Lana {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("=======================Static Method Java=====================");
        System.out.println("++++++++++++++Program Mengetahui Banyaknya Buah+++++++++++++++");
        System.out.print("Masukkan jumlah buah: ");
        int jumlahBuah = userInput.nextInt();
        String[] namaBuah = new String[jumlahBuah];
        int[] banyakBuah = new int[jumlahBuah];
        masukkanNamaDanBanyakBuah(userInput, jumlahBuah, namaBuah, banyakBuah);
        int hasil = buahTerbanyak(jumlahBuah, namaBuah, banyakBuah);
        System.out.println("Nominal buah terbanyak: " + hasil);

        System.out.println("=====================Jawaban Tugas 1 - Jobsheet 10=====================");
        System.out.println("Bilangan 1 = 30 | Bilangan 2 = 40 | Bilangan 3 = 50");
        System.out.println("Nilai maksimum dari ketiga bilangan di atas adalah " + nilaiMaksimum(30, 40, 50));
    }
    static void masukkanNamaDanBanyakBuah(Scanner userInput, int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
        for (int i = 0; i < jumlahBuah; i++) {
            System.out.print("Masukkan nama buah " + (i + 1) + ": ");
            namaBuah[i] = userInput.next();
            System.out.print("Masukkan banyak buah " + namaBuah[i] + ": ");
            banyakBuah[i] = userInput.nextInt();
        }
    }
    static int buahTerbanyak(int jumlahBuah, String[] namaBuah, int[] banyakBuah) {
        String namaBuahTerbanyak = "";
        int jumlahBuahTerbanyak = 0;
        for (int i = 0; i < jumlahBuah; i++) {
            if (banyakBuah[i] > jumlahBuahTerbanyak) {
                jumlahBuahTerbanyak = banyakBuah[i];
                namaBuahTerbanyak = namaBuah[i];
            }
        }
        System.out.println("Buah terbanyak adalah " + namaBuahTerbanyak + " (" + jumlahBuahTerbanyak + ")");
        return jumlahBuahTerbanyak;
    }
    static int nilaiMaksimum(int bil1, int bil2, int bil3) {
        int maksimum = bil1;
        if (bil2 > maksimum) maksimum = bil2;
        if (bil3 > maksimum) maksimum = bil3;
        return maksimum;
    }
}
/* Penjelasan tentang program "Mengetahui Banyaknya Buah"
Inisialisasi jumlahBuahTerbanyak = 0 dan namaBuahTerbanyak = "" sebelum iterasi,
kemudian saat iterasi, cek apabila buahTerbanyak[i] > jumlahBuahTerbanyak. Apabila ya,
maka buah ini untuk sekarang merupakan buah dengan jumlah terbanyak.
Kita lakukan ini hingga akhir elemen array. Pada akhir, kita akan dapat mengetahui nama dan jumlah buah terbanyak.
Fungsi buahTerbanyak akan return nominal terbanyak buah yang merupakan int.
Sebagai ilustrasi, saya tambah println yang akan menunjukkan nama dan jumlah buah terbanyak.
Apabila fungsi sudah terdefinisi, panggil fungsi buahTerbanyak di dalam fungsi main, kemudian simpan hasilnya di variabel hasil,
hasil ini kemudian dicetak. (Untuk dua buah atau lebih dengan jumlah maksimal yang sama, maka buah yang paling awal yang diambil)
 */