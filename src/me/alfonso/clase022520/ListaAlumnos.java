
package me.alfonso.clase022520;

import java.util.ArrayList;

public class ListaAlumnos {

    ArrayList<Alumno> arrayAlumnos;
    JDialogAlumno jDialogAlumno;

    ListaAlumnos() {
        arrayAlumnos = new ArrayList<>();
    }

    public boolean agregaAlumno(Alumno alumno) {
        //Se pasa por parametro un Objeto alumno
        boolean retorno = false;
        //Se valida que el numero de control no este repetido, si es asi, no deja que se añada
        if (!buscaNumeroControl(alumno.getNumeroControl())) {
            arrayAlumnos.add(alumno);
            System.out.println(arrayAlumnos);
            retorno = true;
        }
        return retorno;
    }

    // agregar un metodo para validar el numero de control
    public boolean buscaNumeroControl(int noControl) {
        boolean retorno = false;//solo creacion de boolean
        // Recorre el arreglo y valida que cada Objeto guardado en este tenga el mismo numero de control, si es asi regresa verdadero
        // entonces esto se valida de la manera contraria
        for (Alumno a : arrayAlumnos) {
            if (noControl == a.getNumeroControl()) {
                retorno = true;
                break;
            }
        }
        return retorno;
    }
    public String[][] getArrayList() {
        String[][] datos = new String[arrayAlumnos.size()][3];
        int conteo = 0;
        for (int i = 0; i < arrayAlumnos.size(); i++) {
            Alumno alumno = arrayAlumnos.get(i);
            datos[conteo][0] = Integer.toString(alumno.getNumeroControl());
            datos[conteo][1] = alumno.getNombre();
            datos[conteo][2] = Integer.toString(alumno.getGradoAcademico());
            conteo++;
        }
        return datos;
    }

    public int getSize() {
       return this.arrayAlumnos.size();
    }
}
