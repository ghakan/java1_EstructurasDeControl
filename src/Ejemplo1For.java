/*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo1For {
    public static void main(String[] args) {

	//definimos una variable de tipo entero con valor 10 que no se podra modificar
        final int VALOR_INICIAL = 10;  // limite inf. tabla

	//definimos una variable de tipo entero con valor 100 que no se podra modificar
        final int VALOR_FINAL = 100;  // limite sup. tabla

	//definimos una variable de tipo entero con valor 10 que no se podra modificar
        final int PASO = 10 ; // incremento

        int fahrenheit;
        double celsius;

	//guardamos en la variable fahrenheit el valor de la variable VALOR_INICIAL
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");

//el valor de fahrenheit es 10 mientras que fahrenheit sea menor o igual a 100 se cumplira la condicion y el valor fahrenheit.
//cada vez que se pase el bucle hara fahrenheit = fahrenheit + PASO
        for (fahrenheit = VALOR_INICIAL; fahrenheit <= VALOR_FINAL;
              fahrenheit+= PASO) {
             celsius = 5*(fahrenheit - 32)/9.0;
             System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
        }
    }
}
