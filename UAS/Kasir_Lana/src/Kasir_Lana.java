// Maulana Bintang Irfansyah_16_2041720132_TI-1H
import java.util.Scanner;
public class Kasir_Lana {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿");
        System.out.println("-----------------+++++ TOKO BUAH MBAK NINGSIH +++++------------------");
        System.out.println("      Menjual aneka macam buah-buahan yang segar dan berkualitas");
        System.out.println("✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿ ✿");
        System.out.println("Selamat datang ya, Ningsih ❤");
        // Data untuk username & password.
        String username = "ningsih06";
        String password = "11223344";
        System.out.print("Masukkan Username: ");
        String inputUser = userInput.nextLine();
        System.out.print("Masukkan Password: ");
        String inputPass = userInput.nextLine();
        loginToko(userInput, username, password, inputUser, inputPass);

        // Perulangan untuk beli lagi atau tidak.
        boolean buyAgain = true;
        while (buyAgain) {
            // Data Buah.
            // indeks jenis = 0, 1, 2, 3, 4, 5, 6, 7, 8.
            String[] jenisBuah = {"Apel", "Jeruk", "Mangga", "Jambu", "Nanas", "Pisang", "Anggur", "", ""};
            int[] hargaBuah = {20000, 25000, 30000, 25000, 40000, 25000, 30000, 0, 0};

            // Hari saat belanja.
            System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 ");
            System.out.print("Masukkan hari belanja: ");
            String hariBelanja = userInput.nextLine();

            // Entry buah hanya untuk 2 data terakhir.
            entryBuah(userInput, jenisBuah, hargaBuah);

            // Transaksi Pembelian.
            System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 ");
            System.out.print("Berapa jenis buah yang ingin dibeli? ");
            int jenis = userInput.nextInt();
            int[] totalBuahku = new int[jenis];
            int[] jumlahJenisBuah = new int[jenis];
            int[] banyakBuah = new int[jenis];
            int[] total = {0};
            int[] uangPembeli = {0};
            int[] uangKembalian = {0};

            // Struk Buah.
            int[] totalBuah = new int[jenis];
            int totalKeseluruhan = 0;

            transaksiBeliDanTotal(userInput, jenisBuah, hargaBuah, jenis, jumlahJenisBuah, banyakBuah, totalBuah, totalKeseluruhan, totalBuahku, total, uangPembeli, uangKembalian);
            hadiahToko(hariBelanja,total);
            System.out.print("Apakah Anda ingin membeli buah lagi (Ya atau Tidak)? ");
            String beliLagi = userInput.next();
            if (beliLagi.equalsIgnoreCase("ya")) {
                buyAgain = true;
            } else {
                buyAgain = false;
            }
        }
    }
    static void strukBuah(String[] jenisBuah, int[] hargaBuah, int jenis, int[] jumlahJenisBuah, int[] banyakBuah, int[] totalBuah, int totalKeseluruhan, int[] uangPembeli, int[] uangKembalian) {
        System.out.println("==============================================================");
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 STRUK BELANJA 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 ");
        System.out.println("Nama Buah\t\t\t Harga\t\t\t Berat\t\t\t Total\t\t\t");
        for (int i = 0; i < jenis; i++) {
            System.out.println(" " + jenisBuah[i] + "\t\t" + "\t\t Rp " + hargaBuah[i] + "\t\t" + banyakBuah[i] + " kg" + "\t\t\t Rp " + banyakBuah[i] * hargaBuah[i] + "\t\t");
            totalBuah[i] = hargaBuah[jumlahJenisBuah[i]] * banyakBuah[i];
            totalKeseluruhan += totalBuah[i];
        }
        System.out.println("🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹 🌹");
        System.out.println("Total belanja\t: Rp " + totalKeseluruhan);
        System.out.println("Uang Anda\t\t: Rp " + uangPembeli[0]);
        System.out.println("Uang kembalian\t: Rp " + uangKembalian[0]);
        System.out.println("Terima kasih sudah berbelanja di toko kami :)");
        System.out.println("==============================================================");
        System.out.println("Toko Buah Mbak Ningsih: Jln. Bunga Mawar no. 06, Probolinggo");
        System.out.println("Hub. WA (082988884444) | Pesan antar: Gojek & Grab");
    }
    static void hadiahToko(String hariBelanja, int[] total) {
        if ((hariBelanja.equalsIgnoreCase("Rabu")) || (hariBelanja.equalsIgnoreCase("Sabtu")) || (hariBelanja.equalsIgnoreCase("Jumat"))) {
            System.out.println("♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦");
            if (total[0] >= 200000) {
                System.out.println("Selamat Anda mendapatkan hadiah tas ❤");
            } else {
                System.out.println("Tingkatkan belanja Anda agar mendapat hadiah :D");
            }
        } else {
            if ((hariBelanja.equalsIgnoreCase("Senin")) || (hariBelanja.equalsIgnoreCase("Selasa")) || (hariBelanja.equalsIgnoreCase("Kamis"))) {
                System.out.println("♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦ ♦");
                if (total[0] >= 150000) {
                    System.out.println("Selamat Anda mendapatkan hadiah dompet ❤");
                } else {
                    System.out.println("Tingkatkan belanja Anda agar mendapat hadiah :D");
                }
            }
        }
    }
    static void transaksiBeliDanTotal(Scanner userInput, String[] jenisBuah, int[] hargaBuah, int jenis, int[] jumlahJenisBuah, int[] banyakBuah, int[] totalBuah, int totalKeseluruhan, int[] totalBuahku, int[] total, int[] uangPembeli, int[] uangKembalian) {
        for (int i = 0; i < jumlahJenisBuah.length; i++) {
            System.out.println("✩ ✩ ✩ ✩ ✩ ✩ ✩ ✩ ✩ ✩");
            System.out.print(i + 1);
            System.out.print(".    Jenis no.\t: ");
            jumlahJenisBuah[i] = userInput.nextInt() - 1;
            userInput.nextLine();
            System.out.print("      Berapa kg\t: ");
            banyakBuah[i] = userInput.nextInt();
            userInput.nextLine();
            System.out.println("      💕💕 " + jenisBuah[jumlahJenisBuah[i]] + ", " + hargaBuah[jumlahJenisBuah[i]] +
                    " x " + banyakBuah[i] + " = " + (hargaBuah[jumlahJenisBuah[i]] * banyakBuah[i]));
            totalBuahku[i] = hargaBuah[jumlahJenisBuah[i]] * banyakBuah[i];
            total[0] += totalBuahku[i];
        }
        System.out.println("Total\t\t\t= Rp " + total[0]);
        System.out.print("Masukkan uang\t= Rp ");
        uangPembeli[0] = userInput.nextInt();
        uangKembalian[0] = uangPembeli[0] - total[0];
        System.out.println("Kembalian\t\t= Rp " + uangKembalian[0]);
        strukBuah(jenisBuah, hargaBuah, jenis, jumlahJenisBuah, banyakBuah, totalBuah, totalKeseluruhan, uangPembeli, uangKembalian);
    }
    static void entryBuah(Scanner userInput, String[] jenisBuah, int[] hargaBuah) {
        for (int i = 0; i < jenisBuah.length - 2; i++) {
            System.out.println("ღ ღ ღ ღ ღ ღ ღ ღ ღ ღ ღ");
            System.out.print(i + 1);
            System.out.println(".   Jenis buah\t: " + jenisBuah[i]);
            System.out.println("     Harga\t\t: " + hargaBuah[i]);
        }
        for (int j = 7; j < jenisBuah.length; j++) {
            System.out.println("ღ ღ ღ ღ ღ ღ ღ ღ ღ ღ ღ");
            System.out.print(j + 1);
            System.out.print(".   Jenis buah\t: ");
            jenisBuah[j] = userInput.nextLine();
            System.out.print("     Harga\t\t: ");
            hargaBuah[j] = userInput.nextInt();
            userInput.nextLine();
        }
    }
    static void loginToko(Scanner userInput, String username, String password, String inputUser, String inputPass) {
        int count = 1;
        // Membuat while loop, untuk melanjutkan kondisi perulangan < 3.
        while (count <= 2) {
            if ((!inputUser.equals(username)) || (!inputPass.equals(password))) {
                System.out.print("Username atau password salah, coba lagi. Masukkan username: ");
                inputUser = userInput.nextLine();
                System.out.print("Masukkan password: ");
                inputPass = userInput.nextLine();
            } else {
                System.out.println("Anda sekarang sudah masuk ☻");
                break;
            }
            count++;
        }
        if (count > 2) {
            System.out.println("Anda salah memasukkan tiga kali. Silakan coba lagi dalam beberapa menit");
            System.exit(0);
        }
    }
}
