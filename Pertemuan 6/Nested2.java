import java.util.Scanner;

// Maulana Bintang Irfansyah_2041720132
public class Nested2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻");
        System.out.println("  Program Menghitung Gaji Bersih Seseorang           ");
        System.out.println("✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻");
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;
        System.out.print("Masukkan kategori: ");
        kategori = sc.nextLine();
        System.out.print("Masukkan besarnya penghasilan: ");
        penghasilan = sc.nextInt();
        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println(("Gaji bersih yang Anda terima: ") + gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Gaji bersih yang Anda terima: " + gajiBersih);
        } else {
            System.out.println("Kategori yang Anda masukkan salah");
        }
        System.out.println("✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻✻");
    }
}