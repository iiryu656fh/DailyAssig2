import java.util.Scanner;
public class Utama13 {
    public static void main(String[] args) {
        Gudang13 gudang = new Gudang13(7);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("+-------------------------------+");
            System.out.println("|               MENU            |");
            System.out.println("+-------------------------------+");
            System.out.println("| 1. Tambah barang              |");
            System.out.println("| 2. Ambil barang               |");
            System.out.println("| 3. Tampilkan tumpukan barang  |");
            System.out.println("| 4. Keluar                     |");
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
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
