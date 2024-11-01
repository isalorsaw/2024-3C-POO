public class Test2
{
    public static void main(String args[])
    {
        String titulo="Como Prog en Java";
        String autor="Deitel";
        int ejemplares=10;
        int prestados=0;
        
        Libro l=new Libro(titulo,autor,ejemplares,prestados);
        BancoFM.mostrar(l.toString());
        
        //Prestar un Libro
        l.prestamo();
        
        
        //Ver Libro
        BancoFM.mostrar(l.toString());
        
        
        //Prestar 2 Libros
        int presta=BancoFM.pedirNumero("Prestar");
        
        for(int i=0;i<presta;i++)
        {
            l.prestamo();
        }
        
        //Ver Libro
        BancoFM.mostrar(l.toString());
        
        l.agregarEjemplares();
        
        BancoFM.mostrar(l.toString());
        
        
        presta=BancoFM.pedirNumero("Prestar");
        
        for(int i=0;i<presta;i++)
        {
            l.prestamo();
        }
        
        BancoFM.mostrar(l.toString());
    }
}