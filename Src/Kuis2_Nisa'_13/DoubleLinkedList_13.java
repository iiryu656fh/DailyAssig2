
import java.util.Scanner;

import jobsheet5.Mahasiswa;

public class DoubleLinkedList_13 {
    Node_13 head13;
    Node_13 tail13;
    int size13;

    public DoubleLinkedList_13(){
        head13 = null;
        tail13 = null;
        size13 = 0;
    }
    
    public boolean isEmpty13(){
        return head13 == null;
    }

    public void tambahAntrian13(Pembeli_13 pembeli13) {
        Node_13 newNode13 = new Node_13(null, pembeli13, null);
        size13++;

        if (isEmpty13()) {
            head13 = newNode13;
            tail13 = newNode13;
        } else {
            tail13.next13 = newNode13;
            newNode13.prev13 = tail13;
            tail13 = newNode13;
        }
    }

    public void print13() {
        if (isEmpty13()) {
            System.out.println("Antrian kosong.");
            return;
        }

        Node_13 current13 = head13;
        int nomorAntrian13 = 1;
        System.out.println("----------------------------------");
        System.out.println("Daftar Antrian Resto Royal Delish");
        System.out.println("----------------------------------");
        //System.out.printf("|%5s | %20s | %20s|\n",  "No", "Nama Customer","NoHp" );
        System.out.println("|No        | Nama Customer     | NoHp    |");
        while (current13 != null) {
            System.out.println("|" + nomorAntrian13 + "        |" 
                    + current13.dataPembeli13.namaPembeli13 
                    + "              |" + current13.dataPembeli13.noHp13 + " |");
            //System.out.printf("\n|%5d | %20s | %20s|", nomorAntrian13, current13.dataPembeli13.namaPembeli13);
            current13 = current13.next13;
            nomorAntrian13++;
        }
        System.out.println("----------------------------------");
        System.out.println("Total antrian: " + size13);
    }

    public void hapusAntrian() {
        int nomorPesanan13 = 1;
        Scanner Nisa = new Scanner(System.in);
        if (isEmpty13()) {
            System.out.println("Antrian kosong, tidak ada yang dihapus.");
            return;
        }
        Node_13 current13 = head13;
        System.out.println("----------------------------------");
        System.out.println(current13.dataPembeli13.namaPembeli13 + " telah memesan Menu");
        System.out.println("----------------------------------");
        System.out.println("Transaksi input pesanan");
        System.out.println("----------------------------------");
        System.out.print("Nomor Pesanan : " +nomorPesanan13);
        System.out.print("Pesanan       : ");
        String namaPesanan = Nisa.nextLine();
        System.out.print("Harga         : ");
        int harga = Nisa.nextInt();
        Nisa.nextLine();
        System.out.println("++++++++++++++++++");
        System.out.println("Daftar Pesanan Masuk Resto Loyal Delish");
        System.out.println("++++++++++++++++++");
        System.out.println("|No    | Nama Pesanan    | Harga  |");
        System.out.println("|" + nomorPesanan13 + "        |" + namaPesanan + "       |" + harga + "     |");
        nomorPesanan13++;
        System.out.println("Semua pesanan berhasil dicetak");

        current13.dataPembeli13.tambahPesanan13(new Pesanan_13(nomorPesanan13, namaPesanan, harga));

        if (current13.next13 != null) {
            current13.next13.prev13 = current13.prev13;
        }
        if (current13.prev13 != null) {
            current13.prev13.next13 = current13.next13;
        } else {
            head13 = current13.next13;
        }

        if (head13 == null) {
            tail13 = null;
        }
        size13--;
    }
    
    public void laporanPesanan() {
        if (isEmpty13()) {
            System.out.println("Antrian masih kosong, laporan pesanan tidak dapat dibuat.");
            return;
        }
    
        Node_13 current = head13;
        while (current != null) {
            current.dataPembeli13.urutkanPesanan();
            current.dataPembeli13.cetakPesanan();
            current = current.next13;
        }
    }

    public int hitungTotalPendapatan() {
        int totalPendapatan = 0;
        Node_13 current = head13;
        while (current != null) {
            totalPendapatan += current.dataPembeli13.hitungTotalPendapatan();
            current = current.next13;
        }
        return totalPendapatan;
    }
}
