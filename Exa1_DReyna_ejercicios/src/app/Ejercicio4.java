package app;

public class Ejercicio4 extends Thread {
    String nombre;
    public Ejercicio4 (int prioridad,String nombre){
    this.nombre=nombre;
    setPriority(prioridad);
    
    
   }

   
 public void run(){
    for(int c=1;c<=10;c++){
    System.out.print(c+"mt ");
    yield(); 
    }
    System.out.println("\n Llego a la meta " + nombre);
   }
    static Ejercicio4 comp1;
    static Ejercicio4 comp2;
    static Ejercicio4 comp3;
    static Ejercicio4 comp4;
    public static void main(String []args) throws InterruptedException {
    comp2 = new Ejercicio4(1," Leopardo 1 ");
    comp1 = new Ejercicio4(5," Leopardo 2 ");
    comp3 = new Ejercicio4(8," Leopardo 3");
    comp4 = new Ejercicio4(4," Leopardo 4 ");

    comp2.start();
    comp1.start();
    comp3.start();
    comp4.start();
    comp2.join();
    comp1.join();
    comp3.join();
    comp4.join();
    comp1.join();
 
    }
   }
   