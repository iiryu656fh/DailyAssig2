public class Kerucut {
    public int jari2;
    public int sisiMiring;

    public Kerucut(int r, int s) {
        this.jari2 = r;
        this.sisiMiring = s;
    }

    public double lpKerucut() {
        double lp = Math.PI * jari2 * (sisiMiring + jari2);
        //memkonversi --> String (diambil 2 angka belakang koma) --> double
        return Double.parseDouble(String.format("%.2f", lp));
    }

    public double vKerucut() {
        double tinggi = Math.sqrt((sisiMiring * sisiMiring) - (jari2 * jari2));
        double v = (1.0 / 3.0) * Math.PI * jari2 * jari2 * tinggi;
        return Double.parseDouble(String.format("%.2f", v));
    }
}
