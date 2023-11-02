package clases;

public class Hilo2 extends Thread {

    @Override

    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {

                Hilo2.sleep(1000);
                System.out.print("E");

            } catch (InterruptedException e) {

                System.out.println("Error en la clase H2" + e);

            }
        }

    }
}
