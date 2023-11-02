package clases;

public class Hilo1 extends Thread {

    @Override

    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {

                Hilo1.sleep(1000);
                System.out.print( i + ": G");

            } catch (InterruptedException e) {

                System.out.println("Error en la clase H1" + e);

            }
        }

    }
}
