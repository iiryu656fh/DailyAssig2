package UTS_Nisa;

public class siswaPencarianNisa {
    siswaNisa listSiswaNisa[] = new siswaNisa[6];
    int idxNisa;

    void tambahNisa(siswaNisa mNisa) {
        if (idxNisa < listSiswaNisa.length) {
            listSiswaNisa[idxNisa] = mNisa;
            idxNisa++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilAllNisa() {
        for (siswaNisa mNisa : listSiswaNisa) {
            if (mNisa != null) {
                System.out.println("Nisn      : " + mNisa.nisnNisa);
                System.out.println("Nama      : " + mNisa.namaNisa);
                System.out.println("Alamat    : " + mNisa.alamatNisa);
                System.out.println("Tahun     : " + mNisa.tahunNisa);
                System.out.println("Nilai     : " + mNisa.nilaiNisa);

            }
        }
    }

    int FindBinarySearchNisa (String cariNisa, int leftNisa, int rightNisa){ //nama
        int midNisa;
        if (rightNisa >= leftNisa){
            midNisa = leftNisa + (rightNisa - leftNisa)/2;
            if (cariNisa.equalsIgnoreCase(listSiswaNisa[midNisa].namaNisa)){
                return (midNisa);
            } else if (listSiswaNisa[midNisa].namaNisa.compareTo(cariNisa) > 0){
                return FindBinarySearchNisa(cariNisa, leftNisa, midNisa-1);
            } else {
                return FindBinarySearchNisa(cariNisa, midNisa+1, rightNisa);
            }
        }
        return -1;
    }

    void tampilDataNisa(String cariNisa, int posisiNisa){
        if (posisiNisa != -1){
            System.out.println("Nisn Siswa      : " + listSiswaNisa[posisiNisa].nisnNisa);
            System.out.println("Nama Siswa      : " + cariNisa);
            System.out.println("Alamat Siswa    : " + listSiswaNisa[posisiNisa].alamatNisa);
            System.out.println("Tahun Siswa     : " + listSiswaNisa[posisiNisa].tahunNisa);
            System.out.println("Nilai Siswa     : " + listSiswaNisa[posisiNisa].nilaiNisa);
        } else {
            System.out.println("Data " + cariNisa + " tidak ditemukan");
        }
    }



    public void selectionSortNisa() { // int tahun
        for (int i = 0; i < listSiswaNisa.length-1; i++){
            int idxMinNisa = i;
            for(int j = i+1; j < listSiswaNisa.length; j++){
                if (listSiswaNisa[j].ipk < listSiswaNisa[idxMinNisa].tahunNisa) {
                    idxMinNisa = j;
                }
            }
            //swap
            listSiswaNisa tmpNisa = listSiswaNisa[idxMinNisa];
            listSiswaNisa[idxMinNisa] = listSiswaNisa[i];
            listSiswaNisa[i] = tmpNisa;
        }
    }
}
