import java.awt.Graphics;
public class Lancha extends Coordenada
{
    int velocidad;
    public Lancha(int x, int y, String ruta)
    {
        super(x,y,ruta);
        velocidad=5;
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public boolean choque()
    {
        return false;
    }
    public void mover(char dir)
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
    }
}
