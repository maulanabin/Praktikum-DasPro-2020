import java.util.Scanner;
public class TugasKedua {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double suhu, celcius, reamur, fahrenheit, kelvin;

        System.out.println("------------------ Program Mengonversi Suhu -----------------");
        System.out.print("Masukkan suhu: ");
        suhu = userInput.nextDouble();
        celcius = suhu;
        reamur = 4 * celcius / 5;
        fahrenheit = (9 * celcius / 5) + 32;
        kelvin = celcius + 273;
        System.out.println("Suhu\t\t: " + suhu);
        System.out.println("Reamur\t\t: " + reamur);
        System.out.println("Fahrenheit\t: " + fahrenheit);
        System.out.println("Kelvin\t\t: " + kelvin);
    }
}

