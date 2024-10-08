import javax.swing.JOptionPane;
public class EjemploTC
{
    public static void main(String args[])
    {
        String entrada="";
        int numero=0;
        try
        {
            entrada=JOptionPane.showInputDialog("Ingrese un Entero");
            numero=Integer.parseInt(entrada);
            JOptionPane.showMessageDialog(null,"Ingrese Correctamente un Entero");
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Hubo un error "+e);
            JOptionPane.showMessageDialog(null,"Hubo un error <"+entrada+"> no es un entero");
        }
    }
}