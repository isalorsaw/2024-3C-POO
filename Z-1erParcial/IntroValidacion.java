import javax.swing.JOptionPane;
public class IntroValidacion
{
    public static void main(String args[])
    {
        String cadena="Isaias";
        mostrar(cadena);//Invocacion a un Metodo
        
        //mostrar(cadena,"Titulo de Arriba",0);
        //Enteros 0=Icono Rojo 1=Icono Azul 2=Icono Amarillo
        
        int numero1=pedirNumero("Ingrese el Primer Numero Entero");//Invocando una Funcion
        int numero2=pedirNumero("Ingrese el Segundo Numero Entero");
        int suma=numero1+numero2;
        String salida="Al sumar "+numero1+" con "+numero2+" me da "+suma;
        mostrar(salida);
        
        //double n1=pedirDecimal("Ingrese el Primer Numero Decimal");//Invocando una Funcion
        //double n2=pedirDecimal("Ingrese el Segundo Numero Decimal");
        
    }
    public static int pedirNumero(String mensaje)
    {
        int numero=0;
        String entrada=JOptionPane.showInputDialog(mensaje);
        numero=Integer.parseInt(entrada);
        return numero;
    }
    public static double pedirDecimal(String mensaje)
    {
        double numero=0;
        String entrada=JOptionPane.showInputDialog(mensaje);
        numero=Double.parseDouble(entrada);
        return numero;
    }
    public static void mostrar(String cadena)//Metodo
    {
        JOptionPane.showMessageDialog(null,cadena);
    }
    public static void mostrar(String mensaje, String ventana, int icono)//Metodo
    {
        JOptionPane.showMessageDialog(null,mensaje,ventana,icono);
    }
    //Metodo
    
    
    //Funcion
}