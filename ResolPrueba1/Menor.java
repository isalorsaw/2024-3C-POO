public class Menor
{
    public static void main(String args[])
    {
        int num1=0;
        int num2=0;
        
        num1=BancoFM.pedirNumero("Ingrese el Primer Numero");
        num2=BancoFM.pedirNumero("Ingrese el Segundo Numero");
        
        if(num1<num2)
        {
            BancoFM.mostrar(num1+" es el menor");
        }
        else if(num2<num1)
        {
            BancoFM.mostrar(num2+" es el menor");
        }
        else
        {
            BancoFM.mostrar("Ambos Numeros son Iguales");
        }
    }
}