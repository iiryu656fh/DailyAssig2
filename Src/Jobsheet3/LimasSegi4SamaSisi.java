public class LimasSegi4SamaSisi {
    public int pjgSisiAlas;
    public int tinggi;

    public LimasSegi4SamaSisi(int a, int t){
        this.pjgSisiAlas = a;
        this.tinggi = t;
    }

    public double lpLimas() {
        double sMiring = (1 / 2) * pjgSisiAlas * tinggi;
        double lp = (pjgSisiAlas * pjgSisiAlas) + 4 * sMiring; 
        //memkonversi --> String (diambil 2 angka belakang koma) --> double
        return Double.parseDouble(String.format("%.2f", lp));
    }

    public double vLimas() {
        double v = (1.0 / 3.0) * pjgSisiAlas * pjgSisiAlas * tinggi;
        return Double.parseDouble(String.format("%.2f", v));
    }
}
