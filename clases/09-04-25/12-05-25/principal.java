import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int opcion;

        System.out.println("1) Ejemplo1");
        System.out.println("2) ejemplo2");
        System.out.println("3) operaciones");
        System.out.println("Elije una opcion");
        opcion=lectura.nextInt();

        switch (opcion) {
            case 1:
                ejemplo1 e1=new ejemplo1();
                e1.main(args);
            break;

            case 2:
                ejemplo2 e2=new ejemplo2();
                e2.main(args);            
            break;

            case 3:
                operaciones op=new operaciones();
                op.main(args);
            break;
            default:
                System.out.println("Opcion no valida");
        }

    }


}
