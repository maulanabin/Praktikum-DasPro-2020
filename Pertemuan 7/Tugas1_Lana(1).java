import java.util.Scanner; // library java
// Maulana Bintang Irfansyah_2041720132_TI-1H

public class Tugas1_Lana {
    // program menampilkan bilangan tanpa kelipatan 5 :)
    public static void main(String[] args) {
        int nilai, a; // deklarasi variabel
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan angka Anda: "); // menerima inputan dari user berupa angka
        nilai = inputUser.nextInt();

        // perulangan (for), dapat pula menggunakan while atau do-while
        for (a = 1; a <= nilai; a++) {
            if (a % 5 != 0) { // modulus 5, jadi kelipatan 5 tidak akan ditampilkan di program
                System.out.println(a);
            }
        }
        inputUser.close(); // menutup library scanner
        System.out.println("");
        // Terima kasih...
    }
}