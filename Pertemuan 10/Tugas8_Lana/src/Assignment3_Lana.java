import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Assignment3_Lana {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen: "); // menerima masukkan dari user berupa jumlah elemen
        int banyakArray = inputUser.nextInt();
        int nilai[] = new int[banyakArray]; // deklarasi variabel untuk menerima jumlah elemen array dari user

        for (int k = 0; k < nilai.length; k++ ) {  // array loop 
            System.out.print("Masukkan nilai elemen ke " + (k + 1) + ": ");
            nilai[k] = inputUser.nextInt();
        }
        for (int k = 0; k < banyakArray; k++) {
            if (nilai[k] % 2 == 0) { // kondisi pemilihan jika variabel nilai bilangan genap
                System.out.println("Angka genap: " + (nilai[k]));
            }
        }
        for (int k = 0; k < banyakArray; k++) {
            if (nilai[k] % 2 != 0) { // kondisi pemilihan jika variabel nilai bilangan ganjil
                System.out.println("Angka ganjil: " + (nilai[k]));
            }
        }
    }
}