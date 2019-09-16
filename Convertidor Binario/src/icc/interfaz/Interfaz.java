package icc.interfaz;
import icc.bits.Conversion;
import java.util.*;
public class Interfaz{

/**
*@author Ian_Garcia
*run - muestra el menú en pantalla
*/
  public  void run(){
    System.out.println("***************************************************");
    System.out.println("\tSistema de Conversion Binaria");
    System.out.println("***************************************************");
    System.out.println("Para Comenzar a convertir un entero a binario ");
    System.out.println("Presione: 1 --------------------------Press \"1\" to Start");
    System.out.println("Presione: 0 para salir ---------------Press \"0 \" to Exit");
    getInt("INGRESE UN VALOR ENTERO POSITIVO ","NO HAS INGRESADO UN VALOR ENTERO POSITIVO --- VUELVE A INTENTARLO");
    }
/**
Procesa la información, llama a la clase
Conversion.java
@param  WhatsUp - Guarda la cadena del mensaje de las indicaciones
@param MistakeDone - Guarda la cadena del mensaje en caso de error
@return prove - Devuelve el entero INGRESADO
*/
  public static int getInt(String WhatsUp, String mistakeDone){
    String ss1=WhatsUp;
    String ss2=mistakeDone;
    int prove=0;
    boolean ice=true;
    Scanner sc = new Scanner(System.in);// Genera un objeto scanner sc
    char to_Acces = 'q';//Inicializamos la varialble to_Acces

    do{

      to_Acces = sc.next().charAt(0);//ESperamos el ingreso de un caracter
      switch(to_Acces){
        case '0'://SI el caracter es 0 -> Sale del programa
        System.out.println("Saliendo del Programa");
        System.exit(0);//Cierra el programa
        break;

        case '1'://Si el caracter es 1  -> Sale del ciclo
        System.out.println("Accesando :)");
        ice=true;
        break;

        default://Muestra un mensaje de error
        System.out.println("Te has equivocado --- INTENTA NUEVAMENTE");
        ice=false;

      }
    }while(ice ==false);
    /*Creamos un nuevo objeto fs*/
    Scanner fs = new Scanner(System.in);
    boolean t=false;
    do{

      System.out.println(ss1);//Imprimimos en pantalla, las instrucciones para el usuario
    if(fs.hasNextInt()){//EL usuario ingresa el entero y verificamos que sea un entero
      prove=fs.nextInt();//Si es entero se asigna en la variable entera
      if(prove<0){//Verificamos que sea positivo
        t=false;//Nos mantenemos dentro del ciclo
      }else{
        t=true;//Salimos del ciclo si es un número correcto
      }
    }else{

        System.out.println(ss2);//Mensaje de error esperamos nuevo ingreso
        Scanner retrying = new Scanner(System.in);//Generamos un nuevo objeto Scanner
        if(retrying.hasNextInt()){//Verificamos el ingreso de una nueva variable
          prove=retrying.nextInt();//Si es correcta, es asignada a la variable prove
          if(prove<0){//Verificamos que sea positivo
            t=false;//Nos mantenemos en el ciclo si el número es negativo
          }else{
            t=true;//Salimos del ciclo
          }
        }
      }

    }while(t==false);

    Conversion c= new Conversion();//Invocamos a la clase Conversion instanciandolo como objeto
    getInt(c.conversion(prove));// Llamamos a la función de conversión, su parametro es el entero verificado anteriormente
      return prove;//Regresamos un entero

    }

/**
Usando la sobrecarga de clase getInt necesita como parametro un arreglo booleano
@param runnin - Proviene del retorno de la funcion conversion
@return devuelve un entero
*/

      public static int getInt(boolean [] runnin){
        int i=1;//Inicializamos la variable i
        do{
          System.out.print((runnin[(runnin.length-1)-i]? "1": "0"));//Imprimimos el arreglo binario del número ingresado
          i++;//Incrementamos de 1 en 1 a la variable i
        }while(i<runnin.length);
        return 1;//retornamos un entero
      }



}
