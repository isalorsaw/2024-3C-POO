public class Ciclo
{
    public static void main(String args[])
    {
        String menu="Menu\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Salir";
        
        int opcion=BancoFM.pedirNumero(menu);
        int numero1=0;
        int numero2=0;
        
        while(opcion!=4)
        {
            numero1=BancoFM.pedirNumero("Ingrese el Primer Numero");
            numero2=BancoFM.pedirNumero("Ingrese el Segundo Numero");
            
            if(opcion==1)
            {
                int suma=numero1+numero2;
                BancoFM.mostrar(numero1+" + "+numero2+" = "+suma);
            }
            else if(opcion==2)
            {
                int restar=numero1-numero2;
                BancoFM.mostrar(numero1+" - "+numero2+" = "+restar);
            }
            else if(opcion==3)
            {
                int mult=numero1*numero2;
                BancoFM.mostrar(numero1+" Por "+numero2+" = "+mult);
            }
            else if(opcion==4)
            {
                BancoFM.mostrar("Adios");
            }
            opcion=BancoFM.pedirNumero(menu);
        }
    }
}