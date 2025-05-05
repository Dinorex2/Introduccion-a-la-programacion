import java.util.*;
public class ejemplo2 {
    
    public static void main(String[] args) {
        int a;
        Scanner entrada=new Scanner(System.in);
        String nombre;
        
        System.out.println( "Digite el nombre: ");
        nombre=entrada.nextLine();
        System.out.println( "Digite el numero: ");
        a=entrada.nextInt();
        if (a>18) {
            System.out.println(nombre +" es mayor de edad");         
        }else{
            System.out.println(nombre+" no es mayor de edad");
        }

    }

}
