/*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;
public class Ejemplo2If {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int hora;
      System.out.println("Introduzca una hora (un valor entero): ");
      hora = sc.nextInt();

	//Si se cumplen las dos condiciones (la variable hora es mayor o igual a 0 y si hora es menor a 12) 
      if (hora >= 0 && hora < 12)

	  //imprime en pantalla el texto
          System.out.println("Buenos días");

	//Si no se cumplio la anterior condicion y Si se cumplen las dos condiciones (la variable hora es mayor o igual a 12 y si hora es menor a 21) 
      else if (hora >= 12 && hora < 21)
	    //imprime en pantalla el texto
           System.out.println("Buenas tardes");

	//Si no se cumplio la anterior condicion y Si se cumplen las dos condiciones (la variable hora es mayor o igual a 21 y si hora es menor a 24) 
      else if (hora >= 21 && hora < 24)
	     //imprime en pantalla el texto
            System.out.println("Buenas noches");

     //si no se cumplieron las demas condiciones ejecuta el codigo de dentro
      else
	     //imprime en pantalla el texto
            System.out.println("Hora no válida");
    }
}
