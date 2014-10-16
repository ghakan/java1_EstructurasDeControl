/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
public class Ejemplo3For {
    public static void main(String[] args) {
        int a, b;

	//cuando a mas b sea menor a 10 se ejecutara el bucle
	//por cada vez que se ejecute el bucle el valor de a se incrementara en 1
	//por cada vez que se ejecute el bucle el valor de b sera (b = b + 2)
        for(a = 1, b = 1; a + b < 10; a++, b+=2){
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}
