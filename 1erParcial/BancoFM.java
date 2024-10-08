import javax.swing.JOptionPane;
public class BancoFM
{
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
                                System.out.println(e);
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
                                System.out.println(e);
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