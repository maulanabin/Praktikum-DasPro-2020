import java.util.Scanner;
public class Pemilihan2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int nilaiPertama, nilaiKedua, rataRata;
        System.out.print("Masukkan bilangan 1: ");
        nilaiPertama = userInput.nextInt();
        System.out.print("Masukkan bilangan 2: ");
        nilaiKedua = userInput.nextInt();

        rataRata = (nilaiPertama + nilaiKedua) / 2;

        if (rataRata >= 100) {
            rataRata -= 5;
        } else {
            System.out.println(rataRata);
        }
        System.out.println("Hasil nilai akhir adalah " + rataRata);
    }
}
