import javax.swing.JOptionPane;
public class BancoFM
{
    public static int pedirNumero(String mensaje)//Funcion
    {
        int numero=0;
        String entrada=JOptionPane.showInputDialog(mensaje);
        numero=Integer.parseInt(entrada);
        return numero;
    }
    public static double pedirDecimal(String mensaje)//Funcion
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
}