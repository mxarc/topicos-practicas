
package me.alfonso.clase022520;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class JDialogAlumno extends JDialog {

    JButton btnSave;
    JButton btnExit;
    JButton btnConsultar;
    JTextField txtNoControl;
    JTextField txtNombre;
    JComboBox<Byte> cbGA;
    JLabel etq1;
    JLabel etq2;
    JLabel etq3;
    ListaAlumnos listaAlumnos;

    JDialogAlumno() {
        setTitle("JDialog con alumno");
        setLayout(new FlowLayout());
        etq1 = new JLabel("Numero de Control");
        add(etq1);
        txtNoControl = new JTextField(3);
        add(txtNoControl);
        etq2 = new JLabel("Nombre");
        add(etq2);
        txtNombre = new JTextField(15);
        add(txtNombre);
        etq3 = new JLabel("Grado Academico");
        add(etq3);
        //Agrego un arreglo de tipo Byte para agregar numeros
        Byte[] GA = new Byte[]{1, 2, 3, 4, 5, 6};
        //Al crear el combobox pasamos el arreglo para obtener los datos
        cbGA = new JComboBox<Byte>(GA);
        add(cbGA);
        btnSave = new JButton("Guardar");
        add(btnSave);
        btnExit = new JButton("Salir");
        add(btnExit);
        btnConsultar = new JButton("Consultar");
        add(btnConsultar);

        cbGA.setEditable(false);

        listaAlumnos = new ListaAlumnos();

        //implementar la capa aplicacion
        ListenerEventos listenerEventos = new ListenerEventos(this);
        btnSave.addActionListener(listenerEventos);
        btnExit.addActionListener(listenerEventos);
        btnConsultar.addActionListener(listenerEventos);

        setVisible(true);
        setSize(420, 140);

    }

}
