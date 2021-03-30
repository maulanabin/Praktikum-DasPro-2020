import java.util.Scanner;
public class Pemilihan4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.print("Masukkan angka pertama: ");
        angka1 = userInput.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = userInput.nextDouble();
        System.out.print("Masukkan operator (+ - * /)");
        operator = userInput.next().charAt(0);

        switch(operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + hasil);
                break;
            default:
                System.out.println("Operator yang Anda masukkan salah!");
        }
    }
}
