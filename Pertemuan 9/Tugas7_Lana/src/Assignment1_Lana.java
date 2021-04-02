import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Assignment1_Lana {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda untuk mencetak pola segitiga: "); // menerima inputan dari user berupa nilai
        int nilaiUser = inputUser.nextInt();
        int a = 1; // deklarasi awal untuk variabel a yang bernilai 1
        // menggunakan perulangan for untuk membuat program segitiga siku-siku
        for (int b = nilaiUser; b >= 1; b--){ // for pertama untuk menentukan nilai dan variabel awal
            for (int c = b - 1; c >= 1; c--){ // for kedua agar menentukan membuat tampilan menjadi segitiga siku-siku
                System.out.print(" ");
            }
            for (int d = 1; d <= a; d++){ // for ketiga untuk menentukan dari mulai angka berapa user akan membuat segitiga (angka awal)
                System.out.print(d);
            }
            a += 1;
            System.out.print("\n");
        }
    }
}
