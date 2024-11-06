import javax.swing.JFrame;
public class Pral extends JFrame
{
    //Variables
    Escenario e;
    public Pral()
    {
        super("Titulo del Formulario");//Titulo de la ventana del formulario
        
        //Haciendo la instancia de Escenario
        //if(nivel==1)
        e=new Escenario();
        add(e);
        
        //else(nivel==2)
        
        //this.setSize(800,600);//Tamanio del Formulario
        this.setSize(e.getWidth()+100,e.getHeight()+100);
        this.setVisible(true);//Mostrar el Formulario
        this.setLocationRelativeTo(null);//Centrar el Formulario con la pantalla
    }
    public static void main(String args[])
    {
        new Pral();
    }
}