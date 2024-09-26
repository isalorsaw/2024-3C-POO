 /*
Pedir 3 numeros y mostrar la suma de todos ellos. Utilizar ciclos y Banco de Funciones y Metodos
*/
import javax.swing.JOptionPane;
public class CicloWhile
{
    public static void main(String args[])
    {
        //Variables
        int numero=0;
        int suma=0;
        String cadena="";
        
        //Ciclo While
        int i=0;//Donde comienzo
        while(i<3)//Hasta donde voy a llegar
        {
            numero=BancoFM.pedirNumero("Ingrese el Numero");
            suma=suma+numero;
            cadena=cadena+" "+numero;
            i++;//Como voy a avanzar(Contador)
        }
        
        String salida="La suma de todos los numeros es: "+suma;
        BancoFM.mostrar(salida);
        salida="Los Numeros Ingresados fueron: "+cadena;
        BancoFM.mostrar(salida);
    }
}