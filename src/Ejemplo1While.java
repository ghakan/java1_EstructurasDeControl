/*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*;
public class Ejemplo1While {
    public static void main(String[] args) {

	//creamos dos variables de tipo entero uno de ellos con valor 0
        int suma = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();

	//si cumple la condicion de que la variable num sea mayor o igual a cero ejecutara el bucle
        while (num >= 0){

		//guarda en la variable suma la suma anterior mas el nuevo calor de num
               suma = suma + num;
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }
	//el bucle termina cuando se introduce un negativo
        System.out.println("La suma es: " + suma );
    }
}
