import java.util.Scanner;

public class pemilihan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int tugas, kuis, uts, uas;
        double nilaiAkhir = 0;
        String nilaiHuruf = null, kelulusan = null;

        System.out.println("=================================================");
        System.out.println("|        Program Menghitung Nilai Akhir         |");
        System.out.println("=================================================");
        System.out.println("        Silakan masukkan nilai mahasiswa");
        System.out.println();
        System.out.print("Nilai Tugas   : ");
        tugas = input.nextInt();
        System.out.print("Nilai Kuis    : ");
        kuis = input.nextInt();
        System.out.print("Nilai UTS     : ");
        uts = input.nextInt();
        System.out.print("Nilai UAS     : ");
        uas = input.nextInt();

        System.out.println();
        System.out.println("=================================================");
        System.out.println("|        Hasil Perhitungan Nilai Akhir          |");
        System.out.println("=================================================");
        System.out.println();
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid!");
        } else {
            //hitung nilai akhir
            nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            //konfersi nilai huruf
            if  (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
                kelulusan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
                kelulusan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
                kelulusan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
                kelulusan = "LULUS";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
                kelulusan = "SELAMAT ANDA LULUS";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                kelulusan = "ANDA TIDAK LULUS";
            } else {
                nilaiHuruf = "E";
                kelulusan = "ANDA TIDAK LULUS";
            }
            //print hasil
            System.out.println("Nilai akhir     : " + nilaiAkhir);
            System.out.println("Nilai huruf     : " + nilaiHuruf);
            System.out.println();
            System.out.println("=================================================");
            System.out.println("            "+kelulusan);
            System.out.println("=================================================");
        

        }

    }
}