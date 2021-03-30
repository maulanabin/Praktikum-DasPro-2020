import java.util.Scanner;
public class TugasPertama {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int bilanganPertama, bilanganKedua;
        System.out.print("Masukkan bilangan satu: ");
        bilanganPertama = userInput.nextInt();
        System.out.print("Masukkan bilangan dua: ");
        bilanganKedua = userInput.nextInt();

        if (bilanganPertama > bilanganKedua) {
            System.out.println("Bilangan yang terbesar adalah bilangan pertama sebesar: " + bilanganPertama);
        } else {
            System.out.println("Bilangan yang terbesar adalah bilangan kedua sebesar: " + bilanganKedua);
        }


    }
}
