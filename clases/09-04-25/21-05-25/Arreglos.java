//NO ESTA COMPLETO

public class Arreglos {
    int a;
    int b;
    String nombre;

    public Arreglos(){
    }

    public Arreglos(int a, int b, String nombre){
        this.a = a;
        this.b = b;
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Arreglos arre=new Arreglos();
        Arreglos arrel=new Arreglos(5,7,"Juan");

        System.out.printIn("Llamada al getter"+arrel.getA());
        System.out.printIn("Llamada al getter"+arrel.getB());

    }
    
}