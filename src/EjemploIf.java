/*
 * programa que pide un número por teclado y calcula si es par o impar
 */
//Importa todas las librerias de java
import java.util.*;

//creamos la clase
public class EjemploIf {
	//sin esta linea no se ejecuta el programa
    public static void main(String[] args) {

	//guardamos en la variable sc la clase scanner
        Scanner sc = new Scanner(System.in);

	//creamos la variable num de tipo entero
        int num;      
        System.out.println("Introduzca numero: ");
	//guardamos en una variable lo que el usuario introduce como numero entero
        num = sc.nextInt();

	//si la variable cumple con la condicion, si el resultado de resto es igual a cero se cumple
        if ((num%2)==0)
           System.out.println("PAR");
        else
            System.out.println("IMPAR");
    }
}
