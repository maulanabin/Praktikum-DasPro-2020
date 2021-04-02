import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Percobaan1_Star {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai N: "); // menerima masukkan dari user berupa nilai
        int N = inputUser.nextInt();

        for (int i = 1; i <= N; i++){ // Outer loop melakukan kondisi pengulangan
            System.out.print("*"); // hasil keluaran berupa baris simbol bintang
        }
    }
}
