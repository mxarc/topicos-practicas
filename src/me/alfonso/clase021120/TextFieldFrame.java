package me.alfonso.clase021120;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {

    // Campos UI
    private JTextField campoTexto1;
    private JTextField campoTexto2;
    private JTextField campoTexto3;
    private JPasswordField campoClave;

    public TextFieldFrame() {
        // Instanciar JFrame
        super("Prueba de JTextField y JPassword");
        // Setear FlowLayout para la app
        setLayout(new FlowLayout());
        // construye campo de texto con 10 columnas
        campoTexto1 = new JTextField(10);
        add(campoTexto1);

        campoTexto2 = new JTextField("Escriba el texto aquí");
        add(campoTexto2);

        campoTexto3 = new JTextField("Campo de texto no editable", 21);
        campoTexto3.setEditable(false);
        add(campoTexto3);

        campoClave = new JPasswordField("Texto oculto");
        add(campoClave);

        ManejadorCampoTexto manejadorCampoTexto = new ManejadorCampoTexto();
        campoClave.addActionListener(manejadorCampoTexto);
        campoTexto1.addActionListener(manejadorCampoTexto);
        campoTexto2.addActionListener(manejadorCampoTexto);
        campoTexto3.addActionListener(manejadorCampoTexto);
    }

    // En esta clase están implementados los eventos
    private class ManejadorCampoTexto implements ActionListener {
        @Override
        // Este metodo se dispara cuando se realiza una acción
        public void actionPerformed(ActionEvent actionEvent) {
            String cadena = "";
            // Accionar ante cada comando ejecutado por los campos de texto y almacenar su valor en cadena
            if (actionEvent.getSource() == campoTexto1) {
                cadena = String.format("campoTexto1: %s", actionEvent.getActionCommand());
            } else if (actionEvent.getSource() == campoTexto2) {
                cadena = String.format("campoTexto2: %s", actionEvent.getActionCommand());
            } else if (actionEvent.getSource() == campoTexto3) {
                cadena = String.format("campoTexto3: %s", actionEvent.getActionCommand());
            } else if (actionEvent.getSource() == campoClave) {
                cadena = String.format("campoClave: %s", actionEvent.getActionCommand());
            }
            // Mostrar mensaje contenido en cadena
            JOptionPane.showMessageDialog(null, cadena);
        }
    }

}
