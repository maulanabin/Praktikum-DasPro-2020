// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Percobaan1_MyArray {
    public static void main(String[] args) {
        int[] bil = new int[4]; // deklarasi dan instansiasi array dengan isi elemen empat
        // mengisi data pada array
        bil[0] = 5;
        bil[1] = 12;
        bil[2] = 7;
        bil[3] = 20;

        for (int i = 0; i < 4; i++) { // menambahkan for loop yang nantinya menambahkan 1 nilai untuk menaikkan indeksnya
            System.out.println(bil[i]); // hasil keluaran variabel bil
        }
    }
}
