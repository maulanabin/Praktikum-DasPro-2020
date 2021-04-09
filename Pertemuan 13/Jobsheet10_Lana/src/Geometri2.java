// Maulana Bintang Irfansyah_16_2041720132_TI-1H
import java.util.Scanner;
public class Geometri2 {
    // tujuan fungsi yaitu memudahkan pengembangan program ketika suatu program memiliki beberapa aktivitas/kegiatan,
    // contohnya menghitung luas, keliling, volume, dll.(Diketikkan per aktivitas-nya dalam sebuah fungs)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, tinggi, luas, volume; // deklarasi variabel
        System.out.print("Masukkan panjang: "); // input panjang dari user
        panjang = input.nextInt();
        System.out.print("Masukkan lebar: "); // input lebar dari user
        lebar = input.nextInt();
        System.out.print("Masukkan tinggi: "); // input tinggi dari user
        tinggi = input.nextInt();
        luas = hitungLuas(panjang, lebar); // mengirimkan panjang dan lebar dari fungsi hitungLuas
        System.out.println("Luas persegi panjang adalah " + luas); // output luas persegi panjang
        volume = hitungVolume(tinggi, panjang, lebar); // mengirimkan tinggi, panjang, dan lebar dari fungsi hitungVolume
        System.out.println("Volume balok adalah " + volume); // output volume balok
    }
    // fungsi untuk menghitung luas persegi panjang
    static int hitungLuas(int pjg, int lbr) { // menghitung luas membutuhkan 2 variabel saja panjang dan lebar
        int luas = pjg * lbr; // penulisan rumus luas
        return luas; // mengembalikan nilai luas pada fungsi main
    }
    // fungsi untuk menghitung volume balok
    static int hitungVolume(int tinggi, int p, int l) { // menghitung volume membutuhkan 3 variabel
        int vol = hitungLuas(p, l) * tinggi; // sintaks ini tidak menghitung dengan rumus p * l * t, tetapi memanfaatkan fungsi hitungLuas (panjang dan lebar)
        // sehingga perlu menambahkan 1 variabel saja yaitu tinggi, jadi hitungLuas dipanggil (a,b) bertemu hasilnya, dan dikalikan tinggi menjadi volume
        return vol; // mengembalikan nilai vol
    }
}
// hasil keluaran program saat dijalankan
// Masukkan panjang: 9
// Masukkan lebar: 7
// Masukkan tinggi: 3
// Luas persegi panjang adalah 63
// volume balok adalah 189
