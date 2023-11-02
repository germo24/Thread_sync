package clases;

public class Hilo4 extends Thread {

    @Override

    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {

                Hilo4.sleep(1000);
                System.out.println("K");

            } catch (InterruptedException e) {

                System.out.println("Error en la clase H4" + e);

            }
        }

    }

}
