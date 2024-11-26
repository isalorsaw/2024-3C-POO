import java.awt.Graphics;
import java.awt.Rectangle;
public class Lancha extends Coordenada
{
    boolean visible;
    boolean frenar;
    int velocidad;
    public Lancha(int x, int y, String ruta, int lx, int ly)
    {
        super(x,y,ruta);
        velocidad=10;
        visible=true;
        frenar=false;
    }
    public Lancha(int x, int y, String ruta, int velocidad)
    {
        super(x,y,ruta);
        this.velocidad=velocidad;
        visible=true;
        frenar=false;
    }
    public void frenar()
    {
        visible=false;
    }
    public void dibuja(Graphics g)
    {
        if(visible==true)
        {
            if(cuadro)g.drawRect(rec.x,rec.y,rec.width,rec.height);
            g.drawImage(imagen,x,y,null);
        }
    }
    public Rectangle getRectangle()
    {
        return rec;
    }
    public boolean choque(Rectangle otro)//Recibiendo otro rectangulo de un objeto
    {
        if(rec.intersects(otro))return true;
        else return false;
    }
    public boolean mover(char dir, int limitex)
    {
        if(frenar==false)
        {
            if(dir=='u')//up=arriba
            {
                //y--;
            }
            else if(dir=='d')//down=abajo
            {
                
            }
            else if(dir=='l')//left=izq
            {
                //x--;
                x=x-velocidad;
            }
            else if(dir=='r')//right=derecha
            {
                //x++;
                x=x+velocidad;
            }
            
            //Muy Importante redefinir el rectangle
            super.setRectangle();
            
            //BancoFM.mostrar(x+" LimX "+l.x);
            //if(x>l.x)return true;
            //if(y>l.y)return true;
            //else 
            if(x>limitex)
            {
                //x=0;
                x=x-10;
                return true;
            }
            else if(x<0)
            {
                //x=limitex;
                x=10;
                return true;
            }
        }
        return false;
    }
}
