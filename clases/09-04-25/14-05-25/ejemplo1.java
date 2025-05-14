import java.util.Scanner;

public class ejemplo1{
    public static void main (String[] args){
        Scanner lectura_datos=new Scanner(System.in);
        int a,b;

        System.out.print ("Por favor digite el primer numero");
        a=lectura_datos=nextInt();

        System.out.print ("Por favor digite el segundo numero");
        b=lectura_datos=nextInt();

        System.out.print ("Valores intercambiados");

        System.out.println("A:" +b);
        System.out.println("B:" +a);
    }
}