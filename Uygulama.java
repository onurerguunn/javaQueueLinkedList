package kuyrukvideo2;

public class Uygulama {

    public static void main(String[] args) {
        KuyrukYapisi ky = new KuyrukYapisi(5);
        ky.enQueue(3);
        ky.enQueue(65);
        ky.enQueue(85);
        ky.enQueue(05);
        ky.print();
  
        ky.deQueue();
        ky.deQueue(); 

        ky.print();
        System.out.println("Kuyruktaki eleman sayısı : "+ky.cnt);

    }

}
