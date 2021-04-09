// Maulana Bintang Irfansyah_16_2041720132_TI-1H
public class MultiParameter {
    public static void main(String[] args) {
        Tampil("Dasar Pemrograman", 94, 76);
        Tampil("Teknologi Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");
    }
    static void Tampil(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Banyaknya parameter: " + a.length);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
