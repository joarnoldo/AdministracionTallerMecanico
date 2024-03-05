package ListaCircular;

public class ListaCircular {
    NodoLC cabeza;
    NodoLC ultimo;
    
    public void inserta(DatosLC p)
    {
        if(cabeza == null)
        {
            cabeza = new NodoLC(p);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
        }
        else
        {
            if(p.getId() < cabeza.getDato().getId())
            {
                NodoLC auxiliar = new NodoLC(p);
                auxiliar.setSiguiente(cabeza);
                cabeza = auxiliar;
                ultimo.setSiguiente(cabeza);
            }
            else
            {
                if(ultimo.getDato().getId() < p.getId())
                {
                    NodoLC auxiliar = new NodoLC(p);
                    ultimo.setSiguiente(auxiliar);
                    ultimo = auxiliar;
                    ultimo.setSiguiente(cabeza);
                }
                else
                {
                    NodoLC auxiliar = cabeza;
                    while(auxiliar.getSiguiente().getDato().getId() < p.getId())
                    {
                        auxiliar = auxiliar.getSiguiente();
                    }
                    
                    NodoLC temporal = new NodoLC(p);
                    temporal.setSiguiente(auxiliar.getSiguiente());
                    auxiliar.setSiguiente(temporal);
                }
            }
        }
    }
    
    //Buscar por Id
   public NodoLC buscarPorId(int id) {
    NodoLC aux = cabeza;
    while (aux != null && aux.getDato().getId() != id) {
        aux = aux.getSiguiente();
    }
    return aux;
    }
    
    //Eliminar por Id
    public boolean eliminarPorId(int id) {
    NodoLC aux = cabeza;
    NodoLC anterior = null;
    while (aux != null && aux.getDato().getId() != id) {
        anterior = aux;
        aux = aux.getSiguiente();
    }
    if (aux != null) {
        if (aux == cabeza) {
            cabeza = cabeza.getSiguiente();
            ultimo.setSiguiente(cabeza);
        } else if (aux == ultimo) {
            ultimo = anterior;
            anterior.setSiguiente(cabeza);
        } else {
            anterior.setSiguiente(aux.getSiguiente());
        }
        return true;
    }
    return false;
    }
    
   public String imprimirSiguienteDelUltimo()
    {
        return ultimo.getSiguiente().toString();
    }

    @Override
    public String toString() {
        String respuesta = "Lista circular: \n";
        
        NodoLC auxiliar = cabeza;
        
        if(auxiliar != null)
        {
            
            respuesta += auxiliar.toString() + "\n";
            auxiliar = auxiliar.getSiguiente();
            while(auxiliar != cabeza)
            {
                respuesta += auxiliar.toString() + "\n";
                auxiliar = auxiliar.getSiguiente();
            }
        }
        else
        {
            respuesta += "Vacía";
        }
        
        return respuesta;
    }
    
    
    
    
    
    
    
    
}
