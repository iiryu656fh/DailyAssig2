public class Mahasiswa {
    public String nama;
    public String nim;
    public String gender;
    public double ipk;

    public Mahasiswa(String nama, String nim, String gender, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.gender = gender;
        this.ipk = ipk;
    }

    public String namaMHS() {
        return nama;
    }
    public String nimMHS() {
        return nim;
    }
    public String jeniskelamin() {
        return gender;
    }
    public double ipkMHS() {
        return ipk;
    }
}
