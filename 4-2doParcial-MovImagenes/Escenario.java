import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
public class Escenario extends JPanel
{
    Fondo f;
    Lancha l;
    ArrayList ls=new ArrayList<Lancha>();
    public Escenario()
    {
        f=new Fondo(0,0,"imagenes/fondo2.png");
        inicializarLancha();
        inicializarLanchas();
        //BancoFM.imprimirAL(ls);
        /*inicializarCuadrado();*/
        this.setBackground(Color.WHITE);//Color de Fondo
        this.setFocusable(true);//Vuelve Prioridad el Panel en el JFrame
        this.setVisible(true);
        this.setSize(f.ancho,f.alto);
    }
    public void inicializarLanchas()
    {
        int i=0;
        while(i<10)
        {
            int x=BancoFM.generaAleatorio(10,900);
            int y=BancoFM.generaAleatorio(400,550);
            Lancha ll=new Lancha(x,y,"imagenes/lancha.png");
            ls.add(ll);
            i++;
        }
    }
    public void dibujarLanchas(Graphics g)
    {
        int i=0;
        while(i<ls.size())
        {
            Lancha ll=(Lancha)ls.get(i);
            ll.dibuja(g);
            i++;
        }
    }
    public void inicializarLancha()
    {
        int x=BancoFM.generaAleatorio(10,900);
        int y=BancoFM.generaAleatorio(400,460);
        l= new Lancha(x,y,"imagenes/lancha.png");
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea obligatoria para dibujar en el panel
        
        f.dibuja(g);
        l.dibuja(g);
        dibujarLanchas(g);
        g.drawString("Display "+l.x+" "+l.y,10,f.alto+50);
    }
}