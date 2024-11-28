import java.awt.Graphics;
import java.awt.Rectangle;
public class Nave extends Coordenada
{
    boolean visible;
    int velocidad;
    int limitex;
    public Nave(int x, int y, String ruta, int velocidad, int limitex)
    {
        super(x,y,ruta);
        this.velocidad=velocidad;
        visible=true;
        this.limitex=limitex;
    }
    public void dibuja(Graphics g)
    {
        if(visible==true)
        {
            g.drawRect(rec.x,rec.y,rec.width,rec.height);
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
    public void mover(char dir)
    {
        int xx=x;
        if(dir=='i')xx-=10;
        if(dir=='d')xx+=10;
        
        if(xx>0&&(xx+ancho)<limitex)
        {
            if(dir=='i')x=x-velocidad;//left=izq
            else if(dir=='d')x=x+velocidad;//right=derecha
        }
        
        //Muy Importante redefinir el rectangle
        super.setRectangle();
    }
}
