import java.util.*;



public class ejemplo1 {

    int numero;
    Scanner lector=new Scanner(System.in);
    
    System.out.println("Introduce un numero");
    numero=lector.nextInt();
    if (numero%2==0){
        System.out.println("El numero es par");
    }else{
        System.out.println("El numero es impar");
    }
}
