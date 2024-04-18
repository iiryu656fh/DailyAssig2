import java.util.Scanner;
public class Utama13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan besar kapasitas gudang: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine();
        Gudang13 gudang = new Gudang13(kapasitas);

        while (true) {
            System.out.println();
            System.out.println("+-------------------------------+");
            System.out.println("|               MENU            |");
            System.out.println("+-------------------------------+");
            System.out.println("| 1. Tambah barang              |");
            System.out.println("| 2. Ambil barang               |");
            System.out.println("| 3. Tampilkan tumpukan barang  |");
            System.out.println("| 4. Lihat barang teratas       |");
            System.out.println("| 5. Lihat barang terbawah      |");
            System.out.println("| 6. Cari barang                |");
            System.out.println("| 7. Keluar                     |");
            System.out.println("+-------------------------------+");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang  : ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang  : ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang13 barangBaru = new Barang13(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                    break;
                case 5:
                    gudang.lihatBarangTerbawah();
                    break;
                case 6:
                    System.out.println("---------------------------");
                    System.out.println("Pilihan Pencarian:");
                    System.out.println("1. Berdasarkan kode barang");
                    System.out.println("2. Berdasarkan nama barang");
                    System.out.println("---------------------------");
                    System.out.print("Pilihan: ");
                    int pilih = scanner.nextInt();
                    scanner.nextLine();
                    switch (pilih) {
                        case 1:
                            System.out.print("Masukkan kode barang yang ingin dicari: ");
                            int cariKode = scanner.nextInt();
                            gudang.cariBarangK(cariKode);
                            break;
                        case 2:
                            System.out.print("Masukkan nama barang yang ingin dicari: ");
                            String cariNama = scanner.nextLine();
                            gudang.cariBarangN(cariNama);
                            break;
                        default:
                            System.out.println("Pilihan tidak valid.");
                            break;
                    }
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
