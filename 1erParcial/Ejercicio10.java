/*10. Construir un programa que pida números (primero se pedirá 
 por teclado la cantidad de números a 
 introducir). El programa debe informar de cuantos números introducidos son 
 mayores que 0, menores que 0 e iguales a 0.*/
 import javax.swing.JOptionPane;
 public class Ejercicio10
 {
     public static void main(String args[])
     {
         //Variables
         int cant=0;
         int numero=0;
         int contmay=0;
         int contigu=0;
         int contmen=0;
         
         cant=BancoFM.pedirNumero("Cuantos Numeros Vamos a Ingresar");
         
         int i=1;
         while(i<=cant)
         {
             numero=BancoFM.pedirNumero("Ingrese un Numero "+i);
             
             if(numero==0)
             {
                 //contigu=contigu+1;
                 contigu++;
             }
             else if(numero<0)contmen++;
             else contmay++;
             i++;
         }
         String cadena="RESUMEN\nNumeros Igual a 0 fueron: "+contigu+"\nNumeros Mayores a Cero fueron: "+contmay+
         "\nNumeros Menores a Cero Fueron: "+contmen;
         //BancoFM.mostrar(cadena,"Mensaje De arriba",0);
     }
 }