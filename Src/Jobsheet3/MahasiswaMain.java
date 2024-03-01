import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;

        System.out.print("Masukkan jumlah Mahasiswa: ");
        jumlah = sc.nextInt();

        Mahasiswa[] mhs = new Mahasiswa[jumlah]; //array

        System.out.println("+-------------------------------+");
        System.out.println("| Masukkan Informasi Mahasiswa  |");
        System.out.println("+-------------------------------+");
        
        for (int i = 0; i < mhs.length; i++){
            mhs[i] = new Mahasiswa(null, null, null, 0.0);
        }
        for(int i = 0; i < mhs.length; i++){
            System.out.println("Mahasiswa ke-   : " + (i+1));
            System.out.print("Nama            : ");
            sc.nextLine();
            mhs[i].nama = sc.nextLine();
            System.out.print("NIM             : ");
            mhs[i].nim = sc.nextLine();
            System.out.print("Jenis Kelamin   : ");
            mhs[i].gender = sc.nextLine();
            System.out.print("IPK             : ");
            mhs[i].ipk = sc.nextDouble();
            System.out.println();
        }

        System.out.println("+---------------------------------------------------------------+");
        System.out.println("|                     INFORMASI MAHASISWA                       |");
        System.out.println("+---------------------------------------------------------------+");
        System.out.printf("| %-5s | %-10s | %-10s | %-14s | %-10s |\n", "No", "Nama", "NIM", "Jenis Kelamin", "IPK");
        System.out.println("+---------------------------------------------------------------+");
        for(int i = 0; i < mhs.length; i++) {
            System.out.printf("| %-5s | %-10s | %-10s | %-14s | %-10s |\n", (i+1), mhs[i].nama, mhs[i].nim, mhs[i].gender, mhs[i].ipk);
            System.out.println("+---------------------------------------------------------------+");
        }
    }
}
