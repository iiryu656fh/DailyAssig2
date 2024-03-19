package BruteForceDivideConquer.minggu5;

public class ShowroomMain {
    public static void main(String[] args) {
        String[] Amerk = {"BMW", "Ford", "Nissan", "Subaru", "Subaru", 
        "Toyota", "Toyota", "Volkswagen"};
        String[] Atipe = {"M2 Coupe", "Fiesta ST", "370Z", "BRZ", "Impreza WRX STI",
        "AE86 Trueno", "86/GT86", "Golf GTI"};
        int[] Atahun = {2016, 2014, 2008, 2014, 2013, 1986, 2014, 2014};
        int[] ATopAcc = {6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
        int[] ATopPwer = {728, 575, 657, 609, 703, 553, 609, 631};

        Showroom[] mobil = new Showroom[8];
        for(int i = 0; i < mobil.length; i++){
            mobil[i] = new Showroom(Amerk[i], Atipe[i], Atahun[i], ATopAcc[i], ATopPwer[i]);
        }

        System.out.println("+---------------------------------------------------------------------+");
        System.out.println("|                        INFORMASI MOBIL                              |");
        System.out.println("+---------------------------------------------------------------------+");
        System.out.printf("| %-10s | %-15s | %-10s | %-10s | %-10s |\n", "Merk", "Tipe", "Tahun", "top_acc", "top_power");
        System.out.println("+---------------------------------------------------------------------+");
        for(int i = 0; i < mobil.length; i++) {
            System.out.printf("| %-10s | %-15s | %-10d | %-10d | %-10d |\n", mobil[i].merk, mobil[i].tipe, mobil[i].tahun, mobil[i].top_acceleration, mobil[i].top_power);
            System.out.println("+---------------------------------------------------------------------+");
        }

        Showroom cars = new Showroom(null, null, 0, 0, 0);
        System.out.printf("| %-48s | %-16d |\n", "top_acceleration tertinggi", cars.topAccMax(mobil, 0, mobil.length-1));
        System.out.println("+---------------------------------------------------------------------+");
        System.out.printf("| %-48s | %-16d |\n", "top_acceleration terendah", cars.topAccMin(mobil, 0, mobil.length-1));
        System.out.println("+---------------------------------------------------------------------+");
        System.out.printf("| %-48s | %-16.2f |\n", "Rata-rata top_power", cars.rata2(mobil));
        System.out.println("+---------------------------------------------------------------------+");
    }
}
