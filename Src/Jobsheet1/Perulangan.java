import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long nim;
        int n;

        System.out.println("=================================");
        System.out.print("Masukkan NIM        : ");
        nim = input.nextLong();
        System.out.println("=================================");

        //n = 2 digit terakhir nim, dg modulus 100
        n = (int) (nim % 100);
        if (n < 10) {
            n += 10;
        }

        System.out.println("n                   : " + n);
        System.out.print("Output              : ");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}