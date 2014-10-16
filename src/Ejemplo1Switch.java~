/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*;
import java.io.*;


public class Ejemplo1Switch {

    //al cargar la libreria io es necesario poner throws IOException
    public static void main(String[] args) throws IOException{
        int A,B, Resultado = 0 ;
        char operador;
        boolean calculado = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero:");
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");
        B = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/):");

	//Lee lo que se a introducido en el sistema que tiene que ser de tipo char y lo guarda en la variable operador.
        operador = (char)System.in.read();
        switch (operador) {
		//si la varaible operador contiene '-' guardara en resultado la operacion y terminara el switch
                case '-' : Resultado = A - B;
                           break;
		//si la varaible operador contiene '+' guardara en resultado la operacion y terminara el switch
                case '+' : Resultado = A + B;
                           break;
		//si la varaible operador contiene '*' guardara en resultado la operacion y terminara el switch
                case '*' : Resultado = A * B;
                           break;
		//si la varaible operador contiene '/' realizar una condicion de que la variable B sea diferente a 0, si se cumple ejecutara el codigo siguiente
                case '/' : if(B!=0)
                              Resultado = A / B;

			//si la variable B es igual a 0 ejecutara el siguiente codigo
                           else{
                              System.out.println("\nNo se puede dividir por cero");

				//guarda en la variable calculado valor false
                              calculado = false;
                           }
                           break; //termina el bucle

		//si no se cumple nunguno de los casos anteriores ejecuta el siguiente codigo
                default : System.out.println("\nOperador no valido");  //imprime en pantalla
                          calculado = false; //guarda en la variable calculado valor false
                         
        }

	//si calculado no es false ejecutara el siguiente codigo
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}
