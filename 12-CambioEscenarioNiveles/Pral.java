import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
public class Pral extends JFrame
{
    //Variables
    Escenario e;
    Escenario2 e2;
    Escenario3 e3;
    JPanel panel;
    public Pral(int nivel)
    {
        super("Titulo del Formulario");//Titulo de la ventana del formulario
        
        //Haciendo la instancia de Escenario
        //if(nivel==1)
        if(nivel==1)
        {
             e=new Escenario(this);
             panel=e;
        }
        else if(nivel==2)
        {
             e2=new Escenario2(this);
             panel=e2;
        }
        else if(nivel==3)
        {
             e3=new Escenario3(this);
             panel=e3;
        }
        
        add(panel);
        //else(nivel==2)
        
        //this.setSize(800,600);//Tamanio del Formulario
        this.setSize(panel.getWidth(),panel.getHeight()+100);
        //this.setResizable(false);
        this.setVisible(true);//Mostrar el Formulario
        this.setLocationRelativeTo(null);//Centrar el Formulario con la pantalla
    }
    public static void main(String args[])
    {
        int seleccion = 1+JOptionPane.showOptionDialog(null,"Que nivel desea", "Titulo Arriba",JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,new Object[] { "1", "2","3","4"},"1");
        
        //BancoFM.mostrar(seleccion+"");

        new Pral(seleccion);
    }
}