public class Buku13 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku13() {

    }

    //konstruktor
    public Buku13(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    //method
    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            if (jml <= stok) {
                stok -= jml;
            } else {
                System.out.println("Stok kurang");
            }
        } else {
            System.out.println("Stok buku habis");
        }
    }

    void restock(int n) {
        stok += n;
    }

    int gantiHarga(int hrg) {
        harga = hrg;
        return harga;
    }

    int hitungHargaTotal(int jml) {
        harga *= jml; //jml terjual
        return harga;
    }

    int hitungDiskon(int hrg) { //harga total
        int disc = 0;
        if (hrg > 150000) {
            disc = hrg * 12 / 100;
        } else if (hrg >= 75000 && hrg <= 150000) {
            disc = hrg * 5 / 100;
        } else {
            disc = 0;
        }
        return disc;
    }

    int hitungHargaBayar(int hrg, double disc) {
        hrg -= disc;
        return hrg;
    }
}