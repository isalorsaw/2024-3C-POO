import javax.swing.JOptionPane;
public class TestFigura2
{
    //Variables Globales
    static Figura f[]=new Figura[4];
    //ArrayList = Arreglos
    
    public static void main(String args[])
    {
        inicializarFiguras();
        verFiguras();
    }
    public static void verFiguras()
    {
        String cadena="Informacion de las Figuras\n";
        for(int i=0;i<f.length;i++)
        {
            cadena+=f[i].toString()+"\n=======================\n";
        }
        BancoFM.mostrar(cadena);
    }
    public static void inicializarFiguras()
    {
        for(int i=0;i<f.length;i++)
        {
            int pos=i+1;
            int opcion=BancoFM.pedirNumero("Que figura desea crear en Posicion "+pos+
            "\n1.Triangulo.2.Cuadrado.3.Circulo.4.Rectangulo");
            
            if(opcion==1)//Triangulo
            {
                int base=BancoFM.pedirNumero("Ingrese una Base para el Triangulo");
                int altura=BancoFM.pedirNumero("Ingrese una Altura para el Triangulo");
                String nombre=JOptionPane.showInputDialog("Que nombre le van a poner");
                Triangulo temp=new Triangulo(0,0,base,altura,nombre);
                f[i]=temp;
            }
            else if(opcion==2)//Cuadrado
            {
                Cuadrado temp=new Cuadrado();
                f[i]=temp;
            }
            else if(opcion==3)//circulo
            {
                Circulo cir=new Circulo();
                f[i]=cir;
            }
            else if(opcion==4)//Rectangulo
            {
                Rectangulo rec=new Rectangulo();
                f[i]=rec;
            }
        }
    }
}