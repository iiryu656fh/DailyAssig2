package P7;

public class PencarianBuku13 {
    Buku13 listBk[] = new Buku13[5];
    int idx;

    void tambah(Buku13 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku13 m : listBk){
            m.tampilDataBuku();;
        }
    }

    int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++){
            //if (listBk[j].kodeBuku == cari){
            if (listBk[j].kodeBuku.equalsIgnoreCase(cari)){
                        posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Data " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void TampilData(String x, int pos) {
        if (pos != -1){
            System.out.println("Kode Buku       : " + x);
            System.out.println("Judul           : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit    : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang       : " + listBk[pos].pengarang);
            System.out.println("Stock           : " + listBk[pos].Stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    Buku13 FindBuku(String cari) { //(int cari)
        for (int j = 0; j < idx; j++) {
            //if (listBk[j].kodeBuku == cari){
                if (listBk[j].kodeBuku.equalsIgnoreCase(cari)){
                return listBk[j];
            }
        }
        return null;
    }

    int FindBinarySearch (String cari, int left, int right){
        int mid;
        if (right >= left){
            mid = left + (right - left)/2;
            //if (cari == listBk[mid].kodeBuku){
            if (cari.equalsIgnoreCase(listBk[mid].kodeBuku)){
                return (mid);
            //} else if (listBk[mid].kodeBuku < cari){
            } else if (listBk[mid].kodeBuku.compareTo(cari) > 0){
                return FindBinarySearch(cari, left, mid-1);
            } else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
