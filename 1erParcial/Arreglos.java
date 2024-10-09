public class Arreglos
{
    public static void main(String args[])
    {
        int tam=BancoFM.pedirNumero("Cual sera el tamanio del arreglo");
        int a[]=new int[tam];

        BancoFM.llenarArreglo(a);
        //int tam=a.length;
        //BancoFM.mostrar("El tam del arreglo es: "+tam);        
        BancoFM.imprimir(a);
        
        //int mayor=BancoFM.mayor(a);//Retornar cual es el elemento mayor en el arreglo
        
        int num=BancoFM.pedirNumero("Con cual numero desea rellenar el arreglo");
        BancoFM.llenarArreglo(a,num);
        BancoFM.imprimir(a);
        
    }
}