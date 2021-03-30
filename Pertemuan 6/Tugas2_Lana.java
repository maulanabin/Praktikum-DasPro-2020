import java.util.Scanner;

// Maulana Bintang Irfansyah_2041720132
public class Tugas2_Lana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama_makanan;
        int harga_makanan, pengiriman_ekspres, biaya_pengiriman, total_bayar;
        System.out.println("⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ");
        System.out.println("                            RUMAH MAKAN JANJI JIWA                         ");
        System.out.println("⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ");
        System.out.print("Masukkan Nama Makanan\t: ");
        nama_makanan = sc.nextLine();
        System.out.print("Masukkan Harga Makanan\t: ");
        harga_makanan = sc.nextInt();
        System.out.print("Apakah Anda ingin pengiriman ekspres ? (0 = tidak, 1 = ya) ? : ");
        pengiriman_ekspres = sc.nextInt();
        System.out.println("⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ⚘ ");

        System.out.println();
        if (pengiriman_ekspres == 1) {
            System.out.println("✤✤✤✤✤✤✤✤✤✤     STRUK ANDA     ✤✤✤✤✤✤✤✤✤✤");
            System.out.println("✤✤✤✤✤✤✤✤✤✤ PENGIRIMAN EKSPRES ✤✤✤✤✤✤✤✤✤✤");
            if (harga_makanan >= 100000) {
                biaya_pengiriman = 30000;
                System.out.println(nama_makanan + "\t\t : Rp " + harga_makanan);
                System.out.println("Biaya Pengiriman \t : Rp " + biaya_pengiriman);
                System.out.println("Biaya Tambahan Ekspres   : Rp " + 25000);
                total_bayar = harga_makanan + biaya_pengiriman + 25000;
                System.out.println("Total \t\t\t : Rp " + total_bayar);
                System.out.println("Terima kasih atas kunjungan Anda :)");
            } else {
                biaya_pengiriman = 20000;
                System.out.println(nama_makanan + "\t\t : Rp " + harga_makanan);
                System.out.println("Biaya Pengiriman \t : Rp " + biaya_pengiriman);
                System.out.println("Biaya Tambahan Ekspres   : Rp " + 25000);
                total_bayar = harga_makanan + biaya_pengiriman + 25000;
                System.out.println("Total \t\t\t : Rp " + total_bayar);
                System.out.println("Terima kasih atas kunjungan Anda :)");
            }
            System.out.println("✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤");
        } else {
            System.out.println("✤✤✤✤✤✤✤✤✤✤     STRUK ANDA     ✤✤✤✤✤✤✤✤✤✤");
            System.out.println("✤✤✤✤✤✤✤✤✤✤ PENGIRIMAN REGULER ✤✤✤✤✤✤✤✤✤✤");
            if (harga_makanan >= 100000) {
                biaya_pengiriman = 30000;
                System.out.println(nama_makanan + "\t\t : Rp " + harga_makanan);
                System.out.println("Biaya Pengiriman \t : Rp " + biaya_pengiriman);
                System.out.println("Biaya Tambahan Reguler   : Rp " + 0);
                total_bayar = harga_makanan + biaya_pengiriman;
                System.out.println("Total \t\t\t : Rp " + total_bayar);
                System.out.println("Terima kasih atas kunjungan Anda :)");
            } else {
                biaya_pengiriman = 20000;
                System.out.println(nama_makanan + "\t\t : Rp " + harga_makanan);
                System.out.println("Biaya Pengiriman \t : Rp " + biaya_pengiriman);
                System.out.println("Biaya Tambahan Reguler   : Rp " + 0);
                total_bayar = harga_makanan + biaya_pengiriman;
                System.out.println("Total \t\t\t : Rp " + total_bayar);
                System.out.println("Terima kasih atas kunjungan Anda :)");
            }
            System.out.println("✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤✤");
        }
    }
}