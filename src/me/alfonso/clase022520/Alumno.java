
package me.alfonso.clase022520;

public class Alumno {
    private String Nombre;
    private int numeroControl;
    private int gradoAcademico;

    Alumno(String nombreAlumno, int numeroControl, int gradoAcademico) {
        this.Nombre = nombreAlumno;
        this.numeroControl = numeroControl;
        this.gradoAcademico = gradoAcademico;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNoControl(int NoControl) {
        this.numeroControl = NoControl;
    }

    public int getNumeroControl() {
        return numeroControl;
    }

    public void setGradoAcademico(int gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public int getGradoAcademico() {
        return gradoAcademico;
    }

    public String toString() {
        return "  Nombre   " + Nombre + "  NoControl  " + numeroControl + "   GA   " + gradoAcademico;
    }
}
