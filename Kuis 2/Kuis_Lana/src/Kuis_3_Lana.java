// Maulana Bintang Irfansyah_2041720132_TI-1H
public class Kuis_3_Lana {
    public static void main(String[] args) {
        int dataMhs[][] = {{0, 6, 0, 6, 2, 0}, {0, 1, 2, 0, 4, 1}, {7, 2, 0, 1, 3, 2}};
        System.out.println("Elemen Array");
        int x = 0;
        while (x < dataMhs.length) {
            int y = 0;
            while (y < dataMhs[0].length){
                System.out.print(dataMhs[x][y] + " ");
                y++;
            }
            x++;
            System.out.print("\n");

        }
        int b = 20;
        for (int a = 1; a <= b; a++){
            if ((a = a + 1) % 4 == 0) {
                System.out.println("Bilangan 0 muncul sebanyak " + (a) + " kali");
            }
        }
    }
}
