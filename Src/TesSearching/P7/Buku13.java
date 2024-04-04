package P7;

public class Buku13{
    int kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int Stock;

    public Buku13(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.Stock = stock;
    }

    public void tampilDataBuku() {
        System.out.println("=======================");
        System.out.println("Kode Buku       : " + kodeBuku);
        System.out.println("Judul Buku      : " + judulBuku);
        System.out.println("Tahun terbit    : " + tahunTerbit);
        System.out.println("Pengarang       : " + pengarang);
        System.out.println("Stock           : " + Stock);
    }
}