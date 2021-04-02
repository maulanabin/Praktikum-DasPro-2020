import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Assignment3_Lana {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan simbol atau angka untuk mencetak pola: "); // menerima inputan yang diinginkan oleh user berupa simbol atau angka
        String polaUser = inputUser.nextLine(); // menggunakan tipe data String untuk variabel polaUser agar menerima inputan simbol atau angka
        System.out.print("Masukkan jumlah nilai: "); // menerima inputan yang diinginkan oleh user berupa nilai
        int nilaiUser = inputUser.nextInt();
        // menggunakan perulangan for untuk membuat program pola persegi berongga
        for(int i = 1; i <= nilaiUser; i++) { // for pertama untuk menentukan nilai dan variabel awal
            System.out.println();
            if(i == 1 || i == nilaiUser) {
                for(int j = 1; j <= nilaiUser; j++){
                    System.out.print(polaUser + " ");
                }
            }
            else {
                for(int k = 1; k <= nilaiUser; k++) {

                    if(k == 1 || k == nilaiUser) {

                        System.out.print(polaUser + " ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
            }
        }
    }
}