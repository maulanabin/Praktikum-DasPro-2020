import java.util.Scanner; // library java
// Maulana Bintang Irfansyah_2041720132_TI-1H

public class Tugas2_Lana {
    public static void main(String[] args) {
        // deklarasi variabel
        int pilihan, m = 0, b = 1, angka, hitungAngka = 0, jumlah;
        double rerata;
        Scanner inputUser = new Scanner(System.in);
        System.out.println("❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀");
        System.out.println("                 PROGRAM BILANGAN GANJIL DAN GENAP           ");
        System.out.println("❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀");
        System.out.println("Masukkan Pilihan [1. Ganjil] | [2. Genap] : "); // menerima inputan untuk memilih 1 atau 2
        pilihan = inputUser.nextInt();
        System.out.print("Masukkan angka (ganjil/genap) Anda : "); // menerima inputan dari user untuk memasukkan angka
                                                                   // bilangan ganjil atau genap
        angka = inputUser.nextInt();
        // pemilihan switch case
        switch (pilihan) {

            case 1: // pilihan bilangan ganjil
                System.out.println("==========================Bilangan Ganjil============================");
                System.out.println("Banyaknya bilangan ganjil dari 1 sampai " + angka + " adalah " + angka / 2);
                for (int i = 1; i <= angka; i++) { // perulangan (for), dapat pula diganti dengan while
                    if (i % 2 != 1) { // jika i modulus 2 tidak != 1, maka nilainya bilangan ganjil
                        continue; // melanjutkan eksekusi loop ke tahap berikutnya
                    }
                    m += i; // menambahkan jumlah
                    hitungAngka++; // menaikkan nilai variabel yang dilakukan perulangan
                    // output atau keluaran bilangan
                    System.out.println("❖ Bilangan Ganjil " + b++ + " adalah " + i + " ❖ ");
                }
                jumlah = m;
                // output atau keluaran jumlah bilangan
                System.out.println("==Jumlah bilangan ganjil dari 1 sampai " + angka + " adalah " + jumlah);
                rerata = (double) m / hitungAngka;
                // output atau keluaran rata-rata bilangan
                System.out.printf("==Rata rata bilangan ganjil adalah : %.2f\n", rerata);
                break; // mengakhiri eksekusi statement

            case 2: // pilihan bilangan genap
                System.out.println("==========================Bilangan Genap=============================");
                System.out.println("Banyaknya bilangan genap dari 1 sampai " + angka + " adalah " + angka / 2);
                for (int i = 1; i <= angka; i++) { // perulangan (for) dapat pula diganti dengan while
                    if (i % 2 == 1) { // jika i modulus 2 == 1, maka nilainya bilangan genap
                        continue; // melanjutkan eksekusi loop ke tahap berikutnya
                    }
                    m += i; // menambahkan jumlah
                    hitungAngka++; // menaikkan nilai variabel yang dilakukan perulangan
                    // output atau keluaran bilangan
                    System.out.println("❖ Bilangan Genap " + b++ + " adalah " + i + " ❖ ");
                }
                jumlah = m;
                // output atau keluaran jumlah bilangan
                System.out.println("==Jumlah bilangan genap dari 1 sampai " + angka + " adalah " + jumlah);
                rerata = (double) m / hitungAngka;
                // output atau keluaran rata-rata bilangan
                System.out.printf("==Rata rata bilangan genap adalah : %.2f\n", rerata);
                break; // mengakhiri eksekusi statement
        }
        inputUser.close(); // menutup library scanner
        System.out.println("");
        // Terima kasih...
    }
}