package me.alfonso.clase021720;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextLayout;

// Capa de presentación
public class UsandoJCheckBox extends JFrame {

    JTextField textLayout1;
    JCheckBox checkBoxBold, checkBoxItalic;
    JButton btnGuardar;
    GuardeDatosJCheckB datos;

    UsandoJCheckBox() {
        setLayout(new FlowLayout());
        this.textLayout1 = new JTextField("Observe como cambia el estilo de tipo de letra" , 28);
        this.textLayout1.setFont(new Font("Serif", Font.PLAIN, 14));
        add(this.textLayout1);
        this.checkBoxBold = new JCheckBox("Negrita");
        add(this.checkBoxBold);
        this.checkBoxItalic = new JCheckBox("Cursiva");
        add(this.checkBoxItalic);
        this.btnGuardar = new JButton("Guardar");
        add(btnGuardar);
        this.datos = new GuardeDatosJCheckB(this);
        ManejadorJCheckBox manejadorJCheckBox = new ManejadorJCheckBox(this);
        this.checkBoxItalic.addItemListener(manejadorJCheckBox);
        this.checkBoxBold.addItemListener(manejadorJCheckBox);
        this.btnGuardar.addActionListener(manejadorJCheckBox);
    }
}
