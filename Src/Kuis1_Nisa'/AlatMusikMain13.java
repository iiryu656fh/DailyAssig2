import java.util.Scanner;
public class AlatMusikMain13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //asumsi banyak alat musik = 5
        AlatMusik13[] am13 = new AlatMusik13[5];

        for(int i = 0; i < am13.length; i++){ //instansiasi object
            am13[i] = new AlatMusik13();
        }
        
        //input atribut
        System.out.println("+----------------------------------------------------------+");
        System.out.println("       MASUKKAN INFORMASI INFORMASI ALAT MUSIK" );
        System.out.println("+----------------------------------------------------------+");
        for (int i = 0; i < am13.length; i++){
            System.out.println("Alat Musik ke-" + (i + 1));
            System.out.print("Nama Alat Musik       : " );
            am13[i].nama13 = sc.nextLine();
            System.out.print("Merk Alat Musik       : " );
            am13[i].merk13 = sc.nextLine();
            System.out.print("Kategori Alat Musik   : " );
            am13[i].kategori13 = sc.nextLine();
            System.out.print("Stok Alat Musik       : " );
            am13[i].stok13 = sc.nextInt();
            System.out.print("Jumlah terjual        : ");
            am13[i].jumlah13 = sc.nextInt();
            sc.nextLine();
            System.out.println();
        }
        
        //menampilkan seluruh data alat musik
        System.out.println("+----------------------------------------------------------+");
        System.out.println("                  INFORMASI ALAT MUSIK" );
        System.out.println("+----------------------------------------------------------+");
        for (int i = 0; i < am13.length; i++){
            am13[i].tampil13();
        }

        //menghitung sisa
        System.out.println("+----------------------------------------------------------+");
        System.out.println("                  ALAT MUSIK YANG TERSISA" );
        System.out.println("+----------------------------------------------------------+");
        for(int i = 0; i < am13.length; i++) {
            System.out.println("Nama Alat Musik     :" + am13[i].nama13);
            System.out.println("Stok tersisa        :" + am13[i].hitungSisa13());
            System.out.println();
        }

        //Mencari alat musik terlaris
        int terjual = am13[0].jumlah13;
        am13[0].cariAlatmusikTerlaris13(terjual, am13);

        //Menampilkan dan mengurutkan secara ascending berdasarkan namanya
        AlatMusik13 sorter = new AlatMusik13();
        sorter.daftarAlatMusik(am13);

    }
}
