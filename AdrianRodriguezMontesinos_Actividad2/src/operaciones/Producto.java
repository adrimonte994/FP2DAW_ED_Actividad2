package operaciones;

/**
 * Proporciona los métodos necesarios para realizar el producto de números enteros y reales, así como las potencias con base y exponente enteros.
 * 
 * @author Adrian Rodriguez Montesinos.
 * @version 1.0
 * @see Cociente
 * @since 23-2-2021.
 *
 */
public class Producto {
	
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
			 * Tercer operando real. Se trata de un real positivo.
			 */
			private double e;
			
			/**
			 * Base entera de una potencia. Se trata de un entero positivo.
			 */
			private int base;
			
			/**
			 * Exponente entero de una potencia. Se trata de un entero positivo.
			 */
			private int exp;
			
			// CONSTRUCTORES
			
			/**
			 * Constructor por defecto (asigna valores nulos a los atributos).
			 */
			public Producto() {}
			
			/**
			 * Construye un objeto de clase Producto con dos operandos enteros. 
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * Inicializa el resto de los atributos a 0.
			 * 
			 * @param a primer operando entero. 
			 * @param b segundo operando entero.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Producto(int a, int b) throws IllegalArgumentException {}
			
			/**
			 * Construye un objeto de clase Producto con dos operandos enteros y la base y exponente de la potencia. 
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * Cuando la base o el exponente exceden las unidades (mayores que 9) se mostrará otro mensaje de error.
			 * Esto es porque potencias y/o bases del orden de las decenas implican una potencia demasiado grande para ser guardada.
			 * Inicializa el resto de los atributos a 0.
			 * 
			 * @param a primer operando entero. 
			 * @param b segundo operando entero.
			 * @param base base de la potencia (entero). 
			 * @param exp exponente de la potencia (entero).
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo. Tambien será lanzada si la base o el exponente exceden el rango de las unidades.
			 */
			public Producto(int a, int b, int base, int exp) throws IllegalArgumentException {}
			
			/**
			 * Construye un objeto de clase Producto con dos operandos reales.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * Inicializa el resto de los atributos a 0.
			 * 
			 * @param c primer operando real.
			 * @param d segundo operando real.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Producto(double c, double d) throws IllegalArgumentException {}
			
			/**
			 * Construye un objeto de clase Producto con tres operandos reales.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * Inicializa el resto de los atributos a 0.
			 * 
			 * @param c primer operando real.
			 * @param d segundo operando real.
			 * @param e tercer operando real.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Producto(double c, double d, double e) throws IllegalArgumentException {}
			
			/**
			 * Construye un objeto de clase Producto con dos operandos enteros y tres reales.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * 
			 * @param a primer operando entero. 
			 * @param b segundo operando entero.
			 * @param c primer operando real.
			 * @param d segundo operando real.
			 * @param e tercer operando real.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Producto(int a, int b, double c, double d, double e) throws IllegalArgumentException {}
			
			/**
			 * Construye un objeto de clase Producto con dos operandos enteros, tres reales, una base y un exponente.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * Cuando la base o el exponente exceden las unidades (mayores que 9) se mostrará otro mensaje de error.
			 * Esto es porque potencias y/o bases del orden de las decenas implican una potencia demasiado grande para ser guardada.
			 * 
			 * @param a primer operando entero. 
			 * @param b segundo operando entero.
			 * @param c primer operando real.
			 * @param d segundo operando real.
			 * @param e tercer operando real.
			 * @param base base de la potencia (entero). 
			 * @param exp exponente de la potencia (entero).
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo. Tambien será lanzada si la base o el exponente exceden el rango de las unidades.
			 */
			public Producto(int a, int b, double c, double d, double e, int base, int exp) throws IllegalArgumentException {}
			
			// MÉTODOS NO ESTÁTICOS
			
			/**
			 * Realiza la multiplicación de los dos operandos enteros.
			 * 
			 * @return resultado de la multiplicación (entero).
			 */
			public int productoEnteros() {}
			
			/**
			 * Realiza la multiplicación de los dos operandos reales.
			 * 
			 * @return resultado de la multiplicación (real).
			 */
			public double producto2Reales() {}
			
			/**
			 * Realiza la multiplicación de los tres operandos enteros.
			 * 
			 * @return resultado de la multiplicación (real).
			 */
			public double producto3Reales() {}
			
			/**
			 * Potencia con base y exponente enteros establecidos.
			 * 		
			 * @return resultado de elevar la base al exponente (entero).
			 */
			public long potenciacion() {}
			
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
			 * Obtiene el primer operando real.
			 * 
			 * @return primer operando (real).
			 */
			public double getC() {}
			
			/**
			 * Obtiene el segundo operando real.
			 * 
			 * @return segundo operando (real).
			 */
			public double getD() {}
			
			/**
			 * Obtiene el tercer operando real.
			 * 
			 * @return tercer operando (real).
			 */
			public double getE() {}
			
			/**
			 * Obtiene la base de la potencia (entera).
			 * 
			 * @return base de la potencia (entera).
			 */
			public int getBase() {}
			
			/**
			 * Obtiene el exponente de la potencia (entero).
			 * 
			 * @return exponente de la potencia (entero).
			 */
			public int getExponente() {}
			
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
			 * Da un nuevo valor al tercer operando real.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param e nuevo valor del tercer operando (real).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
			 */
			public void setE(double e) throws IllegalArgumentException {}
			
			/**
			 * Da un nuevo valor a la base de la potencia (entera).
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param base nuevo valor para la base de la potencia (entera).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public void setBase(int base) throws IllegalArgumentException {}
			
			/**
			 * Da un nuevo valor al exponente de la potencia (entero).
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param exp nuevo valor para exponente de la potencia (entero).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public void setExponente(int exp) throws IllegalArgumentException {}
			
			// MÉTODOS ESTÁTICOS
			
			/**
			 * Multiplicación de dos números enteros.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * 
			 * @param a primer operando (entero).
			 * @param b segundo operando (entero).
			 * @return retultado de la multiplicación (entero).
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public static int producto(int a, int b) throws IllegalArgumentException {}
			
			/**
			 * Multiplicación de dos números reales.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * 
			 * @param a primer operando (real).
			 * @param b segundo operando (real).
			 * @return resultado de la multiplicación (real).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public static double producto(double a, double b) throws IllegalArgumentException {}
			
			/**
			 * Multiplicación de tres números reales.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * 
			 * @param a primer operando (real).
			 * @param b segundo operando (real).
			 * @param c tercer operando (real).
			 * @return resultado de la multiplicación (real).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public static double producto(double a, double b, double c) throws IllegalArgumentException {}
			
			/**
			 * Potencia con base y exponente enteros. No se aceptarán números negativos o nulos (mostrará un mensaje de error).
			 * Tampoco será posible la entrada de parámetros mayores a 9, es decir que execdan las unidades, ya que la potencia sería demasiado grande.
			 * 		
			 * @param base base de la potencia (entera).
			 * @param exp exponente de la potencia (entero).
			 * @return resultado de elevar la base al exponente (entero).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo, negativo o exceda las unidades.
			 */
			public static long potencia(int base, int exp) throws IllegalArgumentException {}

}
