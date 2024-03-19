package BruteForceDivideConquer.minggu5;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("+------------------------------------------------+");
        System.out.println("|       Program Menghitung Keuntungan Total      |");
        System.out.println("|            (Satuan Juta. Misal 5.9)            |");
        System.out.println("+------------------------------------------------+");
        System.out.print("Masukkan jumlah bulan: ");
        int elm = sc.nextInt();
        System.out.println();

        Sum sm = new Sum(elm);
        System.out.println("Masukkan nilai keuntungan tiap bulan!");
        //for (int i = 0; i < sm.elemen; i++) {
        for (int i = 0; i < elm; i++) {
            System.out.print("Bulan ke-" + (i+1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println();

        System.out.println("+------------------------------------------+");
        System.out.printf("|      Total Keuntungan selama %s ", elm + " bulan     |"); 
        System.out.print("\n+------------------------+-----------------+");
        System.out.printf("\n|Algoritma Brute Force   | %-15.2f |", sm.totalBF(sm.keuntungan));
        System.out.printf("\n|Algoritma Divide Conquer| %-15.2f |", sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
        System.out.print("\n+------------------------+-----------------+");

    }
}
