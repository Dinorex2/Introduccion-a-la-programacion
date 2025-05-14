import java.util.Scanner;

public class ejemplo2 {
    public static void main (String[] args){
        Scanner datos=new Scanner(System.in);
        System.out.println("---Cuadrado de los 9 primeros numeros---");
        
        for (int i=1; i<10; i++) {
            int Cuadrado=i*i;
            System.out.println("El cuadrado de "+i+"es "+Cuadrado);
        }
        System.out.println("Con una funcion agregada");
        for (int i = 1; i < 10; i++) {
            System.out.println("El cuadrado de "+i+"es "+Math.pow(i, 2));
        }
    }
}