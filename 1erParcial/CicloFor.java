/*
Pedir 3 numeros y mostrar la suma de todos ellos. Utilizar ciclos y Banco de Funciones y Metodos
*/
import javax.swing.JOptionPane;
public class CicloFor
{
    public static void main(String args[])
    {
        //Variables
        int numero=0;
        String cadena="";
        int suma=0;
        
        for(int i=0;i<3;i++)
        {
            numero=BancoFM.pedirNumero("Ingrese el Numero");
            suma=suma+numero;
            cadena=cadena+" "+numero;
        }        
        String salida="La suma de todos los numeros es: "+suma;
        BancoFM.mostrar(salida);
        BancoFM.mostrar("Los Numeros Ingresados Fueron: "+cadena);
    }
}