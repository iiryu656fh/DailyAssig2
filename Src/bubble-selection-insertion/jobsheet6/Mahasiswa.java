package jobsheet6;

public class Mahasiswa{
    String nama;
    int thnMasuk, umur;
    double ipk;

    public Mahasiswa (String n, int t, int u, double i) {
        this.nama = n;
        this.thnMasuk = t;
        this.umur = u;
        this.ipk = i;
    }

    public void tampil() {
        System.out.println("Nama        = " + nama);
        System.out.println("Tahun Masuk = " + thnMasuk);
        System.out.println("Umur        = " + umur);
        System.out.println("IPK         = " + ipk);
    }
}
