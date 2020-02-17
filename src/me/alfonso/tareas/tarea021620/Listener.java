package me.alfonso.tareas.tarea021620;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Listener implements ActionListener, ItemListener {

    // Objeto de la clase Frame
    private Frame frame;

    // Constructor de la clase Listener, se instancia haciendo referencia a la clase Frame
    Listener(Frame frame) {
        this.frame = frame;
    }

    // Se acciona cuando el estado de un checkbox cambia
    public void itemStateChanged(ItemEvent ie) {
        String texto = "Ingles :" + this.frame.chkIngles.isSelected();
        texto += " Frances " + this.frame.chkFrances.isSelected();
        texto += " Italiano " + this.frame.chkItaliano.isSelected();
        this.frame.eticheck.setText(texto);
    }

    // Se acciona cuando se realiza una acción
    public void actionPerformed(ActionEvent ae) {
        //dos formas de obtener el origen del evento
        // aqui se obtiene con el NOMBRE del componente
        String algo = ae.getActionCommand();
        // aqui se obtiene el OBJETO de donde surgio el evento
        Object otro = ae.getSource();
        System.out.println(algo);
        System.out.println(otro);

        //if (algo.equals("Aceptar")) // tambien funciona este if
        if (otro == this.frame.btnAceptar) {
            // Se realiza la validación de datos
            if (ValidaDatos()) {
                JOptionPane.showMessageDialog(null, "Datos Correctos");
            }
        } else {
            // Limpiar TextFields y reiniciar estado de checkboxes
            this.frame.txtNombre.setText("");
            this.frame.txtApellido.setText("");
            this.frame.txtEdad.setText("");
            this.frame.chkIngles.setSelected(false);
            this.frame.chkIngles.setSelected(false);
            this.frame.chkFrances.setSelected(false);
            this.frame.chkItaliano.setSelected(false);
        }
    }

    public boolean ValidaDatos() {
        String texto1 = this.frame.txtNombre.getText().trim();
        if (texto1.equals("")) {
            JOptionPane.showMessageDialog(null, "Nombre no debe estar en blanco");
            return false;
        }
        texto1 = this.frame.txtApellido.getText().trim();
        if (texto1.equals("")) {
            JOptionPane.showMessageDialog(null, "Apellido no debe estar en blanco");
            return false;
        }
        String edadTxt = this.frame.txtEdad.getText().trim();
        try {
         int edad = Integer.parseInt(edadTxt);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Edad debe ser un numero");
            return false;
        }
        return true;
    }
}
