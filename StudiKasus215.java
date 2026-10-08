import java.util.Scanner;

public class StudiKasus215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Data Utama
        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        // Variabel penampung
        boolean berhakDana = false;
        String alasan = "";

        // Cabang Lomba (BELMAWA / BAKORMA / MANDIRI)
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan): ");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                berhakDana = true;
            } else {
                alasan = "Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).";
            }
        }
    }
}