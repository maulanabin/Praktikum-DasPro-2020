import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Percobaan2_Square {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai N: "); // menerima masukkan dari user berupa nilai
        int N = inputUser.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++ ) { // Outer loop melakukan kondisi pengulangan
            for (int i = 1; i <= N; i++) {  // Inner loop menampilkan satu baris simbol bintang
                System.out.print("*"); // hasil keluaran berupa baris simbol bintang
            }
            System.out.println("");
            // untuk adanya baris baru atau enter, agar menghasilkan keluaran bentuk simbol bintang persegi
        }
    }
}
