import java.util.Arrays;
import java.util.Comparator;
public class AlatMusik13 {
    public String nama13;
    public String merk13;
    public String kategori13;
    public int stok13;
    public int jumlah13; //jumlah terjual

    public AlatMusik13() {

    }

    public AlatMusik13(String nama13, String merk13, String kategori13, int stok13, int jumlah13) {
        this.nama13 = nama13;
        this.merk13 = merk13;
        this.kategori13 = kategori13;
        this.stok13 = stok13;
        this.jumlah13 = jumlah13;
    }

    public void tampil13(){ //menampilkan seluruh data alat musik
        System.out.println("Nama          : " + nama13);
        System.out.println("Merk          : " + merk13);
        System.out.println("Kategori      : " + kategori13);
        System.out.println("Stok          : " + stok13);
        System.out.println("Jumlah        : " + jumlah13);
        System.out.println();
    }

    public int hitungSisa13() { // menghitung setiap jenis alat musik yang tersisa karena belum terjual 
        // stok - jumlah terjual
        if (stok13 > jumlah13) {
            stok13 -= jumlah13;
        }
        return stok13;
    }

    public void cariAlatmusikTerlaris13(int jumlah13, AlatMusik13[] am13) { //alat musik yang paling banyak dibeli (jumlah penjualan)
        // data alat musik terlaris ditampilkan
        AlatMusik13 terlaris13 = am13[0];
        for(int i = 1; i < am13.length; i++) {
            if (am13[i].jumlah13 > terlaris13.jumlah13) {
                terlaris13 = am13[i];
            }
        }
        System.out.println("+----------------------------------------+");
        System.out.println("|  Alat Musik yang Paling Banyak diBeli  |");
        System.out.println("+----------------------------------------+");
        System.out.println("Nama Alat Musik       : " + terlaris13.nama13);
        System.out.println("Merk Alat Musik       : " + terlaris13.merk13);
        System.out.println("Kategori Alat Musik   : " + terlaris13.kategori13);
        System.out.println("Stok Alat Musik       : " + terlaris13.stok13);
        System.out.println("Jumlah yang Terjual   : " + terlaris13.jumlah13);
        System.out.println();
    }

    public void daftarAlatMusik(AlatMusik13[] am13) { // menampilkan dan mengurutkan secara ascending semua alat musik berdasarkan namanya
        System.out.println("+----------------------------------------+");
        System.out.println("|  DAFTAR ALAT MUSIK SETELAH DIURUTKAN  |");
        System.out.println("+----------------------------------------+");
        Arrays.sort(am13, Comparator.comparing(a -> a.nama13)); //mengurutkan
        // menampilkan urutannya
        for (AlatMusik13 almus13 : am13) {
            almus13.tampil13();
        }
    }
}
