/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;
public class Ejemplo0Switch {
    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero de mes: ");
        mes = sc.nextInt();

	//la variable mes entra en el switch que es un entero
        switch (mes)
        {
		//si la variable mes es 1 ejecuta el codigo y termina el switch
                case 1: System.out.println("ENERO");
                           break;

		//si la variable mes es 2 ejecuta el codigo y termina el switch
                case 2: System.out.println("FEBRERO");
                           break;

		//si la variable mes es 3 ejecuta el codigo y termina el switch
                case 3: System.out.println("MARZO");
                           break;

		//si la variable mes es 4 ejecuta el codigo y termina el switch
                case 4: System.out.println("ABRIL");
                           break;

		//si la variable mes es 5 ejecuta el codigo y termina el switch
                case 5: System.out.println("MAYO");
                           break;
	
		//si la variable mes es 6 ejecuta el codigo y termina el switch
                case 6: System.out.println("JUNIO");
                           break;

		//si la variable mes es 7 ejecuta el codigo y termina el switch
                case 7: System.out.println("JULIO");
                           break;

		//si la variable mes es 8 ejecuta el codigo y termina el switch
                case 8: System.out.println("AGOSTO");
                           break;

		//si la variable mes es 9 ejecuta el codigo y termina el switch
                case 9: System.out.println("SEPTIEMBRE");
                           break;

		//si la variable mes es 10 ejecuta el codigo y termina el switch
                case 10: System.out.println("OCTUBRE");
                             break;

		//si la variable mes es 11 ejecuta el codigo y termina el switch
                case 11: System.out.println("NOVIEMBRE");
                             break;

		//si la variable mes es 12 ejecuta el codigo y termina el switch
                case 12: System.out.println("DICIEMBRE");
                             break;
		
		//si la variable mes no corresponde a ninguna de las anteriores condiciones ejecuta el codigo
                default : System.out.println("Mes no válido");                       
        }
    }
}
