package jobsheet5;
import java.util.Scanner;

public class tugas3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEM PERPUSTAKAAN & AKSES WIFI ===");
        System.out.print("Apakah Anda sudah menjadi anggota perpustakaan? (true/false): ");
        boolean anggota = sc.nextBoolean();

        System.out.print("Apakah Anda sudah melunasi UKT? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // Logika IF-ELSE sederhana
        if (anggota && uktLunas) {
            System.out.println("Akses diperbolehkan.");
            System.out.println("- Anda dapat meminjam buku di perpustakaan.");
            System.out.println("- Anda dapat mengakses WIFI kampus.");
        } else if (!anggota && uktLunas) {
            System.out.println("Silakan daftar sebagai anggota perpustakaan terlebih dahulu.");
        } else if (anggota && !uktLunas) {
            System.out.println("Silakan lunasi UKT untuk mendapatkan akses.");
        } else {
            System.out.println("Akses ditolak. Anda bukan anggota perpustakaan dan belum melunasi UKT.");
        }

        sc.close();
    }
}
