// Maulana Bintang Irfansyah_TI-1H_2041720132
public class Percobaan2_Arr2 {
    public static void main(String[] args) {
        int[][] nilai = new int[2][4];
        nilai[0][0] = 12;
        nilai[0][1] = 14;
        nilai[0][2] = 34;
        nilai[0][3] = 40;
        nilai[1][0] = 20;
        nilai[1][1] = 24;
        nilai[1][2] = 67;
        nilai[1][3] = 35;

        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("===========");
        for (int array[] : nilai) {
            for (int r : array) {
                System.out.print(r + " ");
            }
            System.out.println("");
        }
    }
}
