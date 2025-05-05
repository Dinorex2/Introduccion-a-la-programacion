import java.util.Scanner;

public class ejemplo3 {
    
    public static void main(String[] args) {
        //tablas de multiplicar
        int numero;
        Scanner datos=new Scanner(System.in);

        System.out.println("Digite el numero ");
        numero=datos.nextInt();

        System.out.println("Tabla de multiplicar");
        for(int i=1;i<=12; i++){
            System.out.println(numero+" X "+i+" = "+(numero*i));
        }
    }

}
