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
    public Double ipkRata2(Mahasiswa[] mhs) {
        double sum = 0;
        for (Mahasiswa MHSiswa : mhs) {
            sum += MHSiswa.ipk;
        }
        return sum / mhs.length;
    }
    public void mhsTerbaik(Mahasiswa[] mhs) {
        Mahasiswa terbaik = mhs[0]; //inisialisasi awal
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].ipk > terbaik.ipk) {
                terbaik = mhs[i];
            }
        }
        System.out.println("+---------------------------------+");
        System.out.println("|  Mahasiswa dengan IPK terbesar  |");
        System.out.println("+---------------------------------+");
        System.out.println("Nama            : " + terbaik.nama);
        System.out.println("NIM             : " + terbaik.nim);
        System.out.println("Jenis Kelamin   : " + terbaik.gender);
        System.out.println("IPK             : " + terbaik.ipk);
    }
}
