import java.util.Scanner;
public class Segitiga {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int alas, tinggi;
        float luas;
        System.out.print("Masukkan alas segitiga: ");
        alas = userInput.nextInt();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = userInput.nextInt();
        luas = (alas * tinggi) / 2;
        System.out.println("Luas segitiga adalah " + luas);
    }
}
