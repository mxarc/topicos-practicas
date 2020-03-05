package me.alfonso.clase021720;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ManejadorJCheckBox implements ItemListener, ActionListener {

    private UsandoJCheckBox usandoJCheckBox;
    private int valCursiva = Font.PLAIN;
    private int valNegrita = Font.PLAIN;

    ManejadorJCheckBox(UsandoJCheckBox usandoJCheckBox) {
        this.usandoJCheckBox = usandoJCheckBox;
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        JCheckBox checkBoxBold = this.usandoJCheckBox.checkBoxBold;
        JCheckBox checkBoxItalic = this.usandoJCheckBox.checkBoxItalic;
        JTextField textField = this.usandoJCheckBox.textLayout1;
        if (itemEvent.getSource() == checkBoxBold) {
            valNegrita = checkBoxBold.isSelected() ? Font.BOLD : Font.PLAIN;
        }
        if (itemEvent.getSource() == checkBoxItalic) {
            valCursiva = checkBoxItalic.isSelected() ? Font.ITALIC : Font.PLAIN;
        }
        textField.setFont(new Font("Serif", valNegrita + valCursiva, 14));

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (this.usandoJCheckBox.datos.agregaDatos()) {
            JOptionPane.showMessageDialog(this.usandoJCheckBox, "Datos guardados",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
            this.usandoJCheckBox.textLayout1.setText("");
            this.usandoJCheckBox.checkBoxBold.setSelected(false);
            this.usandoJCheckBox.checkBoxItalic.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this.usandoJCheckBox, "Ya no se puede guardar más",
                    "Información", JOptionPane.ERROR_MESSAGE);
        }
    }
}
