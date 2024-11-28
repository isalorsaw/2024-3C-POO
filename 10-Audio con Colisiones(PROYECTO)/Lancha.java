import java.awt.Graphics;
import java.awt.Rectangle;
public class Lancha extends Coordenada
{
    boolean visible;
    int velocidad;
    char dir;
    String nombrei="lancha";
    int limitex;
    public Lancha(int x, int y,int velocidad, int diralea, int limitex)//Diralea es que direccion va a llevar la lancha
    {
        super(x,y);
        dir=(diralea==1)?'i':'d';//Izquierda o Derecha
        this.velocidad=velocidad;
        this.limitex=limitex;
        visible=true;
        cambiarImagen();
    }
    public void cambiarImagen()//Cambia la imagen de acuerdo a la direccion
    {
        String rutai="imagenes/"+nombrei+"_"+dir+".png";
        System.out.println(ruta);
        setRuta(rutai);
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
    public Rectangle getRectangle()
    {
        return rec;
    }
    public boolean choque(Rectangle otro)//Recibiendo otro rectangulo de un objeto
    {
        if(rec.intersects(otro))return true;
        else return false;
    }
    public void mover()
    {
        if(dir=='i')x=x-velocidad;//left=izq
        else if(dir=='d')x=x+velocidad;//right=derecha
        
        //Muy Importante redefinir el rectangle
        super.setRectangle();
        
        if(x>limitex)//Regresa a la Izq cuando pega a la derecha
        {
            x=x-20;
            dir='i';
            cambiarImagen();
        }
        if(x<0)//Regresa a la derecha cuando pega a la izq
        {
            x+=20;
            dir='d';
            cambiarImagen();
        }
    }
}