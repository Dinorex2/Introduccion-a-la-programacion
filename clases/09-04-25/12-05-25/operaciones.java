import java.util.Scanner;

public class operaciones {
    public void saludo(){
        System.out.println("Hola mundo");

    }
    public int sumar(int a, int b){
        int suma=0;
        suma=a+b;
        return suma;
    }
        public int restar(int a, int b){
        int resta=0;
        resta=a-b;
        return resta;
    }
        public int multiplicar(int a, int b){
        int multiplicacion=0;
        multiplicacion=a*b;
        return multiplicacion;
    }
        public int dividir(int a, int b){
        int division=0;
        division=a/b;
        return division;
    }
    public static void main(String[] args) {
        operaciones ope=new operaciones();
        Scanner datos=new Scanner(System.in);
        int x,y;
        ope.saludo();

        System.out.println("Digite el primer valor");
        x=datos.nextInt();
        System.out.println("Digite el segundo valor");
        y=datos.nextInt();
        System.out.println("La suma es:"+ope.sumar(x, y));
        System.out.println("La resta es:"+ope.restar(x, y));
        System.out.println("La multiplicacion es:"+ope.multiplicar(x, y));
        System.out.println("La division es:"+ope.dividir(x, y));
    }
}
