package ListaCircular;

public class TestListasCirculares {

    public static void main(String[] args) {
        ListaCircular l = new ListaCircular();
        
        l.inserta(new DatosLC(1, "Manuel",5600));
        System.out.println(l.toString());
        l.inserta(new DatosLC(2, "Sofia",6789));
        System.out.println(l.toString());
        l.inserta(new DatosLC(3, "Juan",56800));
        System.out.println(l.toString());
        l.inserta(new DatosLC(4, "Lorena",6786));
        System.out.println(l.toString());
        l.inserta(new DatosLC(5, "Sandra",1000));
        System.out.println(l.toString());
        System.out.println(l.imprimirSiguienteDelUltimo());
    }
}
