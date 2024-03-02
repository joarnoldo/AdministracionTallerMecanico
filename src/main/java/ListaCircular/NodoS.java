
package ListaCircular;


public class NodoS {
    NodoS siguiente;
    Servicios datos;

    public NodoS(Servicios dato) {
        this.datos = dato;
    }

    public NodoS getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoS siguiente) {
        this.siguiente = siguiente;
    }

    public Servicios getServicios() {
        return datos;
    }

    public void setServicios(Servicios datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        return this.datos.toString();
    }
    
    
}
