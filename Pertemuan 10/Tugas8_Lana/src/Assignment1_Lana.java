import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Assignment1_Lana {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int banyakArray[] = new int[5]; // deklarasi dan instansiasi dengan isi elemen 5
        // array loop dengan menerima inputan nilai dari user sebanyak isi elemen array
        for (int x = 0; x < banyakArray.length; x++ ) {
            System.out.print("Masukkan nilai Anda untuk elemen array ke " + x + ": " );
            banyakArray[x] = inputUser.nextInt();
        }
        System.out.println("-----------------------------------------------");
        for (int y = banyakArray.length - 1; y >= 0; y--) { // sintaks array loop ini akan mengurutkan terbalik angka yang telah dimasukkan oleh user
            System.out.println(banyakArray[y]);
        }
    }
}
