package operaciones;

/**
 * Proporciona los mÃ©todos necesarios para realizar la sustracciÃ³n de nÃºmeros enteros y reales.
 * 
 * @author Adrian Rodriguez Montesinos.
 * @version 1.0
 * @see Suma
 * @since 23-2-2021.
 *
 */
public class Resta {

	// ATRIBUTOS
	
			/**
			 * variable acumuladora (entera) requerida en el método que realiza la resta con acumulación.
			 */
			private static int acu = 0;
			
			/**
			 * Minuendo entero. Se trata de un entero positivo.
			 */
			private int a;
			
			/**
			 * Sustraendo entero.Se trata de un entero positivo.
			 */
			private int b;
			
			/**
			 * Minuendo real. Se trata de un real positivo.
			 */
			private double c;
			
			/**
			 * Primer Sustraendo real. Se trata de un real positivo.
			 */
			private double d;
			
			/**
			 * Segundo Sustraendo real. Se trata de un real positivo.
			 */
			private double e;
			
			// CONSTRUCTORES
			
			/**
			 * Constructor por defecto (asigna valores nulos a los atributos).
			 */
			public Resta() {
				a = 0;
				b = 0;
				c = 0.0;
				d = 0.0;
				e = 0.0;
			}
			
			/**
			 * Construye un objeto de clase Resta con dos operandos enteros. 
			 * En caso de introducirse parámetros nulos negativos, se mostrará un mensaje de error.
			 * Inicializa el resto de los atributos a 0.
			 * 
			 * @param a primer operando entero. 
			 * @param b segundo operando entero.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Resta(int a, int b) throws IllegalArgumentException {
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
			}
			
			/**
			 * Construye un objeto de clase Resta con dos operandos reales.
			 * En caso de introducirse parámetros negativos, se mostrará un mensaje de error.
			 * Inicializa el resto de los atributos a 0.
			 * 
			 * @param c primer operando real.
			 * @param d segundo operando real.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Resta(double c, double d) throws IllegalArgumentException {
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
			}
			
			/**
			 * Construye un objeto de clase Resta con tres operandos reales.
			 * En caso de introducirse parámetros negativos, se mostrará un mensaje de error.
			 * Inicializa el resto de los atributos a 0.
			 * 
			 * @param c primer operando real.
			 * @param d segundo operando real.
			 * @param e tercer operando real.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Resta(double c, double d, double e) throws IllegalArgumentException {
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
			}
			
			/**
			 * Construye un objeto de clase Resta con dos operandos enteros y tres reales.
			 * En caso de introducirse parámetros negativos, se mostrará un mensaje de error.
			 * 
			 * @param a primer operando entero. 
			 * @param b segundo operando entero.
			 * @param c primer operando real.
			 * @param d segundo operando real.
			 * @param e tercer operando real.
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public Resta(int a, int b, double c, double d, double e) throws IllegalArgumentException {
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
			}
			
			// MÉTODOS NO ESTÁTICOS
			
			/**
			 * Realiza la resta de los dos operandos enteros.
			 * 
			 * @return resultado de la sustracción (entero).
			 */
			public int restaEnteros() { return a - b; }
			
			/**
			 * Realiza la resta de dos de los operandos reales.
			 * 
			 * @return resultado de la sustracción (real).
			 */
			public double resta2Reales() { return c - d; }
			
			/**
			 * Realiza la resta de los tres operandos enteros.
			 * 
			 * @return resultado de la sustracción (real).
			 */
			public double resta3Reales() { return c - d - e; }
			
			/**
			 * Realiza la resta del número acumulado de la llamada a esta función con el primer operando entero.
			 * 
			 * @return resultado de la sustracción del acumulador (entero).
			 */
			public int restaAcu() { 
				acu = a - acu;
				return acu; 
			}
			
			/**
			 * Obtiene el primer operando entero.
			 * 
			 * @return minuendo (entero).
			 */
			public int getA() { return a; }
			
			/**
			 * Obtiene el segundo operando entero.
			 * 
			 * @return sustraendo (entero).
			 */
			public int getB() { return b; }
			
			/**
			 * Obtiene el primer operando real.
			 * 
			 * @return minuendo (real).
			 */
			public double getC() { return c; }
			
			/**
			 * Obtiene el segundo operando real.
			 * 
			 * @return primer sustraendo (real).
			 */
			public double getD() { return d; }
			
			/**
			 * Obtiene el tercer operando real.
			 * 
			 * @return segundo sustraendo (real).
			 */
			public double getE() { return e; }
			
			/**
			 * Da un nuevo valor al minuendo entero.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param a nuevo valor del minuendo (entero).
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
			 * Da un nuevo valor al sustraendo entero.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param b nuevo valor del sustraendo (entero).
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
			 * Da un nuevo valor al minuendo real.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param c nuevo valor del minuendo (real).
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
			 * Da un nuevo valor al primer sustraendo real.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param d nuevo valor del primer sustraendo (real).
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
			 * Da un nuevo valor al segundo sustraendo real.
			 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
			 *  
			 * @param e nuevo valor del segundo sustraendo (real).
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
			
			// MÉTODOS ESTÁTICOS
			
			/**
			 * Sustracción de dos números enteros.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * 
			 * @param a minuendo (entero).
			 * @param b sustraendo (entero).
			 * @return retultado de la resta (entero).
			 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
			 */
			public static int resta(int a, int b) throws IllegalArgumentException {
				if (a < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				if (b < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				return a - b;
			}
			
			/**
			 * Sustracción de dos números reales.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * 
			 * @param a minuendo (real).
			 * @param b sustraendo (real).
			 * @return resultado de la resta (real).
			 */
			public static double resta(double a, double b) throws IllegalArgumentException {
				if (a < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				if (b < 0.0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (b == 0.0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				return a - b;
			}
			
			/**
			 * Sustracción de tres números reales.
			 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
			 * 
			 * @param a minuendo (real).
			 * @param b primer sustraendo (real).
			 * @param c segundo sustraendo (real).
			 * @return resultado de la suma (real).
			 */
			public static double resta(double a, double b, double c) throws IllegalArgumentException {
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
				return a - b - c;
			}
			
			/**
			 * Se sustrae el sustraendo (el valor que se va acumulando tras cada llamada a la función) al minuendo (parámetro de entrada).
			 * En caso de introducirse un parámetro nulo o negativo, se mostrará un mensaje de error.
			 * 
			 * @param a minuendo (entero).
			 * @return resultado de la resta (entero).
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public static int resta(int a) throws IllegalArgumentException {
				if (a < 0) 
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (a == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				acu = a - acu;
				return acu;
			}
			
			/**
			 * Devuelve el valor de la variable acumulada.
			 * 
			 * @return cantidad acumulada.
			 */
			public static int getAcu() { return acu; }
			
			/**
			 * Cambio de valor de la variable de acumulación.
			 * En caso de introducirse un parámetro nulo o negativo, se mostrará un mensaje de error.
			 * 
			 * @param newAcu nuevo valor para la variable de acumulación.
			 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
			 */
			public static void setAcu(int newAcu) throws IllegalArgumentException { 
				if (newAcu < 0)
					throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
				else if (newAcu == 0)
					throw new IllegalArgumentException("No se pueden introducir operandos nulos");
				else
					acu = newAcu; 
			}
			
			/**
			 * Reseteo de la variable de acumulación a 0.
			 */
			public static void resetAcu() { acu = 0; }
}
