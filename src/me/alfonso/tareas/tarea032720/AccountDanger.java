package me.alfonso.tareas.tarea032720;

public class AccountDanger implements Runnable {
    private Account account = new Account();

    public static void main(String[] args) {
        AccountDanger r = new AccountDanger();
        Thread one = new Thread(r);
        Thread two = new Thread(r);
        one.setName("Usuario 1");
        two.setName("Usuario 2");
        one.start();
        two.start();
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 5; i++) {
            makeWithDrawal(10);
        }
    }

    private synchronized void makeWithDrawal(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " Va a retirar");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ignored) {}
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " Termino de retirar");
        } else {
            System.out.println("No hay suficiente saldo " +
                    Thread.currentThread().getName() + " para Retirar " +
                    account.getBalance());
        }
    }
}
