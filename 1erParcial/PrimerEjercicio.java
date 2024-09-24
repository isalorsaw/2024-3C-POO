//Primer Ejercicio en Java
//Pedir Dos enteros y mostrar la suma de ellos.
//Librerias
import javax.swing.JOptionPane;//Paneles
public class PrimerEjercicio
{
    public static void main(String args[])
    {
        //Inicializacion de Variables
        int numero1=0;
        int numero2=0;
        int suma=0;
        String salida="";//Variable de Cadena inicializar con cadena vacia
        
        //Entradas
        String entrada=JOptionPane.showInputDialog("Ingrese el Primer Numero");
        numero1=Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog("Ingrese el segundo Numero");
        numero2=Integer.parseInt(entrada);
        
        //Proceso de Suma
        suma=numero1+numero2;
        
        //String salida= numero1  +   "+"   + numero2   +   "="   + suma;
        salida="La Suma de "+numero1+" y "+numero2+" es: "+suma;

        //Salida
        //String salida="La Suma de los dos Numeros es: "+suma;
        //String salida=numero1+"+"+numero2+"="+suma;
        JOptionPane.showMessageDialog(null,salida,"Ventana",1);
    }
}