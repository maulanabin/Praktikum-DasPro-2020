import java.util.Scanner; // library scanner
import java.util.Random; // library random
// Maualan Bintang Irfansyah_2041720132_TI-1H
public class Percobaan4_Quiz {
    public static void main(String args[]) {

        Scanner inputUser = new Scanner(System.in); // untuk menerima inputan dari user
        Random rand = new Random(); // untuk melakukan pengacakan yang dilakukan oleh komputer
        // deklarasi variable
        int answer, step;
        char menu = 'y';
        System.out.println("❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ");
        System.out.println("                        Program Kuis Tebak Angka ");
        System.out.println("❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ❀ ");
        // nested do-while loop
        do {
            answer = 0;
            step = 0;
            int number = rand.nextInt(10) + 1; // mengacak angka dari 0-9, agar memudahkan pembacaan perlu ditambahkan +1
            boolean success = false; // data boolean diatur menajadi false

            do {
                System.out.print("Masukkan angka tebakan Anda (1-10): "); // menerima masukkan dari user berupa nilai
                answer = inputUser.nextInt();
                inputUser.nextLine();
                success = (answer == number);
                step++;
                // mengecek kondisi angka yang ditebak besar atau kecil
                if (answer > number) {
                    System.out.println("Maaf angka yang Anda tebak Kebesaran!");
                } else if (answer < number) {
                    System.out.println("Maaf angka yang Anda tebak Kekecilan!");
                } else {
                    System.out.println("Selamat! Anda menebak dalam " + step + " kali");
                }
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (Y/T)");
            menu = inputUser.next().charAt(0); // mengambil 1 karakter
            System.out.println();
        } while (menu == 'Y' || menu == 'y');
    }
}
