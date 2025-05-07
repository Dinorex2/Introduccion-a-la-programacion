import java.util.*;

public class ejemplo5 {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int numero;
    
        System.out.println("Introduce un numero");
        numero=datos.nextInt();
        
        switch (datos) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");

        
            default:
                System.out.println("Dia no valido");
                break;
        }
    }
}
