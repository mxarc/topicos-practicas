package me.alfonso.clase022520;

import javax.swing.*;
import java.awt.*;

public class JDialogConsultaAlumno extends JDialog {
    JTable muestraArray;
    JScrollPane scrollPane;

    public JDialogConsultaAlumno(JDialogAlumno jDialogAlumno) {
        setTitle("Consulta de alumnos");
        String[] columnas = {"NControl", "Nombre", "Grado"};
        Object[][] datos = new Object[0][jDialogAlumno.listaAlumnos.getSize()];
        datos = jDialogAlumno.listaAlumnos.getArrayList();
        muestraArray = new JTable(datos, columnas);
        add(muestraArray.getTableHeader(), BorderLayout.PAGE_START);
        add(muestraArray, BorderLayout.CENTER);
        scrollPane = new JScrollPane(muestraArray);
        scrollPane.setVisible(true);
        add(scrollPane);
        setBounds(1000, 300, 300, 300);
        setVisible(true);
    }
}
