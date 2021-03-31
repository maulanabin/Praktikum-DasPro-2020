import java.util.Scanner;

// Maulana Bintang Irfansyah_2041720132_TI-1H
public class faktorialFor {

    public static void main(String[] args) {
        int angka, faktorial, i; // variabel
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan bilangan: "); // menerima inputan dari user
        angka = inputUser.nextInt();
        // perulanngan (for) untuk menghitung faktorial
        faktorial = 1;
        for (i = 1; i <= angka; i++) {
            faktorial = faktorial * i;
        }
        // hasil perhitungan nilai faktorial
        System.out.printf("Nilai faktorial dari %d adalah %d\n", angka, faktorial);
    }
}