package me.alfonso.tareas.tarea040420;

public class CajeraRunnable implements Runnable {

    private Cliente cliente;
    private long initialTime;

    public CajeraRunnable(Cliente cliente, long tiempoInicial) {
        this.cliente = cliente;
        this.initialTime = tiempoInicial;
    }

    /**
     * Metodo run
     */
    public void run() {
        System.out.println("La cajera " +
                Thread.currentThread().getName() +
                " comienza a procesar la compra del cliente " +
                this.cliente.getNombre() +
                " con el tiempo de: " +
                (System.currentTimeMillis() - this.initialTime) / 1000 +
                " segundos");
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            // Procesar el pedido, hay que esperar n segundos
            this.esperar(cliente.getCarroCompra()[i]);
            System.out.println("Procesando el producto (" + (i + 1) + ") del cliente " + this.cliente.getNombre()
                    + " | Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + " segundos");
        }
        System.out.println("La cajera " + Thread.currentThread().getName() +
                " ha terminado de procesar el pedido de " +
                this.cliente.getNombre() + " en el tiempo de: " +
                (System.currentTimeMillis() - this.initialTime) / 1000 + " segundos");
    }

    /**
     * Se hace esperar al hilo n segundos
     * @param segundos - Segundos a esperar
     */
    public void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            // tirar excepción e interrumpir
            Thread.currentThread().interrupt();
        }
    }
}