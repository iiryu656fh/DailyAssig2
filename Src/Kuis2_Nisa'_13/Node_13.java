public class Node_13 {
    Pembeli_13 dataPembeli13;
    Pesanan_13 dataPesanan13;
    Node_13 next13;
    Node_13 prev13;

    public Node_13 (Node_13 prev13, Pembeli_13 data13, Node_13 next13){
        this.prev13 = prev13;
        this.dataPembeli13 = data13;
        this.dataPesanan13 = null;
        this.next13 = next13;
    }

    public Node_13(Node_13 prev13, Pesanan_13 dataPesanan13, Node_13 next13) {
        this.dataPembeli13 = null;
        this.dataPesanan13 = dataPesanan13;
        this.prev13 = prev13;
        this.next13 = next13;
    }
}
