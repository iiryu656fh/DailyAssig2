package BruteForceDivideConquer.minggu5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        System.out.println();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            // png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc.nextInt();
            // png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pangkat                 : ");
            int pangkat = sc.nextInt();
            // png[i].pangkat = sc.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }
        System.out.println();

        System.out.println("+----------------------------------------+");
        System.out.println("|       Pilihan metode penghitungan      |");
        System.out.println("+----------------------------------------+");
        System.out.println("|   1. Brute Force                       |");
        System.out.println("|   2. Divide and Conquer                |");
        System.out.println("+----------------------------------------+");
        System.out.print("Pilihan (1 / 2) : ");
        int pilih = sc.nextInt();
        System.out.println();

        switch (pilih) {
            case 1:
            System.out.println("+----------------------------------------+");
            System.out.println("|       HASIL PANGKAT - BRUTE FORCE      |");
            System.out.println("+----------------------------------------+");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                            + png[i].nilai + " pangkat "
                            + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;

            case 2:
            System.out.println("+----------------------------------------+");
            System.out.println("|   HASIL PANGKAT - DIVIDE AND CONQUER   |");
            System.out.println("+----------------------------------------+");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari "
                            + png[i].nilai + " pangkat "
                            + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

    }
}
