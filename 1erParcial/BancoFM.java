import javax.swing.JOptionPane;
public class BancoFM
{
    //Metodo que rellenar un arreglo con un valor
    public static void llenarArreglo(int a[], int valor)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=valor;
        }
    }
    //Metodo que llena un arreglo pidiendo los datos al usuario
    public static void llenarArreglo(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=pedirNumero("Ingrese un Numero");
        }
    }
    //Metodo llenar un arreglo de forma aleatoria
    public static void llenarAleatorio(int a[], int desde, int hasta)
    {
         for(int i=0;i<a.length;i++)
        {
            a[i]=generaAleatorio(desde,hasta);
        }
    }
    public static int generaAleatorio(int d, int h)
    {
        int alea=((int)(Math.random()*(h-d+1)+d));
        return alea;
    }
    //Metodo que imprimir los elementos de un arreglo.
    public static void imprimir(int a[])
    {
        String cadena="";
        int i=0;
        while(i<a.length)
        {
            cadena=cadena+" "+a[i];
            i++;
        }
        mostrar(cadena);
    }
    //Funcion que retorna una cadena con todos los elementos del arreglo
    public static String imprimirF(int a[])
    {
        String cadena="";
        int i=0;
        while(i<a.length)
        {
            cadena+=a[i]+" ";
            i++;
        }
        
        return cadena;
    }
    //Funcion que retorna la suma de todos los elementos del arreglo
    public static int suma(int a[])
    {
        int suma=0;
        int i=0;
        while(i<a.length)
        {
            suma=suma+a[i];
            i++;
        }
        return suma;
    }
    public static int pedirNumero(String mensaje)//Funcion
    {
        int numero=0;
        boolean seguir=true;//Puede ser tambien false
        
        do
        {
            try
            {
                String entrada=JOptionPane.showInputDialog(mensaje);//6
                numero=Integer.parseInt(entrada);
                seguir=false;
            }
            catch(Exception e)
            {
                mostrar("Error al ingresar un entero ");
                //System.out.println(e);
            }
        }while(seguir==true);
        return numero;
    }
    public static double pedirDecimal(String mensaje)//Funcion
    {
        double numero=0;
        boolean seguir=true;//Puede ser tambien false
        
        do
        {
            try
            {
                String entrada=JOptionPane.showInputDialog(mensaje);//6
                numero=Double.parseDouble(entrada);
                seguir=false;
            }
            catch(Exception e)
            {
                mostrar("Error al ingresar un entero ");
                //System.out.println(e);
            }
        }while(seguir==true);
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
}