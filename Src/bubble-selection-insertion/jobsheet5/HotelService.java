package jobsheet5;

public class HotelService {
    Hotel rooms[];

    public HotelService(int length){
        rooms = new Hotel[length];
    }

    public void tambah(Hotel H){
        for (int i = 0; i < rooms.length; i++){
            if (rooms[i] == null) {
                rooms[i] = H;
                break;
            }
        }
    }

    public void tampilAll() {
        for (Hotel room : rooms) {
            if (room != null) {
                System.out.println("+------------------------+");
                System.out.printf("|   %15s       |\n", room.nama);
                System.out.println("+------------------------+");
                System.out.println("Kota      : " + room.kota);
                System.out.println("Harga     : " + room.harga);
                System.out.println("Bintang   : " + room.bintang);

            }
        }
    }

    public void bubbleSort(){
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 0; j < rooms.length - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = tmp;
                }
            }
        }
    }   

    public void selectionSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMax].bintang) {
                    idxMax = j;
                }
            }
            Hotel tmp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = tmp;
        }
    }
}