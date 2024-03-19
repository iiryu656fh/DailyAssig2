package BruteForceDivideConquer.minggu5;

public class Showroom {
    public String merk;
    public String tipe;
    public int tahun;
    public int top_acceleration;
    public int top_power;

    public Showroom(String merk, String tipe, int tahun, int top_acceleration, int top_power){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public int topAccMax(Showroom[] mobil, int min, int max) { //DC
        if (min == max) {
            return mobil[min].top_acceleration;
        }
        int mid = (min + max) / 2;
        int lmid = topAccMax(mobil, min, mid);
        int rmid = topAccMax(mobil, mid + 1, max); 
        
        return Math.max(lmid, rmid);

    }

    public int topAccMin(Showroom[] mobil, int min, int max) { //DC
        if (min == max) {
            return mobil[min].top_acceleration;
        }
        int mid = (min + max) / 2;
        int lmid2 = topAccMin(mobil, min, mid);
        int rmid2 = topAccMin(mobil, mid + 1, max); 
        
        return Math.min(lmid2, rmid2);
    }

    public double rata2(Showroom[] mobil) { //BF
        double total = 0;
        for (Showroom car : mobil) {
            total += car.top_power;
        }
        return total / mobil.length;
    }
    
}

