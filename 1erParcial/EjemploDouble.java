public class EjemploDouble
{
    public static void main(String args[])
    {
        double n1=BancoFM.pedirDecimal("Ingrese un Numero Decimal");
        double n2=BancoFM.pedirDecimal("Ingrese un Segundo Numero Decimal");
        double s=n1+n2;
        BancoFM.mostrar(n1+" + "+n2+" = "+s);
    }
}
