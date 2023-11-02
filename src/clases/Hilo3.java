package clases;

public class Hilo3 extends Thread {

    @Override

    public void run() {

        for (int i = 1; i <= 5; i++) {

            try {

                Hilo3.sleep(1000);
                System.out.print("E");

            } catch (InterruptedException e) {

                System.out.println("Error en la clase H3" + e);

            }
        }

    }
}
