import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Percobaan3_Triangle {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai N: "); // menerima masukkan dari user berupa nilai
        int N = inputUser.nextInt();
        int i = 0;
        while (i <= N) { // deklarasi perulangan outer loop
            int j = 0;
            while (j < i) { // inner loop
                System.out.print("*"); // hasil keluaran menampilkan simbol bintang
                j++; // menaikkan iterasi
            }
            System.out.println(); // menambah adanya baris baru atau enter
            i++;
        }
    }
}

