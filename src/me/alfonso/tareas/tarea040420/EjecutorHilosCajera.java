package me.alfonso.tareas.tarea040420;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EjecutorHilosCajera {

    private static final int numCajeras = 3;

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(new Cliente("Cliente 1", new int[]{2, 2, 1, 5, 2}));
        clientes.add(new Cliente("Cliente 2", new int[]{1, 1, 5, 1, 1}));
        clientes.add(new Cliente("Cliente 3", new int[]{3, 3, 2, 3, 3}));
        clientes.add(new Cliente("Cliente 3", new int[]{3, 7, 1, 2, 8}));

        long init = System.currentTimeMillis();//Instante Inicials del Procedimiento

        ExecutorService executor = Executors.newFixedThreadPool(numCajeras);
        for (Cliente cliente : clientes) {
            Runnable cajera = new CajeraRunnable(cliente, init);
            executor.execute(cajera);
        }
        executor.shutdown();
        while (true) {
            if (executor.isTerminated()) break;
        }
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo Total de Procesamiento: " + (fin - init) / 1000 + " Segundos");
    }
}