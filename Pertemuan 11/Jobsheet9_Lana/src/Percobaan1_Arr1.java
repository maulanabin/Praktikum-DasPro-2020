// Maulana Bintang Irfansyah_TI-1H_2041720132
public class Percobaan1_Arr1 {
    public static void main(String[] args) {
        int[][] nilai = new int[2][3];
        nilai[0][0] = 12;
        nilai[0][1] = 14;
        nilai[0][2] = 34;
        nilai[1][0] = 20;
        nilai[1][1] = 24;
        nilai[1][2] = 67;

        for (int i = 0; i < nilai.length; i++ ) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (i % 2 != 0) {
                    System.out.println(nilai[i][j] + " ");
                }
            }
        }
    }
}
//System.out.println(nilai[0][0] + " " + nilai[0][1] + " " + nilai[0][2]);
//System.out.println(nilai[1][0] + " " + nilai[1][1] + " " + nilai[1][2]);
