import java.awt.Graphics;
import java.awt.Rectangle;
public class Piedra extends Coordenada
{
    public Piedra(int x, int y, String ruta)
    {
        super(x,y,ruta);
    }
    public void dibuja(Graphics g)
    {
        if(cuadro)g.drawRect(rec.x,rec.y,rec.width,rec.height);g.drawRect(rec.x,rec.y,rec.width,rec.height);
        g.drawImage(imagen,x,y,null);
    }
    public Rectangle getRectangle()
    {
        return rec;
    }
    /*public void cambiar()
    {
        
    }*/
}
