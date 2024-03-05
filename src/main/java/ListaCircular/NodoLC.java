
package ListaCircular;


public class NodoLC {
    NodoLC siguiente;
    DatosLC dato;

    public NodoLC(DatosLC dato) {
        this.dato = dato;
    }

    public NodoLC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLC siguiente) {
        this.siguiente = siguiente;
    }

    public DatosLC getDato() {
        return dato;
    }

    public void setDato(DatosLC dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return this.dato.toString();
    }
    
    
}
