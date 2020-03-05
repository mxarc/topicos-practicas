package me.alfonso.clase021720;

public class GuardeDatosJCheckB {

    private String[] arreglo;
    int pos = 0;
    private UsandoJCheckBox ventana;

    GuardeDatosJCheckB(UsandoJCheckBox usandoJCheckBox) {
        arreglo = new String[10];
        this.ventana = usandoJCheckBox;
    }

    public boolean agregaDatos() {
        boolean retorno = false;
        if (pos < 10) {
            arreglo[pos] = ventana.textLayout1.getText().toUpperCase();
            pos++;
            retorno = true;
        }
        return retorno;
    }
}
