import java.util.Scanner;
public class TugasKetiga {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String nama, nim;
            int nilai_uts, nilai_uas, nilai_kuis, nilai_tugas;
            double uts = 0.3, uas = 0.4, kuis = 0.1, tugas = 0.2, jumlah_nilai;
            // 30% nilai UTS, 40% nilai UAS, 10% nilai Kuis, 20% nilai Tugas
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.println("\t\tMenghitung Nilai Akhir Mahasiswa ");
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
            System.out.print("Masukkan nama Anda: ");
            nama = input.nextLine();
            System.out.print("Masukkan NIM\t\t: ");
            nim = input.nextLine();
            System.out.print("Masukkan nilai UTS: ");
            nilai_uts = input.nextInt();
            System.out.print("Masukkan nilai UAS: ");
            nilai_uas = input.nextInt();
            System.out.print("Masukkan nilai Kuis: ");
            nilai_kuis = input.nextInt();
            System.out.print("Masukkan nilai Tugas: ");
            nilai_tugas = input.nextInt();
            jumlah_nilai = (nilai_uts * uts) + (nilai_uas * uas) + (nilai_kuis * kuis) + (nilai_tugas * tugas);
            System.out.println(nama + " dengan NIM " + nim + " memiliki jumlah nilai akhir: " + jumlah_nilai);
            if (jumlah_nilai >= 65) {
                System.out.println("Selamat nilai Anda mencukupi dan tidak remidi");
            } else {
                System.out.println("Mohon maaf nilai Anda kurang mencukupi dan harus remidi");
            }
            System.out.println("Jangan lupa tetap semangat belajar, ya :)");
            System.out.println("✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿✿");
        }
    }
