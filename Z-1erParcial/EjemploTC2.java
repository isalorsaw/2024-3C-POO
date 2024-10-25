public class EjemploTC2
{
    public static void main(String args[])
    {
        int numero1=BancoFM.pedirNumero("Ingrese el Primer Entero");
        int numero2=BancoFM.pedirNumero("Ingrese el Segundo Entero");
        int suma=numero1+numero2;
        BancoFM.mostrar("La Suma es "+suma);
    }
}