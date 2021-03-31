import java.util.Scanner;

// Maulana Bintang Irfansyah_2041720132_TI-1H
public class faktorialWhile {
    public static void main(String[] args) {
        int angka, faktorial, i; // variabel
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan bilangan: "); // menerima inputan dari user
        angka = inputUser.nextInt();
        // perulanngan (while) untuk menghitung faktorial
        faktorial = 1;
        i = 1;
        while (i <= angka) {
            faktorial = faktorial * i;
            i++;
        }
        // hasil perhitungan nilai faktorial
        System.out.printf("Nilai faktorial dari %d adalah %d\n", angka, faktorial);
    }
}