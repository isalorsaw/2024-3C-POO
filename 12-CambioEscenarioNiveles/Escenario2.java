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
//Libreria que usaremos para cambio de niveles
import javax.swing.JFrame;
public class Escenario2 extends JPanel implements KeyListener,ActionListener,MouseListener//Implementar los eventos de tecla
{
    Fondo f;
    Nave n;
    //Piedra pi;
    //Variable para el Timer-Mov en Automatico
    Timer t;
    int contador=0;
    int segundos=100;
    ArrayList ba=new ArrayList<Bala>();
    ArrayList las=new ArrayList<Lancha>();
    JFrame principal;
    public Escenario2(JFrame pral)
    {
        principal=pral;
        f=new Fondo(0,0,"imagenes/fondo2.png");
        inicializarLanchas();
        inicializarNave();
        
        //Inclusion de Timer para Mov en Automatico
        inicializarTimer();
        
        this.setBackground(Color.WHITE);//Color de Fondo
        this.setFocusable(true);//Vuelve Prioridad el Panel en el JFrame
        this.setVisible(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.setSize(f.ancho,f.alto);
    }
    public void inicializarNave()
    {
        int x=BancoFM.generaAleatorio(10,900);
        int y=30;
        n=new Nave(x,y,"imagenes/nave2.png",5,f.ancho);
    }
    public void inicializarTimer()
    {
        t=new Timer(segundos,null);//5 milisegundos
        t.addActionListener(this);//Agregando el evento de accion a timer
        t.start();//Iniciar el timer
    }
    public void inicializarLanchas()
    {
        int i=0;
        while(i<10)
        {
            int x=BancoFM.generaAleatorio(10,900);
            int y=BancoFM.generaAleatorio(400,500);
            int alea=BancoFM.generaAleatorio(1,2);
            Lancha ll=new Lancha(x,y,5,alea,f.ancho);
            las.add(ll);
            i++;
        }
    }
    public void moverLanchas()
    {
        int i=0;
        while(i<las.size())
        {
            Lancha tmp=(Lancha)las.get(i);
            tmp.mover();
            i++;
        }
    }
    public void dibujarLanchas(Graphics g)
    {
        int i=0;
        while(i<las.size())
        {
            Lancha tmp=(Lancha)las.get(i);
            tmp.dibuja(g);
            i++;
        }
    }
    public int contarLanchasVivas()
    {
        int c=0;
        int i=0;
        while(i<las.size())
        {
            Lancha tmp=(Lancha)las.get(i);
            if(tmp.visible==true)c++;
            i++;
        }
        return c;
    }
    public void keyPressed(KeyEvent evento)
    {
        int code=evento.getKeyCode();
        //BancoFM.mostrar("Codigo "+code);
        
        if(code==32)agregarBala();
        
        char dir=' ';
        if(code==39)n.mover('d');
        else if(code==37)n.mover('i');
        repaint();
        
        /*if(code==40)//Down-Abajo
        else if(code==38)//up-Arriba
        else if(code==39)//right-derecha
        else if(code==37)//left-izq*/
    }//Al presionar una tecla
    public void agregarBala()
    {
        Bala b=new Bala(n.x,n.y,"imagenes/laser.png",1);
        ba.add(b);
    }
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
    public void mouseExited(MouseEvent evt){}
    public void mouseEntered(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt)
    {
        /*int coorx=evt.getX();
        int coory=evt.getY();
        int ale=BancoFM.generaAleatorio(1,2);
        Bala tmp=new Bala(coorx,coory,"imagenes/laser.png",ale);
        //System.out.println("X"+coorx+"Y"+coory);
        ba.add(tmp);
        System.out.println("Direccion "+tmp.direccion);
        //repaint();*/
    }
    public void mousePressed(MouseEvent evt){}
    public void mouseReleased(MouseEvent evt){}
    public void actionPerformed(ActionEvent evt)//Metodo para tratar los eventos de accion
    {
        if(evt.getSource()==t)
        {
            moverLanchas();
            moverBalas();
            detectarChoqueBL();
            repaint();
        }
    }
    //Manana
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
    public void detectarChoqueBL()//DetectarChoque Bala Lancha
    {
        int i=0;
        while(i<ba.size())
        {
            Bala tmp=(Bala)ba.get(i);
            //tmp.mover();
            int j=0;
            while(j<las.size())
            {
                Lancha lan=(Lancha)las.get(j);
                if(lan.choque(tmp.rec))lan.visible=false;
                j++;
            }
            
            i++;
        }
        if(contarLanchasVivas()<=7)
        {
            t.stop();
            BancoFM.mostrar("Salto de Nivel");
            principal.dispose();//Dispose cerrar el formulario
            new Pral(1);
        }
    }

    /*public void verifChoque()
    {
        boolean chq=l.choque(pi.rec);//Llamando a choque para verif si hay una colision con lancha y piedra
        System.out.println("CHOQUE "+chq);
        
        if(chq==true)
        {
             l.frenar();
             inicializarLancha();
             segundos-=50;
             inicializarTimer(segundos);
        }
    }*/
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
    /*public void moverBalas()
    {
        int i=0;
        while(i<ba.size())
        {
            Bala tmp=(Bala)ba.get(i);
            tmp.mover();
            i++;
        }
    }*/
    public void paint(Graphics g)
    {
        super.paint(g);//Linea obligatoria para dibujar en el panel
        
        //f.dibuja(g);
        dibujarLanchas(g);
        dibujarBalas(g);
        n.dibuja(g);
        //pi.dibuja(g);
        
        g.drawString("Lanchas Activas "+contarLanchasVivas()+"/"+las.size(),10,f.alto+50);
    }
}
