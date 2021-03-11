package operaciones;

/**
 * Proporciona los métodos necesarios para realizar el cociente de números enteros y reales, así como la raíz y el inverso de números reales.
 * 
 * @author Adrian Rodriguez Montesinos.
 * @version 1.0
 * @see Producto
 * @since 23-2-2021.
 *
 */
public class Cociente {
	
	// ATRIBUTOS
	
				/**
				 * Primer operando entero. Se trata de un entero positivo.
				 */
				private int a;
				
				/**
				 * Segundo operando entero. Se trata de un entero positivo.
				 */
				private int b;
				
				/**
				 * Primer operando real. Se trata de un real positivo.
				 */
				private double c;
				
				/**
				 * Segundo operando real. Se trata de un real positivo.
				 */
				private double d;
				
				/**
				 * Número real a invertir. Se trata de un real positivo.
				 */
				private double invertir;
				
				/**
				 * Radicando entero de una raíz. Se trata de un entero positivo.
				 */
				private int radicando;
				
				// CONSTRUCTORES
				
				/**
				 * Constructor por defecto (asigna valores nulos a los atributos).
				 */
				public Cociente() {}
				
				/**
				 * Construye un objeto de clase Cociente con dos operandos enteros. 
				 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
				 * Inicializa el resto de los atributos a 0.
				 * 
				 * @param a primer operando entero (dividendo). 
				 * @param b segundo operando entero (divisor).
				 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
				 */
				public Cociente(int a, int b) throws IllegalArgumentException {}
				
				/**
				 * Construye un objeto de clase Producto con dos operandos reales.
				 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
				 * Inicializa el resto de los atributos a 0.
				 * 
				 * @param c primer operando real (dividendo).
				 * @param d segundo operando real (divisor).
				 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
				 */
				public Cociente(double c, double d) throws IllegalArgumentException {}
				
				/**
				 * Construye un objeto de clase Producto con tres operandos reales.
				 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
				 * Inicializa el resto de los atributos a 0.
				 * 
				 * @param radicando radicando de la raíz (entero).
				 * @throws IllegalArgumentException saltará en caso de el  parámetro de entrada sea nulo o negativo.
				 */
				public Cociente(int radicando) throws IllegalArgumentException {}
				
				/**
				 * Construye un objeto de clase Producto con dos operandos enteros, tres reales, una base y un exponente.
				 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
				 * Cuando la base o el exponente exceden las unidades (mayores que 9) se mostrará otro mensaje de error.
				 * Esto es porque potencias y/o bases del orden de las decenas implican una potencia demasiado grande para ser guardada.
				 * 
				 * @param a primer operando entero (dividendo). 
				 * @param b segundo operando entero (divisor).
				 * @param c primer operando real (dividendo).
				 * @param d segundo operando real (divisor).
				 * @param invertir número real a invertir.
				 * @param radicando radicando de la raíz (entero). 
				 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo. Tambien será lanzada si la base o el exponente exceden el rango de las unidades.
				 */
				public Cociente(int a, int b, double c, double d, double invertir, int radicando) throws IllegalArgumentException {}
				
				// MÉTODOS NO ESTÁTICOS
				
				/**
				 * Realiza la división de los dos operandos enteros.
				 * En caso de que el resultado no sea entero, es decir, que el cociente no sea exacto (resto 0) se lanzará un mensaje de error.
				 * 
				 * @return resultado de la multiplicación (entero).
				 */
				public int cocienteEnteros() throws IllegalArgumentException{}
				
				/**
				 * Realiza la multiplicación de los dos operandos reales.
				 * 
				 * @return resultado de la multiplicación (real).
				 */
				public double cocienteReales() {}
				
				/**
				 * Realiza la multiplicación de los tres operandos enteros.
				 * 
				 * @return resultado de la multiplicación (real).
				 */
				public double inverso() {}
				
				/**
				 * Reliza la raíz cuadrada del radicando.
				 * 
				 * @return resultado realizar la raíz cuadrada (real) del radicando.
				 */
				public double raiz() {}
				
				/**
				 * Obtiene el primer operando entero.
				 * 
				 * @return primer operando (entero).
				 */
				public int getA() {}
				
				/**
				 * Obtiene el segundo operando entero.
				 * 
				 * @return segundo operando (entero).
				 */
				public int getB() {}
				
				/**
				 * Obtiene el primer operando (dividiendo) real.
				 * 
				 * @return dividendo (real).
				 */
				public double getC() {}
				
				/**
				 * Obtiene el segundo operando (divisor) real.
				 * 
				 * @return divisor (real).
				 */
				public double getD() {}
				
				/**
				 * Obtiene el número real a invertir.
				 * 
				 * @return número a invertir (real).
				 */
				public double getInvertir() {}
				
				/**
				 * Obtiene el radicando entero.
				 * 
				 * @return radicando (entero).
				 */
				public int getRadicando() {}
				
				/**
				 *  Da un nuevo valor al primero operando entero.
				 *  En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
				 *  
				 * @param a nuevo valor del primer operando (entero).
				 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
				 */
				public void setA(int a) throws IllegalArgumentException {}
				
				/**
				 * Da un nuevo valor al segundo operando entero.
				 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
				 *  
				 * @param b nuevo valor del segundo operando (entero).
				 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
				 */
				public void setB(int b) throws IllegalArgumentException {}
				
				/**
				 * Da un nuevo valor al primero operando real.
				 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
				 *  
				 * @param c nuevo valor del primer operando (real).
				 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
				 */
				public void setC(double c) throws IllegalArgumentException {}
				
				/**
				 * Da un nuevo valor al segundo operando real.
				 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
				 *  
				 * @param d nuevo valor del segundo operando (real).
				 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
				 */
				public void setD(double d) throws IllegalArgumentException {}
				
				/**
				 * Da un nuevo valor al número real a invertir.
				 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
				 *  
				 * @param invertir nuevo valor del número a invertir (real).
				 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
				 */
				public void setInvertir(double invertir) throws IllegalArgumentException {}
				
				/**
				 *  Da un nuevo valor radicando entero.
				 *  En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
				 *  
				 * @param radicando nuevo valor del radicando (entero).
				 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
				 */
				public void setRadicando(int radicando) throws IllegalArgumentException {}
				
				
				
				// MÉTODOS ESTÁTICOS
				
				/**
				 * División de dos números enteros.
				 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
				 * En caso de que el resultado no sea entero, es decir, que el cociente no sea exacto (resto 0) se lanzará otro mensaje de error.
				 * 
				 * @param a primer operando (entero).
				 * @param b segundo operando (entero).
				 * @return retultado de la división (entero).
				 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo. También en caso de que la división no sea exacta.
				 */
				public static int cociente(int a, int b) throws IllegalArgumentException {}
				
				
				/**
				 * División de dos números reales.
				 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
				 * 
				 * @param a primer operando (real).
				 * @param b segundo operando (real).
				 * @return resultado de la división (real).
				 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
				 */
				public static double cociente(double a, double b) throws IllegalArgumentException {}
				
				
				
				/**
				 * Invierte un número real. No se aceptarán números negativos o nulos (mostrará un mensaje de error).
				 * 		
				 * @param a número a invertir (real).
				 * @return número invertido (real).
				 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
				 */
				public static double inverso(int a) throws IllegalArgumentException {}
				
				/**
				 * Reliza la raíz cuadrada del número entero.
				 * 		
				 * @param a radicando entero.
				 * @return resultado realizar la raíz cuadrada (real).
				 */
				public static double raiz( int a ) {}

}
