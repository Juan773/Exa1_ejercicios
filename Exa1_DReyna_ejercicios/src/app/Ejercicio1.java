package app;

public class Ejercicio1 extends Thread {

    public static void Cont() {
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int contador = num.length;
        System.out.println("Hasta 10: [");
        for (int i = 0; i < contador; i++) {
            System.out.println(num[i] + ",");
        }
        System.out.println("]\n");
        System.out.println("Hasta 1: [");
        for (int j = contador - 1; j >= 0; j--) {
            System.out.println(num[j] + ",");
        }
        System.out.println("]");
    }

    public static void main(String[] args) throws Exception {
        Thread.sleep(1000);
        Cont();
    }
}