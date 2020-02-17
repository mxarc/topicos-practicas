package me.alfonso.tareas.tarea021620;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/*
Deberán de agregar una etiqueta y un jtextfield en donde se permita la captura de la edad de la persona. El diseño es libre.

Al momento de guardar deberán de validar que se haya introducido información y además verificar que se haya proporcionado un número.

En caso de que no se cumplan las validaciones deberán de enviar el mensaje correspondiente por medio de un MessageDialog.

Recuerden incluir en botón limpiar al jtextfield de la edad.

Deberán de subir en un archivo PDF:

-Pantallas con el código (incluyendo los comentarios que ya han estado agregando). - El código debe poder visualizarse para poder revisar, ya que en ocasiones han subido tareas cuyo código no se ve bien.

- Ejemplos de pantallas de ejecución en donde se introduzcan datos y se realicen las validaciones.

-El proyecto con el que trabajaran es con el que tiene las 3 clases separadas (lo comentamos en clases).
 */
public class Principal {
    public static void main(String[] args)
    {
        Frame f=new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);}
        });
        f.setTitle("Trabajando Eventos 1 ");
        f.setSize(370,300);
        f.setVisible(true);
    }
}