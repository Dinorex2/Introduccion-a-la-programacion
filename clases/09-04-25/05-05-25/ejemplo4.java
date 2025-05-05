import java.util.Scanner;

public class ejemplo4 {
    
    public static void main(String[] args) {
        int numero;
        int contador=1;
        Scanner datos = new Scanner(System.in);

        System.out.println("Digite el numero");
        numero=datos.nextInt();

            do{
                System.out.println(numero+" X "+contador+" = "+(numero*contador));
                contador++;
            }while(contador<=12);
    }

}
