package me.alfonso.tareas.tarea022420;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args)
    {
        BookView bookView =new BookView();
        bookView.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);}
        });
        bookView.setTitle("Tarea ");
        bookView.setSize(480,180);
        bookView.setVisible(true);
    }
}
