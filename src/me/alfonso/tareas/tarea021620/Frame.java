package me.alfonso.tareas.tarea021620;

import java.awt.*;
import javax.swing.*;

// Clase Frame, contiene capa de presentación
public class Frame extends JFrame {
    // Objetos UI
    JTextField txtNombre,txtApellido, txtEdad;
    JCheckBox chkIngles, chkFrances, chkItaliano;
    JButton btnAceptar, btnLimpiar;
    JLabel eticheck;
    Frame(){
        setLayout(new FlowLayout());
        Label eti1, eti2, edad;
        eti1=new Label("Nombre");
        add(eti1);
        txtNombre= new JTextField(30);
        add(txtNombre);
        eti2=new Label("Apellido");
        add(eti2);
        txtApellido= new JTextField(30);
        add(txtApellido);
        edad = new Label("Edad");
        add(edad);
        txtEdad = new JTextField(5);
        add(txtEdad);
        // otra manera de agregar las etiquetas
        add(new Label("Idiomas"));
        chkIngles= new JCheckBox("Ingles");
        add(chkIngles);
        chkFrances= new JCheckBox("Frances");
        add(chkFrances);
        chkItaliano= new JCheckBox("Italiano");
        add(chkItaliano);
        btnAceptar= new JButton("Aceptar");
        btnLimpiar= new JButton("Limpiar");
        add(btnAceptar);
        add(btnLimpiar);
        eticheck= new JLabel("                                 ");
        add(eticheck);
        // Crear instancia listener
        Listener listener = new Listener(this);
        // Adjuntar listener a los botones y checklist
        btnAceptar.addActionListener(listener);
        btnLimpiar.addActionListener(listener);
        chkIngles.addItemListener(listener);
        chkFrances.addItemListener(listener);
        chkItaliano.addItemListener(listener);
    }
}