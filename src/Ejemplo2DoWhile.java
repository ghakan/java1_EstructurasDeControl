/*
 * Programa que lee un número entre 1 y 10 ambos incluidos
 */
import java.util.*;
public class Ejemplo2DoWhile {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner( System.in );

	//mientras se cumpla la condicion while se ejecutara el do
        do {
            System.out.print("Escribe un número entre 1 y 10: ");
            n = sc.nextInt();

	//si cumple alguna de las dos condiciones (n sea menor a 1) o (n sea mayor a 10) se ejecuta el bucle
        }while (n<1 || n >10);
        System.out.println("Ha introducido: " + n);
    }
}
