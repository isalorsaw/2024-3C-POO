public class Tarea2P1
{
    public static void main(String args[])
    {
        //int tam=BancoFM.pedirNumero("Cual sera el tam del Arreglo");
        int tam=BancoFM.generaAleatorio(2,10);
        int a[]=new int[tam];
        BancoFM.mostrar("El tam del arreglo es: "+tam);
        
        String menu="Menu \n1.Llenar Arreglo x Usuario\n2.Rellenar Arreglo por Valor\n3.Llenar Aleatorio\n"+
        "4. Imprimir\n5. Sumatoria\n0.Salir";
        
        int opcion=0;
        
        do
        {
            opcion=BancoFM.pedirNumero(menu);
            
            if(opcion==1)
            {
                BancoFM.llenarArreglo(a);
            }
            else if(opcion==2)
            {
                int n=BancoFM.pedirNumero("Ingrese el Numero para rellenar el Arreglo");
                BancoFM.llenarArreglo(a,n);
            }
            else if(opcion==3)
            {
                int desde=BancoFM.pedirNumero("Ingrese el Desde");
                int hasta=BancoFM.pedirNumero("Ingrese el Hasta");
                BancoFM.llenarAleatorio(a,desde,hasta);
            }
            else if(opcion==4)
            {
                BancoFM.imprimir(a);
            }
            else if(opcion==5)
            {
                int s=BancoFM.suma(a);
                String cadena=BancoFM.imprimirF(a);
                BancoFM.mostrar("Los elementos del arreglo son: "+cadena+"\nLa Sumatoria de los Elementos es: "+s);
            }
            else if(opcion==11)//Contar
            {
                
            }
            else if(opcion==10)//Reemplazar
            {
                
            }
            else if(opcion==0)
            {
                BancoFM.mostrar("Adios");
            }
            else 
            {
                BancoFM.mostrar("Opcion Invalida");
            }
            
        }while(opcion!=0);
        
    }
}