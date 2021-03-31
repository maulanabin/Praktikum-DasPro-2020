import java.util.*; // library Scanner

// Maulana Bintang Irfansyah_2041720132_TI-1H
public class faktorialDoWhile {
    public static void main(String[] args) {
        int angka, faktorial, i; // variabel
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan bilangan: "); // menerima inputan dari user
        angka = inputUser.nextInt();
        // perulanngan (do while) untuk menghitung faktorial
        faktorial = 1;
        i = 1;
        do {
            faktorial = faktorial * i;
            i++;
        } while (i <= angka);
        // hasil perhitungan nilai faktorial
        System.out.printf("Nilai faktorial dari %d adalah %d\n", angka, faktorial);
    }
}