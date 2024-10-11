public class NotasCiclo
{
    public static void main(String args[])
    {
        int numero=0;
        int suma=0;
        
        int i=0;
        while(i<4)
        {
            int n=i+1;
            numero=BancoFM.pedirNumero("Ingrese Una Nota "+n);
            suma=suma+numero;
            i++;
        }
        int prom=suma/4;
        
        if(prom>=70)BancoFM.mostrar("APROBADO");
        else BancoFM.mostrar("REPROBADO");
    }
}