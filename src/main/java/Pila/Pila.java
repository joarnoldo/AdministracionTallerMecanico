package Pila;

public class Pila {

    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public boolean esVacia() {
        if (cima == null) {
            return true;
        } else {
            return false;
        }
    }

    public void apilar(int ID, String nombre, String puesto) {

        Nodo nuevo = new Nodo(ID, nombre, puesto);
        if (esVacia()) {
            cima = nuevo;
        } else {
            nuevo.setSiguiente(cima);

            cima = nuevo;
        }
    }

    public void desapilar() {
        if (esVacia()) {
            System.out.println("No se puede extraer ningún elemento porque la pila está vacía");
        } else {

            cima = cima.getSiguiente();
        }
    }

    public String imprimirPila() {
        String respuesta = "";

        if (!esVacia()) {
            Nodo auxiliar = cima;
            while (auxiliar != null) {

                respuesta += "ID-->" + auxiliar.getElemento().getID() + " Nombre: " + auxiliar.getElemento().getNombre() + " Puesto: " + auxiliar.getElemento().getPuesto() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        }
        return respuesta;
    }
}
