import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
public class Coordenada
{
    int x;
    int y;
    Image imagen;
    ImageIcon icono;
    String ruta;
    int ancho;
    int alto;
    public Coordenada(int x, int y, String ruta)
    {
        this.x=x;
        this.y=y;
        this.icono=new ImageIcon(getClass().getResource(ruta));//Dimensiones
        this.imagen=icono.getImage();//Dibujarla-Graphics
        this.ruta=ruta;
        this.ancho=icono.getIconWidth();//Asignar la anchura de la imagen
        this.alto=icono.getIconHeight();//Asignar la altura de la imagen
    }
}