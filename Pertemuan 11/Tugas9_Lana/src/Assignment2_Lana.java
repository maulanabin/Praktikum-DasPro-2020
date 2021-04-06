// Maulana Bintang Irfansyah_TI-1H_2041720132
import java.util.ArrayList; // (collection Java util) ArrayList dapat menambah data baru secara dinamis tanpa harus menentukan ukurannya di awal
import java.util.Scanner;
public class Assignment2_Lana {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nomor pilihan menu Anda >> [1. Nilai MIN] | [2. Nilai MIN & Banyaknya] | [3. Kondisi Array]: ");
        int pilihanMenu = inputUser.nextInt();
        System.out.print("Masukkan banyaknya elemen baris: ");
        int banyakBaris = inputUser.nextInt();
        System.out.print("Masukkan banyaknya elemen kolom: ");
        int banyakKolom = inputUser.nextInt();
        int nilai[][] = new int[banyakBaris][banyakKolom];

        // Saya dapat langsung memasukkan elemen-elemen dalam array sebelum memroses (pilihanMenu),
        // jadi penulisan input array dapat ditulus sekali saja sebelum switch.
        for (int x = 0; x < nilai.length; x++) {
            for (int y = 0; y < nilai[x].length; y++) {
                System.out.print("Masukkan nilai elemen ke [" + x + "][" + y + "]: ");
                nilai[x][y] = inputUser.nextInt();
            }
            System.out.println("==================================");
        }
        switch (pilihanMenu) {
            // pilihan 1 >> menentukan elemen nilai minimum
            case 1:
                System.out.println(">>>>>>>>>>> Nilai MIN <<<<<<<<<<<");
                int terkecil = nilai[0][0];
                for (int x = 0; x < nilai.length; x++) {
                    for (int y = 0; y < nilai[x].length; y++) {
                        if (nilai[x][y] < terkecil) {
                            terkecil = nilai[x][y];
                        }
                    }
                }
                System.out.println("Nilai elemen terkecil adalah = " + terkecil);
                System.out.println("++++ Program Nilai Minimum ++++");
                break;

            // pilihan 2 >> saya menuliskan iterasi array pertama kali untuk menentukan elemen minimum,
            // kemudian iterasi array kedua kali untuk menentukan lokasi-lokasi elemen minimum pada array
            // Saya menggunakan ArrayList<Integer[]> untuk menyimpan lokasi-lokasi elemen minimum
            case 2:
                System.out.println(">>>>>>>>>>> Nilai MIN & Banyaknya <<<<<<<<<<<");
                int minimum = nilai[0][0];
                for (int x = 0; x < nilai.length; x++) {
                    for (int y = 0; y < nilai[x].length; y++) {
                        if (nilai[x][y] < minimum) {
                            minimum = nilai[x][y];
                        }
                    }
                }
                // mencari lokasi-lokasi nilai minimum
                ArrayList< Integer[] > lokasiElemenMinimum = new ArrayList< Integer[] >();
                for (int x = 0; x < nilai.length; x++) {
                    for (int y = 0; y < nilai[x].length; y++) {
                        if (nilai[x][y] == minimum) {
                            Integer[] lokasi = {x, y};
                            lokasiElemenMinimum.add(lokasi);
                        }
                    }
                }
                System.out.println("Nilai elemen terkecil adalah = " + minimum);
                System.out.println("Banyaknya nilai terkecil adalah = " + lokasiElemenMinimum.size());
                System.out.println("Nilai terkecil terletak pada indeks baris: ");
                for (int z = 0; z < lokasiElemenMinimum.size(); z++) {
                    System.out.println("[" + lokasiElemenMinimum.get(z)[0] + "]" + "[" + lokasiElemenMinimum.get(z)[1] + "]" );
                }
                System.out.println("++++ Program Nilai Minimum & Banyaknya ++++");
                break;

            // pilihan 3 >> untuk kondisi array, saya hanya perlu mengecek apakah terdapat setidaknya satu elemen array yang bernilai 50?
            // saya deklarasikan >> boolean ditemukan = false << sebelum for loop sebagai tanda apabila elemen dengan 50 sudah ditemukan atau belum
            // apabila sudah ketemu, saya tandai >> ditemukan = true << dan langsung break dari for loop.
            case 3:
                System.out.println(">>>>>>>>>>> Kondisi Array <<<<<<<<<<<");
                boolean ditemukan = false;
                for (int x = 0; x < nilai.length && !ditemukan; x++) {
                    for (int y = 0; y < nilai[x].length && !ditemukan; y++) {
                        if (nilai[x][y] == 50) {
                            ditemukan = true;
                            break;
                        }
                    }
                }
                if (ditemukan) {
                    System.out.println("DITEMUKAN");
                } else {
                    System.out.println("TIDAK DITEMUKAN");
                }
                System.out.println("++++ Program Kondisi Array ++++");
        }
    }
}