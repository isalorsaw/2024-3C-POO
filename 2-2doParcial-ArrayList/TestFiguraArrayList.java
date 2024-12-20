import java.util.ArrayList;
public class TestFiguraArrayList
{
    static ArrayList<Figura> lista=new ArrayList<Figura>();
    //Figura f[]=new Figura[5];
    
    public static void main(String args[])
    {
          String menu="Menu\n1.Crear Triangulo\n2.Crear Cuadrado\n3.Circulo\n4.Rectangulo\n5.Imprimir\n"+
          "6.Eliminar una Posicion\n7.Buscar Figura\n0.Salir";
          int opcion=0;
          
          do
          {
              opcion=BancoFM.pedirNumero(menu);
              switch(opcion)
              {
                  case 1:
                      Triangulo t=new Triangulo();
                      lista.add(t);
                  break;
                  case 2:
                      Cuadrado c=new Cuadrado();
                      lista.add(c);
                  break;
                  case 5:
                      imprimirLista();
                  break;
                  case 6:
                      int pos=BancoFM.pedirPosicionAL(lista);
                      lista.remove(pos-1);
                    break;
                  case 7:
                      String nfig=BancoFM.pedirCadena("Ingrese la Figura que desea buscar");
                      Figura f=buscarArrayList(nfig);
                      if(f==null)BancoFM.mostrar("No se encontro la figura "+nfig);
                      else 
                      {
                          BancoFM.mostrar("La Figura Si Existe");
                          //Triangulo tri=(Triangulo)f;
                          //tri.modificar();
                          f.modificar();
                          
                      }
                      break;
              }
          }while(opcion!=0);
    }
    public static Figura buscarArrayList(String nfig)
    {
        Figura encontrada=null;
        for(int i=0;i<lista.size();i++)
        {
            Figura f=lista.get(i);
            if(f.equals(nfig))encontrada=f;
        }        
        return encontrada;
    }
    public static void imprimirLista()
    {
        //BancoFM.mostrar(lista.toString());
        String salida="Informacion del Array List\n==================\n";
        for(int i=0;i<lista.size();i++)
        {
            salida+=lista.get(i).toString()+"\n==================\n";
        }
        BancoFM.mostrar(salida);
    }
}