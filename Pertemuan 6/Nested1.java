import java.util.Scanner;

// Maulana Bintang Irfansyah_2041720132
public class Nested1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღ");
        System.out.println("            Program Hasil Nilai Mahasiswa               ");
        System.out.println("ღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღ");
        int nilaiMahasiswa;
        System.out.print("Masukkan nilai ujian (0 - 100): ");
        nilaiMahasiswa = sc.nextInt();
        if (nilaiMahasiswa >= 0 && nilaiMahasiswa <= 100) {
            if (nilaiMahasiswa >= 90 && nilaiMahasiswa <= 100) {
                System.out.println("Nilai A, EXCELLENT!");
            } else if (nilaiMahasiswa >= 80 && nilaiMahasiswa <= 89) {
                System.out.println("Nilai B, pertahankan prestasi Anda!");
            } else if (nilaiMahasiswa >= 60 && nilaiMahasiswa <= 79) {
                System.out.println("Nilai C, tingkatkan prestasi Anda");
            } else if (nilaiMahasiswa >= 50 && nilaiMahasiswa <= 59) {
                System.out.println("Nilai D, tingkatkan belajar Anda!");
            } else {
                System.out.println("Nilai E, Anda tidak lulus!");
            }
        } else if (nilaiMahasiswa < 0) {
            System.out.println("Nilai yang Anda masukkan kurang dari 0");
        } else if (nilaiMahasiswa > 100) {
            System.out.println("Nilai yang Anda masukkan lebih dari 100");
        } else {
            System.out.println("Nilai yang Anda masukkan tidak valid");
        }
        System.out.println("ღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღღ");
    }
}