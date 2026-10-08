import java.util.Scanner;

public class StudiKasus215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = sc.nextLine();

        boolean berhakDana = false;
        String alasan = "";

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
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            int statusPKM = sc.nextInt();

            if (statusPKM == 1) {
                berhakDana = true;
            } else {
                alasan = "Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).";
            }

        } else {
            alasan = "Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).";
        }

        if (berhakDana) {
            System.out.print("Jumlah dokumen yang diupload (0-4): ");
            int jumlahDokumen = sc.nextInt();

            if (jumlahDokumen == 4) {
                System.out.println("Status: Berhak memperoleh dana penghargaan.");
            } else {
                int kurang = 4 - jumlahDokumen;
                System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
            }
        } else {
            System.out.println("Status: " + alasan);
        }

        sc.close();
    }
}