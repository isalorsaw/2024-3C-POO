import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class Escenario extends JPanel
{
    Cuadrado c;
    ArrayList<Figura> lista=new ArrayList<Figura>();
    public Escenario()
    {
        inicializarFiguras();
        inicializarCuadrado();
        this.setBackground(Color.WHITE);//Color de Fondo
        this.setFocusable(true);//Vuelve Prioridad el Panel en el JFrame
        this.setVisible(true);
    }
    public void inicializarCuadrado()
    {
        int x=BancoFM.generaAleatorio(10,700);
        int y=BancoFM.generaAleatorio(10,500);
        c=new Cuadrado(x,y,50,"Cuadrado1");
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea obligatoria para dibujar en el panel
        
        g.drawString("Elaborado por: Ing Isaias Salinas",10,500);
        c.dibuja(g);
        //g.drawString(c.toString(),c.getX(),c.getY());
        dibujarFiguras(g);
    }
    public void inicializarFiguras()
    {
        for(int i=0;i<10;i++)
        {
            int x=BancoFM.generaAleatorio(10,700);
            int y=BancoFM.generaAleatorio(10,500);
            int fig=1;//BancoFM.generaAleatorio(1,4);
            if(fig==1)lista.add(new Cuadrado(x,y,40,"Figura "+(i+1)));
            //fig==2
            //fig==3
            //fig==4
        }
    }
    public void dibujarFiguras(Graphics g)
    {
        int i=0;
        while(i<lista.size())
        {
            Figura f=lista.get(i);
            g.drawString(f.toString(),f.getX(),f.getY());
            f.dibuja(g);
            i++;
        }
    }
}