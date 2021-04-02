import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Assignment2_Lana {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda untuk mencetak pola segitiga bintang terbalik: "); // menerima inputan dari user berupa nilai
        int nilaiUser = inputUser.nextInt();
        int x = nilaiUser; // deklarasi nilai variabel x berupa nilai dari nilauUser yang diinputkan
        // menggunakan perulangan for untuk membuat program segitiga simbol bintang terbalik
        for(int y = 1; y <= x; y++){ // outer loop (perulangan luar)
            for(int z = x; z >= y; z--){ // inner loop (perulangan dalam)
                System.out.print("*"); // digunakan untuk menampilkan simbol bintang
            }
            System.out.print("\n"); // untuk menambah spasi ke bawah agar membentuk pola segitiga
        }
    }
}
