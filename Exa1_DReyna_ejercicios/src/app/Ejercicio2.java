package app;

public class Ejercicio2 extends Thread {

    int sumar = 0;
    int[] Array = { 2, 7, 5, 4, 9, 3, 6, 8, 1, 10 };

    public Ejercicio2() {
        System.out.println(" TODAS LAS SUMAS **");
    }

    @Override
    public void run() {
        for (int i : Array) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            this.sumar = this.sumar + (int) Math.pow(i, 3);
            System.out.println("Suma de los numeros e" + this.sumar);
        }
        System.out.println("Suma total de los numeros: " + this.sumar);
    }

    public static void main(String[] args) throws Exception {
        Thread sum = new Ejercicio2();
        sum.start();
    }

}