/*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
import java.util.*;
public class Ejemplo1DoWhile {
    public static void main(String[] args) {
        int valor;
        Scanner in = new Scanner( System.in );

	//se ejecuta mientras se cumple la condicion while "hacer mientras"
        do {
            System.out.print("Escribe un entero < 100: ");
	
	   //recoge en in el valor entero introducido por el usuario y lo guarda en valor
            valor = in.nextInt();

	//si cumple la condicion de valor mayor o igual que 100 ejecutara el bucle
        }while (valor >= 100);
        System.out.println("Ha introducido: " + valor);
    }
}
