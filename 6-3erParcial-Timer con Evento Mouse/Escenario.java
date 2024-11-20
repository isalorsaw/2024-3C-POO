import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
//Librerias para Eventos KeyListener (Teclado)
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//Librerias para Eventos del Mouse
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
//Libreria para Eventos de Accion. (Botones, Timer)
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//Libreria para usar el Timer
import javax.swing.Timer;
public class Escenario extends JPanel implements KeyListener,ActionListener,MouseListener//Implementar los eventos de tecla
{
    Fondo f;
    Lancha l;
    //Variable para el Timer-Mov en Automatico
    Timer t;
    int contador=0;
    int segundos=1;
    ArrayList ba=new ArrayList<Bala>();
    public Escenario()
    {
        f=new Fondo(0,0,"imagenes/fondo2.png");
        inicializarLancha();
        //inicializarBalas();
        //BancoFM.imprimirAL(ls);
        /*inicializarCuadrado();*/
        
        //Inclusion de Timer para Mov en Automatico
        t=new Timer(segundos*1000,null);//5 milisegundos
        t.addActionListener(this);//Agregando el evento de accion a timer
        t.start();//Iniciar el timer
        
        
        this.setBackground(Color.WHITE);//Color de Fondo
        this.setFocusable(true);//Vuelve Prioridad el Panel en el JFrame
        this.setVisible(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.setSize(f.ancho,f.alto);
    }
    public void mouseExited(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt)
    {
        int coorx=evt.getX();
        int coory=evt.getY();
        int ale=BancoFM.generaAleatorio(1,2);
        Bala tmp=new Bala(coorx,coory,"imagenes/laser.png",ale);
        //System.out.println("X"+coorx+"Y"+coory);
        ba.add(tmp);
        System.out.println("Direccion "+tmp.direccion);
        //repaint();
    }
    public void mousePressed(MouseEvent evt){}
    public void mouseReleased(MouseEvent evt){}
    public void actionPerformed(ActionEvent evt)//Metodo para tratar los eventos de accion
    {
        if(evt.getSource()==t)
        {
            contador++;
            //System.out.println("Evento Tiempo "+contador);
            boolean b=l.mover('r',f.ancho);
            
            cambioDireccion(b,'r');//Pendiente peticion Oscar
            
            moverBalas();
            
            /*if(b==true)
            {
                t.stop();
                BancoFM.mostrar("Interrupcion");
            }*/
            
            repaint();
            /*if(contador>3)
            {
                t.stop();
                BancoFM.mostrar("Interrupcion");
            }*/
        }
    }
    //Manana
    public void cambioDireccion(boolean b, char dir)
    {
        
    }
    public void keyPressed(KeyEvent evento)
    {
        int code=evento.getKeyCode();
        
        //System.out.println("Codigo de Tecla "+code);
        
        char dir=' ';
        if(code==39)l.mover('r',f.ancho);
        
        //if(code==83)l.velocidad+=5;
        
        repaint();/**/
        
        //System.out.println("Display "+l.x+" "+l.y);
        
        /*if(code==40)//Down-Abajo
        else if(code==38)//up-Arriba
        else if(code==39)//right-derecha
        else if(code==37)//left-izq*/
        
        
        
    }//Al presionar una tecla
    public void keyReleased(KeyEvent evento){}//Al soltar una tecla
    public void keyTyped(KeyEvent evento){}//Al presionar una tecla
    
    /*public void inicializarBalas()
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
    }*/
    public void dibujarBalas(Graphics g)
    {
        int i=0;
        while(i<ba.size())
        {
            Bala tmp=(Bala)ba.get(i);
            tmp.dibuja(g);
            i++;
        }
    }
    public void moverBalas()
    {
        int i=0;
        while(i<ba.size())
        {
            Bala tmp=(Bala)ba.get(i);
            tmp.mover();
            i++;
        }
    }
    public void inicializarLancha()
    {
        int x=BancoFM.generaAleatorio(10,900);
        int y=BancoFM.generaAleatorio(400,460);
        l= new Lancha(x,y,"imagenes/yate.png",5);
        //l= new Lancha(950,500,"imagenes/lancha.png");
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea obligatoria para dibujar en el panel
        
        f.dibuja(g);
        l.dibuja(g);
        dibujarBalas(g);
        //g.drawString("Display "+l.x+" "+l.y,10,f.alto+50);
    }
}
