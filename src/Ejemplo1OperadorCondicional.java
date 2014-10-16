 /*
  * programa que pide un número por teclado y calcula si es par o impar
  */
import java.util.*;
public class Ejemplo1OperadorCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;      
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();

	//imprime en pantalla el PAR O IMPAR si el resto de la variable es 0 con la "?" ejecutara el codigo que tiene mas cerca
	//si resto no fuera 0 "?" ejecutara el codigo que tiene mas lejos
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
