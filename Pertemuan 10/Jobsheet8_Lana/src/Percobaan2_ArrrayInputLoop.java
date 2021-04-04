import java.util.Scanner;
// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Percobaan2_ArrrayInputLoop {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int[] nilaiUAS = new int[6]; // instansiasi array dengan batasan elemen enam
        // for loop untuk menerima inputan dari user berupa nilai UAS yang nantinya ada enam nilai yang diinputkan
        for (int i = 0; i < nilaiUAS.length; i++) { // dengan adanya looping dapat mengisikan array secara otomatis
            System.out.print("Masukkan nilai UAS ke " + i + ": ");
            nilaiUAS[i] = inputUser.nextInt();
        }
        for (int i = 0; i < nilaiUAS.length; i++) { // for loop untuk mengecek kondisi nilai yang lulus atau tidak lulus
            if (nilaiUAS[i] > 70) {
                System.out.println("Mahasiswa " + i + " Lulus");
            } else {
                System.out.println("Mahasiswa " + i + " Gagal");
            }
        }
    }
}
