

import java.util.Scanner;

public class NestedIfUjianSkripsi12 {
    public static void main(String[] args) {
        String pesan = "";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
            String bebasKompen = sc.nextLine().trim();
            System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
            int bimbinganP1 = sc.nextInt();
            System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
            int bimbinganP2 = sc.nextInt();

            if (bebasKompen.equalsIgnoreCase("Ya")) {
                if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                    pesan = "semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian";
                } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                    pesan = "Gagal! Log Bimbingan P1 kurang dari 8 kali dan p2 kurang dari 4 kali.";
                } else if (bimbinganP1 < 8) {
                    pesan = "Gagal! Log Bimbingan P1 belum mencapai 8 kali.";
                } else if (bimbinganP2 < 4) {
                    pesan = "Gagal! Log Bimbingan P2 belum mencapai 4 kali.";
                }
            } else {
                pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen.";
            }
            System.out.println(pesan);
        }
    }
}
