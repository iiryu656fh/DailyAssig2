package UTS_Nisa;
import java.util.Scanner;

public class siswaMainNisa {
    public static void main(String[] args) {
        Scanner Nisa = new Scanner(System.in);
        siswaPencarianNisa[] listSiswaNisa = new siswaNisa[6];

        while(true) {
            System.out.println("+----------------------------------------------+");
            System.out.println("|     SISTEM INFORMASI AKADEMIK SISWA SMA      |");
            System.out.println("+----------------------------------------------+");
            System.out.println("|                  MENU:                       |");
            System.out.println("| 1. Isi Data Siswa (6)                        |");
            System.out.println("| 2. Tampilkan Data Siswa                      |");
            System.out.println("| 3. Cari Data Siswa Berdasarkan Nama          |");
            System.out.println("| 4. Hasil Pengurutan (Tahun Masuk - ascending |)");
            System.out.println("| 5. Keluar dari Menu                          |");                
            System.out.println("+----------------------------------------------+");
            System.out.print("Pilih Menu: ");
            int menuNisa = Nisa.nextInt();
            Nisa.nextLine();

            switch (menuNisa) {
                case 1:
                    System.out.println("+-------------------------------+");
                    System.out.println("| Masukkan Informasi Data Siwwa |" );
                    System.out.println("+-------------------------------+");
                    for (int i = 0; i < listSiswaNisa.length; i++){
                        listSiswaNisa[i] = new siswaNisa();
                        System.out.println("Siswa ke-" + (i + 1));
                        System.out.print("Nisn Siswa       : " );
                        String nisnNisa = Nisa.nextLine();
                        System.out.print("Nama Siswa       : " );
                        String namaNisa = Nisa.nextLine();
                        System.out.print("Alamat Siswa   : " );
                        String alamatNisa = Nisa.nextLine();
                        System.out.print("Tahun Siswa       : " );
                        int tahunNisa = Nisa.nextInt();
                        System.out.print("Nilai Siswa        : ");
                        double nilaiNisa = Nisa.nextDouble();
                        Nisa.nextLine();

                        siswaNisa mNisa = new siswaNisa(nisnNisa, namaNisa, alamatNisa, tahunNisa, nilaiNisa);
                        listSiswaNisa.tambahNisa(mNisa);
                    }
                    break;
                case 2:
                    System.out.println("+------------------------+");
                    System.out.println("| Data Keseluruhan Siswa |" );
                    System.out.println("+------------------------+");
                    listSiswaNisa.tampilAllNisa();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("+------------------------+");
                    System.out.println("| Pencarian Data Siswa |" );
                    System.out.println("+------------------------+");
                    System.out.print("Masukkan Nama Siswa yang dicari: ");
                    String cariNisa = Nisa.nextLine();
                    listSiswaNisa.selectionSortNisa();
                    int posisi = listSiswaNisa.FindBinarySearchNisa(cari, 0, listSiswaNisa.length -1);
                    System.out.println();
                    listSiswaNisa.TampilDataNisa(cariNisa, posisiNisa);
                    break;

                case 4:
                    System.out.println("+------------------------+");
                    System.out.println("| Pengurutan Data Siswa  |" );
                    System.out.println("+------------------------+");
                    listSiswaNisa.selectionSortNisa();
                    listSiswaNisa.tampilAllNisa();
                    break;

                case 5:
                    System.exit(0);
                    break; 

                default:
                    System.out.println("Pilihan menu tidak valid!");
                    break;
            }
        }
    }
}
