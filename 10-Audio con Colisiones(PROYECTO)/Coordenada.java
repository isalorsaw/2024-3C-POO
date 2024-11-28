import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
//Libreria para Rectangulo Intersecto
import java.awt.Rectangle;
public class Coordenada
{
    int x;
    int y;
    Image imagen;
    ImageIcon icono;
    String ruta;
    int ancho;
    int alto;
    Rectangle rec;
    public Coordenada(int x, int y, String ruta)
    {
        this.x=x;
        this.y=y;
        setRuta(ruta);
    }
    public Coordenada(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setRuta(String ruta)
    {
        this.ruta=ruta;
        this.icono=new ImageIcon(getClass().getResource(ruta));//Dimensiones
        this.imagen=icono.getImage();//Dibujarla-Graphics
        this.ancho=icono.getIconWidth();//Asignar la anchura de la imagen
        this.alto=icono.getIconHeight();//Asignar la altura de la imagen
        setRectangle();
    }
    public void setRectangle()
    {
        rec=new Rectangle(x,y,ancho,alto);
    }
}