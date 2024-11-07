import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
//Librerias para Eventos
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class Escenario extends JPanel implements KeyListener//Implementar los eventos de tecla
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
        this.addKeyListener(this);
        this.setSize(f.ancho,f.alto);
    }
    public void keyPressed(KeyEvent evento)
    {
        int code=evento.getKeyCode();
        System.out.println("Codigo de Tecla "+code);
        
        char dir=' ';
        if(code==39)l.mover('r');
        
        if(code==83)l.velocidad+=5;
        
        repaint();
        
        //System.out.println("Display "+l.x+" "+l.y);
        
        /*if(code==40)//Down-Abajo
        else if(code==38)//up-Arriba
        else if(code==39)//right-derecha
        else if(code==37)//left-izq*/
        
        
        
    }//Al presionar una tecla
    public void keyReleased(KeyEvent evento){}//Al soltar una tecla
    public void keyTyped(KeyEvent evento){}//Al presionar una tecla
    
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
        l= new Lancha(x,y,"imagenes/yate.png");
        //l= new Lancha(950,500,"imagenes/lancha.png");
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