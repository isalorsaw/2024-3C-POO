import java.awt.Graphics;
import java.awt.Rectangle;
public class Bala extends Coordenada
{
    char direccion;
    int velocidad;
    boolean visible;
    public Bala(int x, int y, String ruta, int dir)
    {
        super(x,y,ruta);
        velocidad=10;
        direccion=(dir==1?'d':'u');//abajo-arriba
        visible=true;
    }
    public void frenar()
    {
        visible=false;
    }
    public void dibuja(Graphics g)
    {
        if(visible==true)
        {
            g.drawRect(rec.x,rec.y,rec.width,rec.height);
            g.drawImage(imagen,x,y,null);
        }
    }
    public void mover()
    {
        if(direccion=='d')y+=velocidad;
        else y-=velocidad;
        super.setRectangle();
    }
    /*public void cambiar()
    {
        
    }*/
}
