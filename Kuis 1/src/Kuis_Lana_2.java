public class Kuis_Lana_2 {
    public static void main(String[] args) {
        int jarak = 75, kecepatan = 50;
        double waktu, jam, menit;
        System.out.println("+===========================================================+");
        System.out.println("              Menghitung Waktu Tempuh Pak Wahyu             ");
        System.out.println("+===========================================================+");
        System.out.println("Jarak rumah dan kampus " + jarak + " km");
        System.out.println("Kecepatan mobil " + kecepatan + " km/jam");
        waktu = (double) jarak / kecepatan;
        jam = waktu;
        menit = waktu * 60;
        System.out.printf("Waktu tempuh %s jam dan %s menit", jam, menit);
    }
}
