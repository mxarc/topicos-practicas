package me.alfonso.tareas.tarea040420;
public class Cliente {

    private String nombre;
    private int [] carroCompra;
    
    public Cliente(String nombre, int[] carroCompra){
        this.nombre = nombre;
        this.carroCompra = carroCompra;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarroCompra(int[] carroCompra) {
        this.carroCompra = carroCompra;
    }
}