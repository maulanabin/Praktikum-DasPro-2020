import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Assignment4_Lana {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda untuk mencetak pola persegi: "); // menerima inputan dari user berupa nilai
        int nilaiUser = inputUser.nextInt();
        // menggunakan perulangan for untuk membuat program pola persegi angka
        for (int baris = 1; baris <= nilaiUser; baris++) { // for pertama untuk menentukan nilai dan variabel awal
            for (int kolom = 1; kolom <= nilaiUser; kolom++) { // for kedua agar menentukan membuat tampilan pola persegi angka
                if( baris %2 != 0) // menggunakan pemilihan if else untuk menentukan baris dan kolom nilai nya
                    System.out.printf("%d ", kolom);
                else
                    System.out.printf("%d ", (nilaiUser + 1) - kolom );
            }
            System.out.print("\n");
        }
    }
}

