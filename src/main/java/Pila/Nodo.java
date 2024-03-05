
package Pila;


public class Nodo {
    private DatoP elemento;
    private Nodo siguiente;

    public Nodo(int ID,String nombre,String puesto) {
        this.elemento = new DatoP(ID, nombre, puesto);
        this.siguiente = null;
    }
    
    
    public DatoP getElemento() {
        return elemento;
    }

    public void setElemento(DatoP elemento) {
        this.elemento = elemento;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
    
}
