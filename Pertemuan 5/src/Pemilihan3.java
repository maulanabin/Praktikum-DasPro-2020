import java.util.Scanner;
public class Pemilihan3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int umur;
        System.out.print("Masukkan umur Anda: ");
        umur = userInput.nextInt();

        if (umur > 65) {
            System.out.println("Lansia");
        } else if (umur > 18) {
            System.out.println("Dewasa");
        } else if (umur > 12) {
            System.out.println("Remaja");
        } else if (umur > 5) {
            System.out.println("Anak-anak");
        } else if (umur <= 0) {
            System.out.println("Maaf umur yang Anda masukkan salah");
        } else {
            System.out.println("Toddler");
        }


    }
}
