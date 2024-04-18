public class Gudang13 {
    Barang13[] tumpukan;
    int size;
    int top;

    public Gudang13(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang13[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang13 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
        }
    }

    public Barang13 ambilBarang() {
        if (!cekKosong()) {
            Barang13 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang13 lihatBarangTeratas() {
        if(!cekKosong()) {
            Barang13 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if(!cekKosong()) {
            System.out.println("Rincian Tumpukan di Gudang: ");
            for (int i = top; i >= 0; i--) {
            //for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi13 stack = new StackKonversi13();
        while (kode > 0) { // (kode != 0) sama aja
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public Barang13 lihatBarangTerbawah() {
        if(!cekKosong()) {
            Barang13 barangTerbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang13 cariBarangK(int kode) { 
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == kode) {
                    System.out.println("Barang " + kode + " ditemukan, rincian:");
                    System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang " + kode + " tidak ditemukan");
            return null;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang13 cariBarangN(String nama) {
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].nama.equalsIgnoreCase(nama)) {
                    System.out.println("Barang " + nama + " ditemukan, rincian:");
                    System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang " + nama + " tidak ditemukan");
            return null;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }
}
