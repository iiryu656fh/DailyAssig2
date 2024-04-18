import java.util.Scanner;
public class PostfixMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q; // p= hasil akhir postfix, q = input infix

        System.out.println("Masukkan ekspresi matematika (infix): ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")"; // untuk memastikan semua simbol/karakter yang masih berada
                    // di stack setelah semua persamaan terbaca, akan dikeluarkan dan dipindahkan ke postfix.
        
        int total = Q.length();

        Postfix13 post = new Postfix13(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);
    }
}
