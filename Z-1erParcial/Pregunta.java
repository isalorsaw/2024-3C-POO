import javax.swing.JOptionPane;
public class Pregunta
{
    public static void main(String args[])
    {
        //Variables
        int numero=0;
        int numero2=0;
        int suma=0;
        
        //Ciclo While
        int i=0;//Donde comienzo
        while(i<3)//Hasta donde voy a llegar
        {
            numero=BancoFM.pedirNumero("Ingrese el Numero");
            suma=suma+numero;
            i++;//Como voy a avanzar(Contador)
        }
    }
}