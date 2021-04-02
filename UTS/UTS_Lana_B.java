import java.util.Scanner;
public class UTS_Lana_B {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        double kemeja = 85000, celanaPanjang = 120000, kebaya = 198000, gamis = 230000, kaos = 55.000;
        String pilihanPakaian1, pilihanPakaian2;
        int jumlah1, jumlah2;
        System.out.print("Masukkan pilihan pakaian 1: ");
        pilihanPakaian1 = inputUser.nextLine();
        System.out.print("Masukkan pilihan pakaian 2: ");
        pilihanPakaian2 = inputUser.nextLine();
        System.out.print("Masukkan jumlah banyaknya pakaian 1: ");
        jumlah1 = inputUser.nextInt();
        System.out.print("Masukkan jumlah banyaknya pakaian 2: ");
        jumlah2 = inputUser.nextInt();
        double harga1 = 0, harga2= 0;
        if (pilihanPakaian1.equalsIgnoreCase("kemeja")) {
            harga1 = kemeja * jumlah1;
        } else if (pilihanPakaian1.equalsIgnoreCase("celana panjang")) {
            harga1 = celanaPanjang * jumlah1;
        } else if (pilihanPakaian1.equalsIgnoreCase("kebaya")) {
            harga1 = kebaya * jumlah1;
        } else if (pilihanPakaian1.equalsIgnoreCase("gamis")) {
            harga1 = gamis * jumlah1;
        } else if (pilihanPakaian1.equalsIgnoreCase("kaos")) {
            harga1 = kaos * jumlah1;
        }
        if (pilihanPakaian2.equalsIgnoreCase("kemeja")) {
            harga2 = kemeja * jumlah2;
        } else if (pilihanPakaian1.equalsIgnoreCase("celana panjang")) {
            harga2 = celanaPanjang * jumlah2;
        } else if (pilihanPakaian1.equalsIgnoreCase("kebaya")) {
            harga2 = kebaya * jumlah2;
        } else if (pilihanPakaian1.equalsIgnoreCase("gamis")) {
            harga2 = gamis * jumlah2;
        } else if (pilihanPakaian1.equalsIgnoreCase("kaos")) {
            harga2 = kaos * jumlah2;
        }
        double total = harga1 + harga2;

        if ((pilihanPakaian1.equalsIgnoreCase("kemeja")) || (pilihanPakaian1.equalsIgnoreCase("kaos")) || (pilihanPakaian2.equalsIgnoreCase("kemeja")) || (pilihanPakaian2.equalsIgnoreCase("kaos"))) {
            System.out.println("Anda mendapatkan masker gratis");
            if (total >= 350000) {
                total = total - 50000;
            } else {
                if (pilihanPakaian1.equalsIgnoreCase("kebaya") || pilihanPakaian2.equalsIgnoreCase("kebaya")) {
                    System.out.println("Anda mendapatkan sarung tangan gratis");
            }
        }
        System.out.printf("Total belanjaan yang harus dibayar adalah Rp %.2f", total);
    }
}
