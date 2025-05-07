import java.util.*;

public class ejemplo2 {

    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
        int nota;
        String nombre_alumno;

        System.out.println("Introduce el nombre del alumno");
        nombre_alumno=datos.nextLine();
        System.out.println("Introduce la nota del alumno");
        nota=datos.nextInt();
        if (nota>=0 && nota<=59){
            System.out.println("El alumno " + nombre_alumno + " ha aprobado con un " + nota);
        else if (nota>=60 && nota<=79){
            System.out.println("El alumno " + nombre_alumno + " ha aprobado con nota regular" + nota);
        }else if (nota>=80 && nota<=89){
            System.out.println("El alumno " + nombre_alumno + " ha aprobado con nota buena" + nota);
        }else if (nota>=90 && nota<=100){
            System.out.println("El alumno " + nombre_alumno + " ha aprobado con nota excelente" + nota);
        else if (nota<0 || nota>100){
            System.out.println("La nota introducida no es correcta");
        }else{
            System.out.println("La nota no puede ser mayor a 100 ni menor a 0");


        
     
    }


}



