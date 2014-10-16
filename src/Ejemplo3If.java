/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*;
public class Ejemplo3If {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

	//crea una varaible llamada nota de tipo double
      double nota;
      System.out.println("Introduzca una nota entre 0 y 10: ");
      nota = sc.nextDouble();
      System.out.println("La calificación del alumno es ");

	//si se cumple alguna de las dos condiciones (que la variable nota sea menos a 0 o que la variable nota sea mayor que 10) se ejecutara el codigo de dentro.
      if(nota < 0 || nota > 10)
         System.out.println("Nota no válida");


//si se cumple la condicion y la ANTERIOR NO (que la variable nota sea igual a 10) se ejecutara el codigo de dentro.
      else if(nota==10)
           System.out.println("Matrícula de Honor");

//si se cumple la condicion y la ANTERIOR NO (que la variable nota sea mayor o igual a 9) se ejecutara el codigo de dentro.
      else if (nota >= 9)
           System.out.println("Sobresaliente");

//si se cumple la condicion y la ANTERIOR NO (que la variable nota sea mayor o igual a 7) se ejecutara el codigo de dentro.
      else if (nota >= 7)
           System.out.println("Notable");

//si se cumple la condicion y la ANTERIOR NO (que la variable nota sea mayor o igual a 6) se ejecutara el codigo de dentro.
      else if (nota >= 6)
           System.out.println("Bien");

//si se cumple la condicions y la ANTERIOR NO (que la variable nota sea mayor o igual a 5) se ejecutara el codigo de dentro.
      else if (nota >= 5)
           System.out.println("Suficiente");
//si no se cumple ninguna de las anteriores condiciones se ejecuta el codigo de dentro.
      else
           System.out.println("Suspenso");
    }
}
