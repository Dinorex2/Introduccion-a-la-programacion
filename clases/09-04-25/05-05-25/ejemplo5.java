import java.util.Scanner;

public class ejemplo5 {
    
    public static void main(String[] args) {
        int numero;
        int contador=1;
        Scanner lectura=new Scanner(System.in);
        System.out.println("Digite el numero");
        numero=lectura.nextInt();

        while (contador<=12) {
            System.out.println(numero+" X "+contador+" = "+(numero*contador));
        contador++;
        }
    }

}
