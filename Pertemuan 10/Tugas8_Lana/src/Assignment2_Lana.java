import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Assignment2_Lana {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen: ");
        int banyakArray = inputUser.nextInt(); // deklarasi variabel untuk menerima jumlah elemen array dari user
        int nilai[] = new int[banyakArray]; // deklarasi dan instansiasi array dengan isi elemen yang dimasukkan oleh user

        for (int i = 0; i < nilai.length; i++ ) { // array loop untuk menerima nilai elemen dari user
            System.out.print("Masukkan nilai elemen ke: " + (i + 1) + ": ");
            nilai[i] = inputUser.nextInt();
        }
        int terbesar = nilai[0];
        for (int j = 0; j < banyakArray; j++ ) { // array loop untuk menentukan nilai elemen terbesar agar dapat ditampilkan
            if (nilai[j] > terbesar) {
             terbesar = nilai[j];
            }
        }
        System.out.println("Nilai terbesar elemen adalah " + terbesar);
    }
}

