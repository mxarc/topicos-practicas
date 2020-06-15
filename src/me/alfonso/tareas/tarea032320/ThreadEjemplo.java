package me.alfonso.tareas.tarea032320;

public class ThreadEjemplo extends Thread {

    public ThreadEjemplo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(i + getName());
        }
        System.out.println("Termina thread " + getName());
    }

    public static void main(String[] args) {
        ThreadEjemplo thread1 = new ThreadEjemplo("Pepe");
        ThreadEjemplo thread2 = new ThreadEjemplo("Juan");
        ThreadEjemplo thread3 = new ThreadEjemplo("Paco");
        Thread threadN1 = new Thread("Alfonso");
        Thread threadN2 = new Thread("Katy");
        Thread threadN3 = new Thread("Lucía");
        thread1.start();
        threadN3.start();
        thread3.start();
        threadN2.start();
        thread2.start();
        threadN1.start();
    }
}
