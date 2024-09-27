//Programa que pida un número y diga si este número es mayor o menor que 15.
import javax.swing.JOptionPane;
public class Ejercicio4
{
    public static void main(String args[])
    {
        //Variables
        int numero=0;
        
        numero=BancoFM.pedirNumero("Ingrese un Numero para mostrar si es Mayor o Menor que 15");
        
        if(numero>15)
        {
           BancoFM.mostrar("El Numero "+numero+" es Mayor a 15"); 
        }
        else if(numero==15)
        {
            BancoFM.mostrar("El Numero "+numero+" es Igual a 15");
        }
        else
        {
            BancoFM.mostrar("El Numero "+numero+" es Menor a 15");
        }
    }
}