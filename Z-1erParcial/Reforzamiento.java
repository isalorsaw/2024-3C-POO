/*
 * >Pedir el tamanio del arreglo.
 * Pedir un rango
 * Rellenar el arreglo con numeros aleatorios del rango
 * Sumar todos los elementos del arreglo
 * >Mostrar todos los elementos del arreglo (Funcion)
*/
public class Reforzamiento
{
    public static void main(String args[])
    {
        int tam=BancoFM.pedirNumero("Cual sera el tamanio del Arreglo");
        int arr[]=new int[tam];
        //int a[]={10,20,30};
        
        BancoFM.llenarAleatorio(arr,10,15);
        
        int num=BancoFM.generaAleatorio(10,15);
        
        //BancoFM.imprimir(a);//Metodo
        String salida=BancoFM.imprimirF(arr);
        BancoFM.mostrar("Informacion del Arreglo:\n"+salida);
    }
}