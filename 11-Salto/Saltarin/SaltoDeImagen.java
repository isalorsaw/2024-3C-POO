import javax.swing.*;
import java.awt.*;

public class SaltoDeImagen extends JPanel 
{
    private int x = 100; // Posición inicial en X
    private int y = 300; // Posición inicial en Y
    private int velocidadY = 0; // Velocidad vertical
    private int gravedad = 1; // Gravedad
    private boolean saltando = false; // Estado del salto
    private Image imagen;
    Pelota pel;

    public SaltoDeImagen() 
    {
        pel=new Pelota(100,300,"pelota.png");
        setFocusable(true);
        addKeyListener(new java.awt.event.KeyAdapter() 
        {
            @Override
            public void keyPressed(java.awt.event.KeyEvent e) 
            {
                if (e.getKeyCode() == java.awt.event.KeyEvent.VK_SPACE && !saltando) 
                pel.saltar();
                
            }
        });
        // Bucle de animación
        Timer timer = new Timer(16, e -> 
        {
            pel.actualizar();
            repaint();
        });
        timer.start();
    }
    protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.fillRect(0, 0, getWidth(), getHeight()); // Fondo
        //g.drawImage(imagen, x, y, 50, 50, this); // Dibujar la imagen
        pel.dibuja(g);
    }
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Salto de Imagen");
        SaltoDeImagen panel = new SaltoDeImagen();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}