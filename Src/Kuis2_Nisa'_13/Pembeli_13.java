
public class Pembeli_13 {
    String namaPembeli13;
    String noHp13;
    Node_13 pesananList13;

    public Pembeli_13 (String b, String c){
        this.namaPembeli13 = b;
        this.noHp13 = c;
        this.pesananList13 = null;
    }

    public void tambahPesanan13(Pesanan_13 pesanan13) {
        Node_13 newNode13 = new Node_13(null, pesanan13, null);
        if (pesananList13 == null) {
            pesananList13 = newNode13;
        } else {
            Node_13 tmp13 = pesananList13;
            while (tmp13.next13 != null) {
                tmp13 = tmp13.next13;
            }
            tmp13.next13 = newNode13;
            newNode13.prev13 = tmp13;
        }
    }

    public void urutkanPesanan() {
        if (pesananList13 == null) {
            return;
        }
        boolean swapped13;
        do {
            swapped13 = false;
            Node_13 temp13 = pesananList13;
            while (temp13.next13 != null) {
                if (temp13.dataPesanan13.kodePesanan13 > temp13.next13.dataPesanan13.kodePesanan13) {
                    Pesanan_13 tempData = temp13.dataPesanan13;
                    temp13.dataPesanan13 = temp13.next13.dataPesanan13;
                    temp13.next13.dataPesanan13 = tempData;
                    swapped13 = true;
                }
                temp13 = temp13.next13;
            }
        } while (swapped13);
    }

    public void cetakPesanan() {
        Node_13 current = pesananList13;
        int nomor13 = 1;
        while (current != null) {
            System.out.printf("|%d     |%-18s|%-18s| %d\n", nomor13, namaPembeli13, current.dataPesanan13.namaPesanan13, current.dataPesanan13.harga13);
            current = current.next13;
            nomor13++;
        }
    }

    public int hitungTotalPendapatan() {
        int totalPendapatan = 0;
        Node_13 current = pesananList13;
        while (current != null) {
            totalPendapatan += current.dataPesanan13.harga13;
            current = current.next13;
        }
        return totalPendapatan;
    }
}