import java.util.Scanner;

// Maulana Bintang Irfansyah_2041720132_TI-1H
public class perulanganBreak {
    public static void main(String[] args) {
        int angka, b; // variabel
        Scanner inputUser = new Scanner(System.in);
        // perulangan (for) untuk memproses angka bilangan
        for (b = 0; true;) {
            System.out.print("Masukkan bilangan: "); // menerima inputan dari user
            angka = inputUser.nextInt();
            b += angka;
            if (b > 50) {
                break; // keluar dari perulangan jika nilai b > 50
            }
        }
        // hasil pemrosesan angka berhenti saat diketahui jumlah angka-nya
        System.out.printf("Angka berhenti pada jumlah angka %d\n", b);
    }
}