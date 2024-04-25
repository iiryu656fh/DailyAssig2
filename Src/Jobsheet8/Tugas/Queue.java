package Tugas;

import Praktikum2.Nasabah;

public class Queue {
    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Pembeli pb){
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(1);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = pb;
            size++;
        }
    }

    public Pembeli Dequeue() {
        Pembeli pb = new Pembeli();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(1);
        } else {
            pb = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return pb;
    }

    public void print() {
        if(IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    } 

    public void peek() {
        if(!IsEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen terakhir: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    
    public void peekPosition(String nama) {
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            int posisi = 1;
            boolean cari = false;

            while (true) {
                if (antrian[i].nama.equalsIgnoreCase(nama)){
                    System.out.println(nama + " di posisi antrian ke-" + posisi);
                    cari = true;
                    break;
                }
                if (i == rear) {
                    break;
                }
                i = (i + 1) % max;
                posisi++;
            }
            if (!cari) {
                System.out.println(nama + " tidak ditemukan dalam antrian");
            }
        }
    }

    public void daftarPembeli(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
        }
    }
}
