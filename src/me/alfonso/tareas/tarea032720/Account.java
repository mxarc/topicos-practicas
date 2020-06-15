package me.alfonso.tareas.tarea032720;

public class Account {
    private int balance = 50;
    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
