import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class UTS_Lana_A {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        double soto = 22000, bakso = 18000, sate = 28000, nasiKuning = 12000, sopAyam = 16500;
        String menu1, menu2;
        int porsi1, porsi2;
        System.out.print("Masukkan menu 1: ");
        menu1 = inputUser.nextLine();
        System.out.print("Masukkan menu 2: ");
        menu2 = inputUser.nextLine();
        System.out.print("Masukkan jumlah porsi menu 1: ");
        porsi1 = inputUser.nextInt();
        System.out.print("Masukkan jumlah porsi menu 2: ");
        porsi2 = inputUser.nextInt();
        double harga1 = 0, harga2 = 0;
        if (menu1.equalsIgnoreCase("soto")) {
            harga1 = soto * porsi1;
        } else if (menu1.equalsIgnoreCase("bakso")) {
            harga1 = bakso * porsi1;
        } else if (menu1.equalsIgnoreCase("sate")) {
            harga1 = sate * porsi1;
        } else if (menu1.equalsIgnoreCase("nasi kuning")) {
            harga1 = nasiKuning * porsi1;
        } else if (menu1.equalsIgnoreCase("sop ayam")) {
            harga1 = sopAyam * porsi1;
        }
        if (menu2.equalsIgnoreCase("soto")) {
            harga2 = soto * porsi2;
        } else if (menu1.equalsIgnoreCase("bakso")) {
            harga2 = bakso * porsi2;
        } else if (menu1.equalsIgnoreCase("sate")) {
            harga2 = sate * porsi2;
        } else if (menu1.equalsIgnoreCase("nasi kuning")) {
            harga2 = nasiKuning * porsi2;
        } else if (menu1.equalsIgnoreCase("sop ayam")) {
            harga2 = sopAyam * porsi2;
        }
        double total = harga1 + harga2;

        if (total >= 70000) {
            System.out.println("Anda mendapatkan voucher");
            if ((menu1.equalsIgnoreCase("bakso")) || (menu1.equalsIgnoreCase("soto")) || (menu2.equalsIgnoreCase("bakso")) || (menu2.equalsIgnoreCase("soto")));
                total = total - (total * 0.05);
        } else {
            System.out.println("Anda mendaptkan es teh manis gratis");
        }
        System.out.printf("Total yang harus dibayar adalah Rp %.2f", total);
    }
}
