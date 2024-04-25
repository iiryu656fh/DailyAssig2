package Tugas;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("+---------------------------+");
        System.out.println("|           MENU            |");
        System.out.println("+---------------------------+");
        System.out.println("| 1. Pembeli Baru           |");
        System.out.println("| 2. Pembeli keluar         |");
        System.out.println("| 3. Cek Pembeli Terdepan   |");
        System.out.println("| 4. Cek Pembeli Terakhir   |");
        System.out.println("| 5. Cek Posisi Pembeli     |");
        System.out.println("| 6. Daftar Semua Pembeli   |");
        System.out.println("+---------------------------+");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas Queue: ");
        int jmlh = sc.nextInt();
        sc.nextLine();
        Queue Q = new Queue(jmlh);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan nama pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan nomor HP pembeli: ");
                    int noHP = sc.nextInt();
                    sc.nextLine();
                    Pembeli pbIn = new Pembeli(nama, noHP);
                    Q.Enqueue(pbIn);
                    break;
                case 2:
                    Pembeli pbOut = Q.Dequeue();
                    if (pbOut != null) {
                        System.out.println("Data yang dikeluarkan: " + pbOut.nama + " - " + pbOut.noHP);
                    }
                    break;
                case 3:
                    Q.peek();
                    break;
                case 4:
                    Q.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli: ");
                    String cari = sc.nextLine();
                    Q.peekPosition(cari);
                    break;
                case 6:
                   Q.daftarPembeli();
                   break;
                default:
                    System.out.println("Pilihan menu tidak valid");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
