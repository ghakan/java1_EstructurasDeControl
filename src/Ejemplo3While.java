/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo3While {
    public static void main(String[] args) {

	//definimos una variable de tipo entero con valor 10 que no se podra modificar
        final int VALOR_INICIAL = 10;  // limite inf. tabla

	//definimos una variable de tipo entero con valor 100 que no se podra modificar
        final int VALOR_FINAL = 100;  // limite sup. tabla

	//definimos una variable de tipo entero con valor 10 que no se podra modificar
        final int PASO = 10 ; // incremento

	//definimos una variable de tipo entero sin valor
        int fahrenheit;
	
	//definimos una variable de tipo decimal sin valor
        double celsius;

	//guardamos en la variable fahrenheit el valor de la variable VALOR_INICIAL
        fahrenheit = VALOR_INICIAL;

        System.out.printf("Fahrenheit \t Celsius \n");

	//si fahrenheit es menor o igual a VALOR_INICIAL comienza el bucle
        while (fahrenheit <= VALOR_FINAL ){

		//guardamos en la variable fahrenheit el resultado de la operacion
               celsius = 5*(fahrenheit - 32)/9.0;

		//imprimimos en pantalla los valores
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);

	//suma el valor de las dos variables, gracias al bucle el valor de fahrenheit va incrementado  
	// fahrenheit = fahrenheit + PASO
               fahrenheit += PASO;
        }
    }
}
