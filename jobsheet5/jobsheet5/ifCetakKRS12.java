package jobsheet5;
import java.util.Scanner;

public class ifCetakKRS12 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("-----CETAK KRS SIAKAD-----");
            System.out.print("Apakah UKT sudah lunas? (true/false): ");
            boolean uktLunas = sc.nextBoolean();

            
            String hasil = (uktLunas)
                    ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA"
                    : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

            System.out.println(hasil);

        }
    }
}
