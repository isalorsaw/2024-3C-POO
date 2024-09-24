public class Examen
{
    public static void main(String args[])
    {
        String cadena="Isaias";
        BancoFM.mostrar(cadena);//Invocacion a un Metodo
        int numero1=BancoFM.pedirNumero("Ingrese el Primer Numero Entero");//Invocando una Funcion
        int numero2=BancoFM.pedirNumero("Ingrese el Segundo Numero Entero");
        int suma=numero1+numero2;
        String salida="Al sumar "+numero1+" con "+numero2+" me da "+suma;
        BancoFM.mostrar(salida);
        //String s=BancoFM.pedirCadena("Ingrese un Nombre");
        //JOptionPane.showMessageDialog(null,"Hola");
    }
}