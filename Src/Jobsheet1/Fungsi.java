
public class Fungsi {
    static String[] namaBunga = {"Aglonema", "Keladi  ", "Alocasia", "Mawar   "};
    static int[][] stockBunga = {
        // hari x
        {10, 5, 15, 7},  // ca   
        {6, 11, 9, 12},  // bang
        {2, 10, 10, 5},  // to
        {5, 7, 12, 9}    // ko
    };
    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    // fungsi menampilkan pendapatan tiap cabang jk bunga habis
    static void pendapatanPerCabang() {
        System.out.println("Rincian pendapatan setiap cabang Royal Garden jika semua bunga habis terjual");
        for (int i = 0; i < stockBunga.length; i++) {
            int[] pendapatan = new int[4];
            for (int j = 0; j < stockBunga[0].length; j++){
                pendapatan[i] += stockBunga[i][j] * hargaBunga[i];
            }
            System.out.println("Pendapatan cabang Royal Garden "+(i+1)+" sebesar       : "+pendapatan[i]);
        }
    }
    // fungsi mengetahui jumlah stock setiap jenis bunga pd cabang 4
    static void stockCabang4() {
        int[] bungaMati = {1, 2, 0, 5};
        int[] newStock = new int[4];
        for (int i = 0; i < stockBunga.length; i++) {
            newStock[i] = stockBunga[3][i] - bungaMati[i];
            System.out.println("    > " + namaBunga[i] + "        : " + newStock[i]);
        }
    }
    public static void main(String[] args) {
        System.out.println("================================================================");
        System.out.println("|    RINCIAN PENDAPATAN CABANG ROYAL GARDEN DAN STOCK BUNGA    |");
        System.out.println("|--------------------------------------------------------------|");
        System.out.println();
        System.out.println("1. Pendapatan setiap cabang jika semua bunga habis ");
        pendapatanPerCabang();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("2. Jumlah stock setiap jenis bunga pada cabang royalgarden 4");
        stockCabang4();  
    }
}