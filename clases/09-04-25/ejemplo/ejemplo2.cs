using System.Formats.Asn1;

public class ejemplo2
{
    public static void Main(string[] args)
    {
        int opcion;
        bool repetir = true;
        double areaCir, perimetroCir, radio;
        double bas, altura, areaRectangulo, perimetroRec;
        Console.WriteLine("Figiras Geometricas");
        Console.WriteLine("1) Circulo");
        Console.WriteLine("Elija una opcion");
        opcion = int.Parse(Console.ReadLine());

        switch (opcion)
        {
            case 1:
                Console.WriteLine("Por favor, digite el ratio");
                radio = double.Parse(Console.ReadLine());
                areaCir = Math.PI * Math.Pow(radio, 2);
                perimetroCir = 2 * Math.PI * radio;
                Console.WriteLine("El area del circulo es: " + areaCir);
                Console.WriteLine("El perimetro del circulo es: " + perimetroCir);
                break;
            case 2:
                Console.WriteLine("Por favor, digite la base");
                bas = double.Parse(Console.ReadLine());
                Console.WriteLine("Por favor, digite la altura:");
                altura = double.Parse(Console.ReadLine());
                areaRectangulo = bas * altura;
                perimetroRec = 2 * (bas + altura);
                Console.WriteLine("El area del rectangulo es:"+areaRectangulo);
                Console.WriteLine("El perimetro del rectangulo es:"+perimetroRec);
                break;
            default:
                Console.WriteLine("Opcion no valida");
                break;
        }
    }
}