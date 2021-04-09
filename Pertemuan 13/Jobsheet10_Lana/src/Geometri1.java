// Maulana Bintang Irfansyah_16_2041720132_TI-1H
import java.util.Scanner;
public class Geometri1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, luas, volume;
        System.out.print("Masukkan panjang: ");
        panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah " + luas);
        volume = panjang * lebar * tinggi;
        System.out.println("Volume balok adalah " + volume);
    }
}

