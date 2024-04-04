package P7;

public class MergeSortMain13 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting dengan Merge Sort");
        MergeSorting13 mSort = new MergeSorting13();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println();
        System.out.println("Setelah diurutkan");
        mSort.printArray(data);
    }
}
