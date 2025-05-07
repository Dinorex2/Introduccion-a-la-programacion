import java.util.*;

public class ejemplo6 {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        char opcion;

        System.out.println("Digite una zona (A-B-C)");
        opcion=datos.next().charAt(0);

        switch (opcion) {
            case 'A':
                System.out.println("Zona A");
                break;
            case 'B':
                System.out.println("Zona B");
                break;
            case 'C':
                System.out.println("Zona C");
                break;
        
            default:
                System.out.println("Zona no valida");
                break;
        }
    }
}

