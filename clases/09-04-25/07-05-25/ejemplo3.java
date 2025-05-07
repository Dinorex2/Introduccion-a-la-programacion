import java.util.*;

public class ejemplo3 {
    
    public static void main(String[] args) {
        int suma=0;
        int numero;
        Scanner lectura_datos=new Scanner(System.in);

        System.out.println("Suma de numeros enteros, digite 0 para terminar");

        do{
            System.out.println("Introduce un numero");
            numero=lectura_datos.nextInt();
            suma=suma+numero;
        }while(numero!=0);

        System.out.println("La suma de los numeros es: " + suma);
     
    
}
}

