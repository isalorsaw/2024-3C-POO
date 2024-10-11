import javax.swing.JOptionPane;
public class Concat
{
    public static void main(String args[])
    {
        String nombre=JOptionPane.showInputDialog("Ingrese el Nombre de la Persona");
        //String nombre=BancoFM.pedirNombre("Ingrese el Nombre de la Persona");
        int edad=BancoFM.pedirNumero("Ingrese la Edad de la Persona ");
        String salida="La persona "+nombre+" tiene "+edad+" anios";
        BancoFM.mostrar(salida);
    }
}