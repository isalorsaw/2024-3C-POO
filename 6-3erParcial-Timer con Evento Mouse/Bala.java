import java.awt.Graphics;
public class Bala extends Coordenada
{
    char direccion;
    int velocidad;
    public Bala(int x, int y, String ruta, int dir)
    {
        super(x,y,ruta);
        velocidad=5;
        if(dir==1)direccion='l';//left-izq
        else direccion='r';//right-der
        
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public void mover()
    {
        if(direccion=='r')x+=velocidad;
        else x-=velocidad;
    }
    /*public void cambiar()
    {
        
    }*/
}
