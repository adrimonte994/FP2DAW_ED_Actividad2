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
			public Producto() {
				a = 0;
				b = 0;
				c = 0.0;
				d = 0.0;
				e = 0.0;
				base = 0;
				exp = 0;
			}
			
			/**
			 * Construye un objeto de clase Producto con dos operandos enteros. 
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * Inicializa el resto de los atributos a 0.
			 * 
			 * @param a primer operando entero. 
			 * @param b segundo operando entero.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Producto(int a, int b) throws IllegalArgumentException {
				if (a < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.a = a;
				if (b < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.b = b;
				c = 0.0;
				d = 0.0;
				e = 0.0;
				base = 0;
				exp = 0;
			}
			
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
			public Producto(int a, int b, int base, int exp) throws IllegalArgumentException {
				if (a < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.a = a;
				if (b < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.b = b;
				c = 0.0;
				d = 0.0;
				e = 0.0;
				if (base < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (base == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else if (base > 9)
					throw new IllegalArgumentException("No se permite una base tan grande. Debe ser del orden de unidades.");
				else
					this.base = base;
				if (exp < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (exp == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else if (exp > 9)
					throw new IllegalArgumentException("No se permite un exponente tan grande. Debe ser del orden de unidades.");
				else
					this.exp = exp;
				
			}
			
			/**
			 * Construye un objeto de clase Producto con dos operandos reales.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * Inicializa el resto de los atributos a 0.
			 * 
			 * @param c primer operando real.
			 * @param d segundo operando real.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Producto(double c, double d) throws IllegalArgumentException {
				a = 0;
				b = 0;
				if (c < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (c == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.c = c;
				if (d < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (d == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.d = d;
				e = 0.0;
				base = 0;
				exp = 0;
			}
			
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
			public Producto(double c, double d, double e) throws IllegalArgumentException {
				a = 0;
				b = 0;
				if (c < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (c == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.c = c;
				if (d < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (d == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.d = d;
				if (e < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (e == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.e = e;
				base = 0;
				exp = 0;
			}
			
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
			public Producto(int a, int b, double c, double d, double e) throws IllegalArgumentException {
				if (a < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.a = a;
				if (b < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.b = b;
				if (c < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (c == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.c = c;
				if (d < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (d == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.d = d;
				if (e < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (e == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.e = e;
				base = 0;
				exp = 0;
			}
			
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
			public Producto(int a, int b, double c, double d, double e, int base, int exp) throws IllegalArgumentException {
				if (a < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.a = a;
				if (b < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.b = b;
				if (c < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (c == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.c = c;
				if (d < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (d == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.d = d;
				if (e < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (e == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.e = e;
				if (base < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (base == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else if (base > 9)
					throw new IllegalArgumentException("No se permite una base tan grande. Debe ser del orden de unidades.");
				else
					this.base = base;
				if (exp < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (exp == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else if (exp > 9)
					throw new IllegalArgumentException("No se permite un exponente tan grande. Debe ser del orden de unidades.");
				else
					this.exp = exp;
			}
			
			// MÉTODOS NO ESTÁTICOS
			
			/**
			 * Realiza la multiplicación de los dos operandos enteros.
			 * 
			 * @return resultado de la multiplicación (entero).
			 */
			public int productoEnteros() { return a * b; }
			
			/**
			 * Realiza la multiplicación de los dos operandos reales.
			 * 
			 * @return resultado de la multiplicación (real).
			 */
			public double producto2Reales() { return c * d; }
			
			/**
			 * Realiza la multiplicación de los tres operandos enteros.
			 * 
			 * @return resultado de la multiplicación (real).
			 */
			public double producto3Reales() { return c * d * e; }
			
			/**
			 * Potencia con base y exponente enteros establecidos.
			 * 		
			 * @return resultado de elevar la base al exponente (entero).
			 */
			public long potenciacion() {
				int result = base;
				if (exp == 1)
					return result;
				else {
					for (int i = 2; i <= exp; i++) 
						result *= base;
					return result;
				}
			}
			
			/**
			 * Obtiene el primer operando entero.
			 * 
			 * @return primer operando (entero).
			 */
			public int getA() { return a; }
			
			/**
			 * Obtiene el segundo operando entero.
			 * 
			 * @return segundo operando (entero).
			 */
			public int getB() { return b; }
			
			/**
			 * Obtiene el primer operando real.
			 * 
			 * @return primer operando (real).
			 */
			public double getC() { return c; }
			
			/**
			 * Obtiene el segundo operando real.
			 * 
			 * @return segundo operando (real).
			 */
			public double getD() { return d; }
			
			/**
			 * Obtiene el tercer operando real.
			 * 
			 * @return tercer operando (real).
			 */
			public double getE() { return e; }
			
			/**
			 * Obtiene la base de la potencia (entera).
			 * 
			 * @return base de la potencia (entera).
			 */
			public int getBase() { return base; }
			
			/**
			 * Obtiene el exponente de la potencia (entero).
			 * 
			 * @return exponente de la potencia (entero).
			 */
			public int getExponente() { return exp; }
			
			/**
			 *  Da un nuevo valor al primero operando entero.
			 *  En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param a nuevo valor del primer operando (entero).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public void setA(int a) throws IllegalArgumentException { 
				if (a < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.a = a;
			}
			
			/**
			 * Da un nuevo valor al segundo operando entero.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param b nuevo valor del segundo operando (entero).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public void setB(int b) throws IllegalArgumentException { 
				if (b < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.b = b;
			}
			
			/**
			 * Da un nuevo valor al primero operando real.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param c nuevo valor del primer operando (real).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
			 */
			public void setC(double c) throws IllegalArgumentException { 
				if (c < 0.0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (c == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.c = c;
			}
			
			/**
			 * Da un nuevo valor al segundo operando real.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param d nuevo valor del segundo operando (real).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
			 */
			public void setD(double d) throws IllegalArgumentException { 
				if (d < 0.0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (d == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.d = d;
			}
			
			/**
			 * Da un nuevo valor al tercer operando real.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param e nuevo valor del tercer operando (real).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
			 */
			public void setE(double e) throws IllegalArgumentException { 
				if (e < 0.0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (e == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.e = e;
			}
			
			/**
			 * Da un nuevo valor a la base de la potencia (entera).
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param base nuevo valor para la base de la potencia (entera).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public void setBase(int base) throws IllegalArgumentException { 
				if (base < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (base == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.base = base;
			}
			
			/**
			 * Da un nuevo valor al exponente de la potencia (entero).
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param exp nuevo valor para exponente de la potencia (entero).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public void setExponente(int exp) throws IllegalArgumentException { 
				if (exp < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (exp == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					this.exp = exp;
			}
			
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
			public static int producto(int a, int b) throws IllegalArgumentException {
				if (a < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				if (b < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				return a * b;
			}
			
			/**
			 * Multiplicación de dos números reales.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * 
			 * @param a primer operando (real).
			 * @param b segundo operando (real).
			 * @return resultado de la multiplicación (real).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public static double producto(double a, double b) throws IllegalArgumentException {
				if (a < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				if (b < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				return a * b;
			}
			
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
			public static double producto(double a, double b, double c) throws IllegalArgumentException {
				if (a < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				if (b < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				if (c < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (c == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				return a * b * c;
			}
			
			/**
			 * Potencia con base y exponente enteros. No se aceptarán números negativos o nulos (mostrará un mensaje de error).
			 * Tampoco será posible la entrada de parámetros mayores a 9, es decir que execdan las unidades, ya que la potencia sería demasiado grande.
			 * 		
			 * @param base base de la potencia (entera).
			 * @param exp exponente de la potencia (entero).
			 * @return resultado de elevar la base al exponente (entero).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo, negativo o exceda las unidades.
			 */
			public static long potencia(int base, int exp) throws IllegalArgumentException {
				if (base < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (base == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else if (base > 9)
					throw new IllegalArgumentException("No se permite una base tan grande. Debe ser del orden de unidades.");
				if (exp < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (exp == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else if (exp > 9)
					throw new IllegalArgumentException("No se permite un exponente tan grande. Debe ser del orden de unidades.");
				int result = base;
				if (exp == 1)
					return result;
				else {
					for (int i = 2; i <= exp; i++) 
						result *= base;
					return result;
				}
			}

}
