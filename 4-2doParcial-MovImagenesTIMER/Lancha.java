import java.awt.Graphics;
public class Lancha extends Coordenada
{
    int velocidad;
    Limite l;
    public Lancha(int x, int y, String ruta, int lx, int ly)
    {
        super(x,y,ruta);
        velocidad=10;
        l=new Limite(lx,ly);
    }
    public Lancha(int x, int y, String ruta)
    {
        super(x,y,ruta);
        velocidad=1;
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public boolean choque()
    {
        return false;
    }
    public boolean mover(char dir, int limitex)
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
        //BancoFM.mostrar(x+" LimX "+l.x);
        //if(x>l.x)return true;
        //if(y>l.y)return true;
        //else 
        if(x>limitex)
        {
            x=0;
            return true;
        }
        return false;
    }
}
