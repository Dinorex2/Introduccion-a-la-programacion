import java.util.Scanner;

public class ejemplo1 {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        double a,b;
        String nombre;
        int edad;

        System.out.println("Digite el nombre");
        nombre=datos.nextLine();
        System.out.println("Digite la edad");
        edad=datos.nextInt();

        if (edad>=0 && edad<15) {
            System.out.println("Es un niño");
        
        }else if (edad>=16 && edad<=18) {
            System.out.println("Es un adolecente");
            
        }else if (edad>=19 && edad<=40) {
            System.out.println("Es un adulto joven");
        }else if (edad>=41 && edad<=59) {
            System.out.println("Es un adulto");
        }else if (edad>=60 && edad<=100) {
            System.out.println("Es un adulto mayor");
        }else{
            System.out.println("Edad peligriso podria estar difinto");
        }

    }
}