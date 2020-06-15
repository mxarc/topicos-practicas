package me.alfonso.clase032020;

public class Threads extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Se acaba el Thread");
    }

    public static void main(String[] args) {
        Threads threads = new Threads();
        threads.start();
    }
}
