import java.util.Scanner;
public class TugasKedua {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int umur;
        System.out.print("Masukkan umur Anda: ");
        umur = userInput.nextInt();

        if (umur >= 17) {
            System.out.println("Anda boleh berkendara");
        } else {
            System.out.println("Anda tidak boleh berkendara!");
        }
    }
}
