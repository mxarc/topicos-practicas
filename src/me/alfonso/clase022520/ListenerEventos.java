package me.alfonso.clase022520;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class
ListenerEventos implements ActionListener {
       
   JDialogAlumno jDialogAlumno;
    
    public ListenerEventos(JDialogAlumno jDialogAlumno){
        this.jDialogAlumno = jDialogAlumno;
    }
    
   @Override
    public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource() == jDialogAlumno.btnSave){
                //Obtenemos los datos de txtNombre , txtNoContro y CheckBox
                String nombre = jDialogAlumno.txtNombre.getText();
                String ncontrol = jDialogAlumno.txtNoControl.getText();
                int nc =Integer.parseInt(ncontrol);
                //No se necesitan conversiones, en mi clase alumno tengo declarada Grado como entero
                int ga = jDialogAlumno.cbGA.getSelectedIndex();
                //Creo el objeto Alumno con los datos obtenidos
                Alumno a = new Alumno (nombre, nc,ga+1);
                //Valido, si el metodo de agregar alumnos regresa Verdadero, muestra un mensaje que efectivamente se guarda en el arreglo
                if(jDialogAlumno.listaAlumnos.agregaAlumno(a) == true){
                
                   JOptionPane.showMessageDialog(jDialogAlumno, "Alumno guardado", "Mensaje de exito", JOptionPane.INFORMATION_MESSAGE);
                   //limpiar componentes
                   jDialogAlumno.txtNoControl.setText("");
                   jDialogAlumno.txtNombre.setText("");
                   
                   
               }else{
                  //Al momento de verificar si el numero de control esta registrado muestra el siguiente mensaje de error
                   JOptionPane.showMessageDialog(jDialogAlumno, "Error al arreglar", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                   
               }
            }
            //ActionListener de Exit, Sale de la Ventana JDialog
            if(actionEvent.getSource() == jDialogAlumno.btnExit){
                
                jDialogAlumno.dispose();
            }
            if (actionEvent.getSource() == jDialogAlumno.btnConsultar) {
                new JDialogConsultaAlumno(jDialogAlumno);
            }
        }
    
}
