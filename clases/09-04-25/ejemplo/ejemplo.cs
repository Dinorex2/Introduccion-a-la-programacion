


public class ejemplo
{
    public void Cuadrado(double lado)
    {
        double area, perimetro;
        perimetro = 4 * lado;
        area = Math.Pow(lado, 2);
        Console.WriteLine("El area es:" + area);
        Console.WriteLine($"El perimetro es:{perimetro}");
    }
}