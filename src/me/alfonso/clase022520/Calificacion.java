
package me.alfonso.clase022520;

public class Calificacion {

    private int clave;
    private int cal1;
    private int cal2;
    private int cal3;

    public Calificacion(int clave, int cal1, int cal2, int cal3) {

        this.clave = clave;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;

    }

    public int getClave() {
        return clave;
    }

    public void setClave(int Clave) {
        this.clave = Clave;
    }

    public int getCal1() {
        return cal1;
    }

    public void setCal1(int Cal1) {
        this.cal1 = Cal1;
    }

    public int getCal2() {
        return cal2;
    }

    public void setCal2(int Cal2) {
        this.cal2 = Cal2;
    }

    public int getCal3() {
        return cal3;
    }

    public void setCal3(int Cal3) {
        this.cal3 = Cal3;
    }

    public String toString() {
        return "Calve   " + clave + "   Calificacion 1:  " + cal1 + "  Calificacion 2:  " + cal2 + "   Calificacion 3:   " + cal3;
    }


}
