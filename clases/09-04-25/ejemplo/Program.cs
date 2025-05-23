public class ejemplo1
{
    int a;

    public ejemplo1(int a)
    {
        this.a = a;
    }

    string categoria;

    public ejemplo1(string categoria)
    {
        this.categoria = categoria;
    }

    double precio;

    public ejemplo1(double precio)
    {
        this.precio = precio;
    }

    public ejemplo1()
    {

    }

    public int Sumar(int a, int b)
    {
        double sum = 0;
        sum = a + b;
        return (int)sum;
    }
    public static void Main(string[] args)
    {
        int a, b;
        ejemplo1 objet = new ejemplo1();
        Console.WriteLine("Digite el valor de a");
        a = int.Parse(Console.ReadLine());
        Console.WriteLine("Digite el valor de b");
        b = int.Parse(Console.ReadLine());

        Console.WriteLine("La suma es: " + objet.Sumar(a, b));

        if (a > b)
        {
            Console.WriteLine("El primer numero es mayor que el segunto");
        }
        else if (a < b)
        {
            Console.WriteLine("El primer numero es menor que el segundo");
        }
        else
        {
            Console.WriteLine("Los numeros son iguales");
        }
        Console.WriteLine("La raiz del numero es:" + Math.Sqrt(a));

        Console.WriteLine("Ciclo for:");
        for (int i = 0; i < 10; i++)
        {
            Console.WriteLine("El valor del contador" + i);

        }
        ejemplo Figura = new ejemplo();
        Figura.Cuadrado(a);
    }

}
