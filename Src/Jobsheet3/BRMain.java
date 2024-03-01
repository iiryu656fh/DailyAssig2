import java.util.Scanner;
public class BRMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jumlah = 0, rK = 0, sK = 0, aL = 0, tL = 0, rB = 0;

        System.out.println("+-------------------------------+");
        System.out.println("|          Kerucut              |");
        System.out.println("+-------------------------------+");
        System.out.print("Masukkan jumlah kerucut: ");
        jumlah = sc.nextInt();
        double[] lpK = new double[jumlah];
        double[] vK = new double[jumlah];
        Kerucut[] kArray = new Kerucut[jumlah]; //array krct

        for(int i = 0; i < kArray.length; i++){ // input
            System.out.println();
            kArray[i] = new Kerucut(rK, sK);
            System.out.println("Kerucut ke-" + (i + 1));
            System.out.print("Jari-jari       : ");
            kArray[i].jari2 = sc.nextInt();
            System.out.print("sisi Miring     : ");
            kArray[i].sisiMiring = sc.nextInt();
            
            lpK[i] = kArray[i].lpKerucut();
            vK[i] = kArray[i].vKerucut();  
        }

        System.out.println("+-------------------------------+");
        System.out.println("|   Limas Segi Empat Sama Sisi  |");
        System.out.println("+-------------------------------+");

        System.out.print("Masukkan jumlah Limas: ");
        jumlah = sc.nextInt();
        double[] lpL = new double[jumlah];
        double[] vL = new double[jumlah];
        LimasSegi4SamaSisi[] lArray = new LimasSegi4SamaSisi[jumlah]; //array limas

        for(int i = 0; i < lArray.length; i++){ // input
            System.out.println();
            lArray[i] = new LimasSegi4SamaSisi(aL, tL);
            System.out.println("Limas ke-" + (i + 1));
            System.out.print("Panjang sisi alas   : ");
            lArray[i].pjgSisiAlas = sc.nextInt();
            System.out.print("Tinggi              : ");
            lArray[i].tinggi = sc.nextInt();
            
            lpL[i] = lArray[i].lpLimas();
            vL[i] = lArray[i].vLimas();  
        }
        
        System.out.println("+-------------------------------+");
        System.out.println("|             Bola              |");
        System.out.println("+-------------------------------+");

        System.out.print("Masukkan jumlah Bola: ");
        jumlah = sc.nextInt();
        double[] lpB = new double[jumlah];
        double[] vB = new double[jumlah];
        Bola[] bArray = new Bola[jumlah]; //array bola

        for(int i = 0; i < bArray.length; i++){ // input
            System.out.println();
            bArray[i] = new Bola(rB);
            System.out.println("Bola ke-" + (i + 1));
            System.out.print("Jari-jari       : ");
            bArray[i].jariB = sc.nextInt();
            
            lpB[i] = bArray[i].lpBola();
            vB[i] = bArray[i].vBola();  
        }
        //output 
        System.out.println();
        System.out.println("+----------------------------------------+");
        System.out.println("| Hasil Perhitungan Bangun Ruang Kerucut |");
        System.out.println("+----------------------------------------+");
        System.out.printf("%-10s %-15s %-15s \n", "Kerucut ke-", "Volume", "Luas Permukaan");
        for(int i = 0; i < kArray.length; i++) {
            System.out.printf("%-10s %-15s %-15s \n", (i+1), vK[i], lpK[i]);
        }

        System.out.println();
        System.out.println("+-----------------------------------------+");
        System.out.println("| Bangun Ruang Limas Segi Empat Sama Sisi |");
        System.out.println("+-----------------------------------------+");
        System.out.printf("%-10s %-15s %-15s \n", "Limas ke-", "Volume", "Luas Permukaan");
        for(int i = 0; i < lArray.length; i++) {
            System.out.printf("%-10s %-15s %-15s \n", (i+1), vL[i], lpL[i]);
        }

        System.out.println();
        System.out.println("+-------------------------------------+");
        System.out.println("| Hasil Perhitungan Bangun Ruang Bola |");
        System.out.println("+-------------------------------------+");
        System.out.printf("%-10s %-15s %-15s \n", "Bola ke-", "Volume", "Luas Permukaan");
        for(int i = 0; i < bArray.length; i++) {
            System.out.printf("%-10s %-15s %-15s \n", (i+1), vB[i], lpB[i]);
        }
    }
}
