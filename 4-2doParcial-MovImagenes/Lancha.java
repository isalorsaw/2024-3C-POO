import java.awt.Graphics;
public class Lancha extends Coordenada
{
    public Lancha(int x, int y, String ruta)
    {
        super(x,y,ruta);
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public boolean choque()
    {
        return false;
    }
    public void mover(char l)
    {
        if(l=='u')//up=arriba
        {
            
        }
        else if(l=='d')//down=abajo
        {
            
        }
        else if(l=='l')//left=izq
        {
            
        }
        else if(l=='r')//right=derecha
        {
            
        }
    }
}
