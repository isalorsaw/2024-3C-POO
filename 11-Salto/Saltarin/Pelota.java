import java.awt.Image;
import java.awt.Graphics;
public class Pelota extends Coordenada
{
    boolean saltando;
    int velocidadY;
    int gravedad;
    public Pelota(int x, int y, String ruta)
    {
        super(x,y,ruta);
        saltando=false;
        velocidadY=0;
        gravedad=1;
    }
    public void dibuja(Graphics g)
    {
        g.drawImage(imagen,x,y,null);
    }
    public void actualizar() 
    {
        if (saltando) 
        {
            y += velocidadY; // Actualizar posición vertical
            velocidadY += gravedad; //Aplicar gravedad

            // Detener el salto al tocar el suelo
            if (y >= 300) 
            {
                y = 300;
                saltando = false;
                velocidadY = 0;
            }
        }
    }
    public void saltar() 
    {
        saltando = true;
        velocidadY = -15; // Velocidad inicial hacia arriba
    }
}