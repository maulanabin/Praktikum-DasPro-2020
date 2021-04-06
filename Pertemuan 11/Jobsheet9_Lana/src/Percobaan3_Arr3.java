// Maulana Bintang Irfansyah_TI-1H_2041720132
import java.util.Scanner;
public class Percobaan3_Arr3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen baris: ");
        int banyakBaris = input.nextInt();
        System.out.print("Masukkan banyaknya elemen kolom: ");
        int banyakKolom = input.nextInt();
        int nilai[][] = new int[banyakBaris][banyakKolom];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print("Masukkan nilai ke [" + i + "][" + j + "]: ");
                nilai[i][j] = input.nextInt();
            }
            System.out.println("-----------------");
        }
        for (int arrayMultidimensi[] : nilai) {
            for (int k: arrayMultidimensi) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
}