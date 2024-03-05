

package Pila;

public class TestPila {

    public static void main(String[] args) {
        Pila empleados = new Pila();
        
        System.out.println("----------------Empleados----------------");
        empleados.apilar(0,"Alonso","Mecanico");
        empleados.apilar(1,"Julian","Recepcionista");
        empleados.apilar(2,"Pedro","Secretario");
        
       System.out.println(empleados.imprimirPila());
 
   
    }
}
