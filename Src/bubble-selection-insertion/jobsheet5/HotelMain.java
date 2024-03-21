package jobsheet5;

public class HotelMain {
    public static void main(String[] args) {
        HotelService rooms = new HotelService(5);
        
        Hotel h1 = new Hotel("Hotel Garden", "Jakarta", 250000, (byte) 3);
        Hotel h2 = new Hotel("Hotel River", "Bandung", 520000, (byte) 4);
        Hotel h3 = new Hotel("Hotel d'Hotel", "Malang", 450000, (byte) 5);
        Hotel h4 = new Hotel("Hotel d'Masih", "Surabaya", 2000000, (byte) 1);
        Hotel h5 = new Hotel("Hotel Gordon", "Madiun", 600000, (byte) 2);

        rooms.tambah(h1);
        rooms.tambah(h2);
        rooms.tambah(h3);
        rooms.tambah(h4);
        rooms.tambah(h5);

        System.out.println("+---------------------------------------+");
        System.out.println("|            INFORMASI HOTEL            |");
        System.out.println("+---------------------------------------+");
        System.out.println();
        System.out.println("~~~~~~~~ Sebelum Sorting ~~~~~~~~");
        System.out.println();
        rooms.tampilAll();
        System.out.println();

        System.out.println("~~~~~~~~ Setelah Sorting, Berdasarkan Harga ~~~~~~~~");
        System.out.println(); 
        System.out.println("////BUBBLE SORT ////");
        rooms.bubbleSort();
        rooms.tampilAll();
        System.out.println();

        System.out.println("~~~~~~~~ Setelah Sorting, Berdasarkan Bintang ~~~~~~~~");
        System.out.println();
        System.out.println("////SELECTION SORT ////");
        rooms.selectionSort();
        rooms.tampilAll();
    }
}