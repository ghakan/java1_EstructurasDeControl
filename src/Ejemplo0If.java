/*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
//Importa todas las librerias de java
import java.util.*;

//creamos la clase
public class Ejemplo0If {
	//sin esta linea no se ejecuta el programa
    public static void main( String[] args ){

	//guardamos en la variable sc la clase scanner
        Scanner sc = new Scanner( System.in );

	//imprimimos en pantalla el texto
        System.out.print("Nota: ");
	
	//guardamos en una variable lo que el usuario introduce que tiene que ser de tipo numerico
        int nota = sc.nextInt();

	//si la variable de antes cumple con la condicion, imprimira en pantalla el texto
        if (nota >= 5 ){
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
        }
       
        else
	{
	    //si no cumple la condicion imprimira en pantalla
            System.out.println("Lo Siento, has suspendido");
	}

    }
}
