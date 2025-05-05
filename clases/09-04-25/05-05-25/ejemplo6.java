import java.util.Scanner;

public class ejemplo6 {
    
    public static void main(String[] args) {
        double p1,p2,p3;
        double aporte1,aporte2,aporte3;
        double capitalsocial;
        Scanner datos=new Scanner(System.in);

        System.out.println("Digite el aporte del primer socio ");
        aporte1=datos.nextDouble();
        System.out.println("Digite el aporte del segundo socio ");
        aporte2=datos.nextDouble();
        System.out.println("Digite el aporte del tercer socio ");
        aporte3=datos.nextDouble();

        capitalsocial=aporte1+aporte2+aporte3;

        p1=(aporte1/capitalsocial)*100;
        p2=(aporte2/capitalsocial)*100;
        p3=(aporte3/capitalsocial)*100;

        System.out.println("El aporte porcentual del primer socio:"+p1);
        System.out.println("El aporte porcentual del segundo socio:"+p2);
        System.out.println("El aporte porcentual del tercer socio:"+p3);
    }

}
