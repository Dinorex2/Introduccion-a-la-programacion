import java.util.*;

public class ejemplo4 {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int sumap=0, suman=0, numero;

        System.out.println("Suma de numeros positivos y negativos, digite 0 para terminar");
        do{
            System.out.println("Introduce un numero");
            numero=datos.nextInt();

            if (numero>0){
                sumap=sumap+numero;
            }else if (numero<0){
                suman=suman+numero;
            }
        }while(numero!=0);
        System.out.println("La suma de los numeros positivos es: " + sumap);
        System.out.println("La suma de los numeros negativos es: " + suman);
       
    }
}
