public class Bola {
    public int jariB;

    public Bola(int r){
        this.jariB = r;
    }

    public double lpBola() {
        double lp = 4 * Math.PI * jariB * jariB;
        //memkonversi --> String (diambil 2 angka belakang koma) --> double
        return Double.parseDouble(String.format("%.2f", lp));
    }

    public double vBola() {
        double v = (4 / 3) * Math.PI * jariB * jariB * jariB;
        return Double.parseDouble(String.format("%.2f", v));
    }
}
