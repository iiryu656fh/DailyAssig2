package P7;
import java.util.Scanner;
public class BukuMain13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku13 data = new PencarianBuku13();
        int jumBuku = 5;

        System.out.println("--------------------------------------------------------");
        System.out.println("Masukkan Data Buku Secara Urut dari KodeBuku terkecil : ");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i<jumBuku; i++){
            System.out.println("-----------------------------------");
            System.out.print("Kode Buku       : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku      : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit    : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang       : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock           : ");
            int stock = s.nextInt();

            Buku13 m = new Buku13(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println();
        System.out.println("____________________________________");
        System.out.println("____________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPosisi(cari, posisi);

        System.out.println();
        data.TampilData(cari, posisi);

        System.out.println();
        Buku13 dataBuku13 = data.FindBuku(cari);
        dataBuku13.tampilDataBuku();

        System.out.println();
        System.out.println("============================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku -1);
        data.tampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
