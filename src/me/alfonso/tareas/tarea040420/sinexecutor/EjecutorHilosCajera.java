package me.alfonso.tareas.tarea040420.sinexecutor;

import java.util.ArrayList;
public class EjecutorHilosCajera {

    private static final int numCajeras = 3;

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Cliente cliente2 = new Cliente("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        Runnable proceso1 = new CajeraRunnable(cliente1, initialTime);
        Runnable proceso2 = new CajeraRunnable(cliente2, initialTime);

        new Thread(proceso1).start();
        new Thread(proceso2).start();

        long fin = System.currentTimeMillis();
        System.out.println("Tiempo Total de Procesamiento: " + (fin - initialTime) / 1000 + " Segundos");
    }
}