package icc.bits;
/**
*
*@author Ian_Garcia
*/

public class Conversion{


    /**
    *En el método conversion recibimos un entero
    *@param  to_Convert el numero para convertir
    *@return converted  - el arreglo booleano
    */
    public static boolean[] conversion(int to_Convert){

        int c = to_Convert;//numero a dividir
        boolean[] converted= new boolean[32];//Arreglo booleano a devolver
        int [] b= new int[32];//Arreglo entero a devolver
        int a=b.length-1;//tamño del arreglo

       while(c>0){
         b[a]=c%2;//Se asigna el valor del modulo a la posición a del arreglo entero b
         a--;//se recorre un lugar de derecha a izquierda
         //System.out.println(c%2);//
         c=c/2;//Se divide entre dos y queda asignado en la variable c
         }

           int w =converted.length-1;//Tamaño de la conversion
           while(w>=0){
           if(b[(b.length-1)-w]==1){// Se leen los bits de derecha a izquierda si es 1 corresponde a true
           converted[w]=true;//Se asigna en la posicion w del aareglo booleano converted true
         }else{
           converted[w]=false;
         }
           w--;// se resta 1 al entero para recorrer una posicion en el bit
         }

        /* for(int perShow=0; perShow<converted.length; perShow++){
           System.out.print((converted[perShow]?"1":"0"));
         }*/
         return converted;//Regresa el arreglo Booleano creado

                }

              }
