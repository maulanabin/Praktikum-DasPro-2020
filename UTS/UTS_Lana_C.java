import java.util.Scanner;
public class UTS_Lana_C {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        double pancake = 27500, rotiTawar = 13000, rotiGandum = 25000, muffin = 30000, bagel = 9000;
        String menu1, menu2;
        int jumlah1, jumlah2;
        System.out.print("Masukkan pilihan menu 1: ");
        menu1 = inputUser.nextLine();
        System.out.print("Masukkan pilihan menu 2: ");
        menu2 = inputUser.nextLine();
        System.out.print("Masukkan jumlah menu 1 yang dipesan: ");
        jumlah1 = inputUser.nextInt();
        System.out.print("Masukkan jumlah menu 2 yang dipesan: ");
        jumlah2 = inputUser.nextInt();
        double harga1 = 0, harga2 = 0;

        if (menu1.equalsIgnoreCase("pancake")) {
            harga1 = pancake * jumlah1;
        } else if (menu1.equalsIgnoreCase("roti tawar")) {
            harga1 = rotiTawar * jumlah1;
        } else if (menu1.equalsIgnoreCase("roti gandum")) {
            harga1 = rotiGandum * jumlah1;
        } else if (menu1.equalsIgnoreCase("muffin")) {
            harga1 = muffin * jumlah1;
        } else if (menu1.equalsIgnoreCase("bagel")) {
            harga1 = bagel * jumlah1;
        }
        if (menu2.equalsIgnoreCase("pancake")) {
            harga2 = pancake * jumlah2;
        } else if (menu2.equalsIgnoreCase("roti tawar")) {
            harga2 = rotiTawar * jumlah2;
        } else if (menu2.equalsIgnoreCase("roti gandum")) {
            harga2 = rotiGandum * jumlah2;
        } else if (menu2.equalsIgnoreCase("muffin")) {
            harga2 = muffin * jumlah2;
        } else if (menu2.equalsIgnoreCase("bagel")) {
            harga2 = bagel * jumlah2;
        }
        double total = harga1 + harga2;

        if ((menu1.equalsIgnoreCase("roti tawar")) || (menu1.equalsIgnoreCase("roti gandum")) && (menu2.equalsIgnoreCase("roti tawar")) || (menu2.equalsIgnoreCase("roti gandum"))) {
            System.out.println("Anda mendapatkan selai gratis");
        } else {
            if ((menu1.equalsIgnoreCase("muffin")) || (menu2.equalsIgnoreCase("muffin")));
                total = total - (total * 0.02);
            }
        if (total >= 100000) {
            System.out.println("Anda mendapatkan puding gratis");
        }
        System.out.printf("Total yang harus dibayar adalah Rp %.2f", total);
    }
}
