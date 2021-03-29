import java.util.Scanner;
public class Kuis_Lana_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double kg, ton, gram;

        System.out.println("---------- Program Konversi Berat Badan ----------");
        System.out.print("Masukkan berat badan: ");
        kg = userInput.nextDouble();
        ton = kg / 1000;
        gram = kg * 1000;

        System.out.print("Berat badan Anda " + kg + " atau " + gram + " atau " + ton + " ton" + "\n");
    }
}
