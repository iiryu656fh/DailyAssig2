package BruteForceDivideConquer.minggu5;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("+------------------------------------------------+");
        System.out.println("|       Program Menghitung Keuntungan Total      |");
        System.out.println("|       Perusahaan (Satuan Juta. Misal 5.9)      |");
        System.out.println("+------------------------------------------------+");
        
        System.out.print("Masukkan jumlah perusahaan    : ");
        int prshn = sc.nextInt();
        System.out.print("Masukkan jumlah bulan         : ");
        int elm = sc.nextInt();
        System.out.println();

        double[][] kPerusahaan = new double[prshn][elm];

        //Sum sm = new Sum(elm);
        System.out.println("Masukkan nilai keuntungan tiap bulan!");
        for (int i = 0; i < prshn; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            //for (int i = 0; i < sm.elemen; i++) {
            for (int j = 0; j < elm; j++) {
                System.out.print("Bulan ke-" + (j + 1) + " = ");
                kPerusahaan[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        System.out.println("+-------------------------------------------------+");
        System.out.println("|      Total Keuntungan Tiap Perusahaan           |");
        System.out.printf("|           Selama %d Bulan                        |\n", elm);
        System.out.println("+-------------------------------------------------+");

        for (int i = 0; i < prshn; i++) {
            Sum Aperusahaan = new Sum(elm);  
            double Akeuntungan = Aperusahaan.totalBF(kPerusahaan[i]);
            System.out.printf("Perusahaan ke        : " + (i+1));
            System.out.println("\nTotal keuntungan     : " + Akeuntungan);
            System.out.println();
        }


    }
}
