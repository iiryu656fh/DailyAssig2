public class BukuMain13 {
    public static void main(String[] args) {
        Buku13 bk1 = new Buku13();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku13 bk2 = new Buku13("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku13 bukuNisa = new Buku13("Hujan", "TereLiye", 190, 15, 120000);
        //hitung harga total terjual 5
        bukuNisa.terjual(3);
        bukuNisa.tampilInformasi();
        int hargaTotal = bukuNisa.hitungHargaTotal(3);
        System.out.println("Harga total: Rp " + hargaTotal);
        //hitung diskon
        int diskon = bukuNisa.hitungDiskon(hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        //hitunt total bayar
        int bayar = bukuNisa.hitungHargaBayar(hargaTotal, diskon);
        System.out.println("Total bayar: Rp " + bayar);
    }
}