import java.util.Scanner;
import java.text.DecimalFormat;

public class ejemplo2 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int opcion;
        double dolares, cordobas;

        System.out.println("Convercion monetaria");
        System.out.println("1) Dolares a Cordobas");
        System.out.println("2) Corodobas a Dolares");
        System.out.println("Elija una opcion");
        opcion=lectura.nextInt();
        DecimalFormat formato=new DecimalFormat();

        switch (opcion) {
            case 1:
                System.out.println("Digite la cantidad de dolares");
                dolares=lectura.nextDouble();
                cordobas=dolares*36.70;
                System.out.println("US$ "+dolares+" dolares son C$"+formato.format(cordobas)+" cordobas");
                break;
            case 2:
                System.out.println("Digite la cantidad de cordobas");
                cordobas=lectura.nextDouble();
                dolares=cordobas/36.70;
                System.out.println("C$ "+cordobas+" codobas son US$"+formato.format(dolares)+" dolares");
                break;
        
            default:
                System.out.println("Opcion no valida");
        }
    }
}
