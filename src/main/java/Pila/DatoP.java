
package Pila;


public class DatoP {
    private int ID;
    private String nombre;
    private String puesto;

    public DatoP(int ID, String nombre, String puesto) {
        this.ID = ID;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
    
}
