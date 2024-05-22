import java.util.Scanner;
public class Main_13 {

    public static void menu() {
        System.out.println("+-------------------------------------------+");
        System.out.println("|                   MENU                    |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| 1. Tambah Antrian                         |");
        System.out.println("| 2. Cetak Antrian                          |");
        System.out.println("| 3. Hapus Antrian                          |");
        System.out.println("| 4. Laporan Pengurutan Pesanan By Nama     |");
        System.out.println("| 5. Hitung Total Pendapatan                |");
        System.out.println("| 6. Keluar                                 |");
        System.out.println("+-------------------------------------------+");
        System.out.print("Pilih(1-6): ");
    }
    public static void main(String[] args) {
        Scanner nisa = new Scanner(System.in);

        System.out.println("====== QUIZ 2 PRAKTIKUM ASD TI ======");
        System.out.println("|| Dibuat oleh : Khoirotun Nisa'   ||");
        System.out.println("|| NIM         : 2341720057        ||");
        System.out.println("|| Absen       : 13                ||");
        System.out.println("=====================================");
        System.out.println(" ~~~ Sistem Antrian Resto ~~~");

        int pilih;
        int noant13;
        DoubleLinkedList_13 antrian13 = new DoubleLinkedList_13(); 
        while(true) {
            menu();
            pilih = nisa.nextInt();
            nisa.nextLine();
            noant13 = antrian13.size13+1;
            switch(pilih) {
                case 1:
                    System.out.println("+-----------------------+");
                    System.out.println("| Masukkan Data Pembeli |");
                    System.out.println("+-----------------------|");
                    System.out.println("Nomor Antrian :" + noant13);
                    System.out.print("Nama Customer : ");
                    String nama13 = nisa.nextLine();
                    System.out.print("No Hp         : ");
                    String noHp13 = nisa.nextLine();
                    antrian13.tambahAntrian13(new Pembeli_13(nama13, noHp13));
                    break;
                case 2:
                    antrian13.print13();
                    break;
                case 3:
                    antrian13.hapusAntrian();
                    break;
                case 4:
                    antrian13.laporanPesanan();
                    break;
                case 5:
                    int totalPendapatan = antrian13.hitungTotalPendapatan();
                    if (totalPendapatan != -1) {
                        System.out.println("----------------------------------");
                        System.out.println("Total Pendapatan");
                        System.out.println("----------------------------------");
                        System.out.println("Pendapatan hari ini: " + totalPendapatan);
                    }
                    break;
                case 6:
                    System.exit(0);;
                    break;
                default:
                    System.out.println("Pilihan menu tidak valid");
                    break;
            }
        }
    }
}
