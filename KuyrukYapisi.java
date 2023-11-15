package kuyrukvideo2;

public class KuyrukYapisi {

    Dugum bas; // Front düğümü.
    Dugum son;
    int cnt; // Sayaç gibi düşün.
    int size; // Kuyruğun kaç elemanlı olacağını almak için.

    public KuyrukYapisi(int size) {
        this.size = size;
        cnt = 0; // Düğüm eklersek counter arttırılacak.
        bas = null;
        son = null;

    }

    void enQueue(int data) {  // Kuyruğa ekleme metodudur.
        if (isFull()) {
            System.out.println("Kuyruk dolu. Ekleme yapılamadı");
        } else {

            Dugum eleman = new Dugum(data);

            if (isEmpty()) { // İlk eleman eklenirse
                bas = eleman;
                son = eleman;
                System.out.println(data + " kuyruğa ilk eleman olarak eklendi");
            } else // Eleman var ve ekleme yapılcaksa
            {
                son.ileri = eleman;
                son = eleman;
                System.out.println(data + " kuyruğa eklendi.");
            }
            cnt++;
        }

    }

    void deQueue() {
        if (isEmpty()) {
            System.out.println("Silinecek eleman bulunamadı.");
        } else {
            System.out.println(bas.data + " silindi.");
            bas = bas.ileri;
            cnt--;
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Kuyruk boş. Yazdırılacak eleman yok");
        } else {
            Dugum temp = bas;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.ileri;
            }
        }
    }

    boolean isFull() {
        return cnt == size;
    }

    boolean isEmpty() {
        return (cnt == 0);
    }
}
