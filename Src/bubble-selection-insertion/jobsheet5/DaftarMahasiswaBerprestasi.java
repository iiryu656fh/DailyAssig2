package jobsheet5;

public class DaftarMahasiswaBerprestasi {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;

    public void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    public void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("--------------------------");
        }
    }

    public void bubbleSort() {
        for(int i = 0; i < listMhs.length-1; i++) {
            for(int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    //swap
                    Mahasiswa tmp = listMhs[j-1];
                    //listMhs[j] = listMhs[j];
                    listMhs[j-1] = listMhs[j];
                    //listMhs[j-1] = tmp;
                    listMhs[j] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < listMhs.length-1; i++){
            int idxMin = i;
            for(int j = i+1; j < listMhs.length; j++){
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa tmp = listMhs[i];
            //int j = 1;
            int j = i - 1;
            //while (j > 0 && listMhs[j - 1].ipk > tmp.ipk) {
            //    listMhs[j] = listMhs[j - 1];
            while (j >= 0 && listMhs[j].ipk < tmp.ipk) {
                listMhs[j + 1] = listMhs[j];
                j--;
            }
            //listMhs[j] = tmp;
            listMhs[j + 1] = tmp;
        }
    }
}
