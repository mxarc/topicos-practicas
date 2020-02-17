package me.alfonso.ejemplos;

import javax.swing.*;

public class EjemploBotonSetSize extends JFrame {

    private JButton boton;
    public EjemploBotonSetSize() {
        JLabel label = new JLabel("Ejemplo de botón usando setSize");
        label.setBounds(10, 0, 260, 60);
        add(label);
        setLayout(null);
        boton = new JButton("Botón aceptar");
        boton.setSize(150, 300);
        boton.setBounds(10, 50, 150, 30);
        add(boton);
        setSize(350, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
	    new EjemploBotonSetSize();
    }
}
