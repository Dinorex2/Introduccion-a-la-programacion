import java.util.Scanner;

public class ejemplo3 {
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        String claveCorrecta="eureka";
        String claveIngresada;
        int intentos=0;
        boolean accesoConcedido=false;

        while (intentos<3) {
            System.out.println("Ingrese la clave");
            claveIngresada=datos.nextLine();

            if (claveIngresada.equals(claveCorrecta)) {
                accesoConcedido=true;
            }else{
                System.out.println("Clave correcta "+(intentos+1)+" de tres");
            }
            intentos++;
        }
        if (accesoConcedido) {
            System.out.println("Acceso concedido");
        }else {
            System.out.println("Has agotado los tres intentos de acceso");
        }
    }
}
