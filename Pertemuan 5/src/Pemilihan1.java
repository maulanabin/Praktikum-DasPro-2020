import java.util.Scanner;
public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int bil;
        System.out.print("Masukkan sebuah bilangan: ");
        bil = userInput.nextInt();

//        if (bil % 2 == 0) {
//            System.out.println("Bilangan genap");
//        } else {
//            System.out.println("Bilangan ganjil");
//        }
        String output = (bil % 2 == 0) ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println(output);
    }
}
