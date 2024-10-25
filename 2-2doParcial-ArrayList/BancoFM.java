import javax.swing.JOptionPane;
import java.util.ArrayList;
public class BancoFM
{
    public static void reemplazarValores(int a[],int reem, int nuevo)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==reem)
            a[i]=nuevo;
        }
    }
    public static void reemplazarMenoresA(int a[], int may, int nuevo)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<may)
            a[i]=nuevo;
        }
    }
     public static void reemplazarMayoresA(int a[], int may, int nuevo)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>may)
            a[i]=nuevo;
        }
    }
    public static void sumarMayoresA(int a[], int ma)
    {
        int suma=0;
        int i=0;
        
        while(i<a.length)
        {
            if(a[i]>ma)
            suma=suma+a[i];
            i++;
        }
        mostrar("La sumatoria de todos los numeros mayores a "+ma+" es: "+suma);
    }
    public static void duplicar(int a[])
    {
        String cadena="";
        int i=0;
        while(i<a.length)
        {
            cadena=cadena+" "+a[i];
            i++;
        }
        i=0;
          while(i<a.length)
        {
            cadena=cadena+" "+a[i];
            i++;
        }
        mostrar(cadena);
    }
    //Funcion que retorna el promedio del arreglo
    public static double promedio(int a[])
    {
        return (double)suma(a)/a.length;
    }
    //Funcion que pide una posicion y la retorna ya validada
    public static int pedirPosicion(int a[])
    {
        int p=0;
        
        do
        {
            p=pedirNumero("Ingrese una Posicion del Arreglo");
        }while(p<=0||p>a.length);
        return p;
    }
    public static int pedirPosicionAL(ArrayList l)
    {
        int p=0;
        
        do
        {
            p=pedirNumero("Ingrese una Posicion del ArrayList que sea 1 a"+l.size());
            if(p<=0||p>l.size())BancoFM.mostrar("Error la posicion "+p+" NO Existe debe de ser de 1 a "+l.size());
        }while(p<=0||p>l.size());
        return p;
    }
    //Metodo que reemplaza dos valores de posiciones en el arreglo
    public static void reemplazar(int a[], int po, int pd)
    {
        int valor_dest=a[pd-1];
        int valor_origen=a[po-1];
        a[pd-1]=valor_origen;
        a[po-1]=valor_dest;
    }
    //Funcion que retorna la suma de todos los elementos del arreglo
    public static int suma(int a[])
    {
        int suma=0;
        int i=0;
        //1,2,3,4,5
        //suma=15
        while(i<a.length)
        {
            //if(a[i]<10)
            suma=suma+a[i];
            i++;
        }
        return suma;
    }
    //Funcion qure recibe un arreglo y un valor y devuelve cuantas veces esta en el arreglo
    public static int contar(int a[], int v)
    {
        int c=0;
        int i=0;
        while(i<a.length)
        {
            if(v==a[i])c=c+1;//c=c+1;
            i++;
        }
        return c;
    }
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