package operaciones;

/**
 * Proporciona los métodos necesarios para realizar la adición de números enteros y reales.
 * 
 * @author Adrian Rodriguez Montesinos.
 * @version 1.0
 * @see Resta
 * @since 23-2-2021.
 *
 */
public class Suma {

	// ATRIBUTOS
	
	
		/**
		 * Variable acumuladora (entera) requerida en el método que realiza la suma con acumulación.
		 */
		private static int acu = 0;
		
		/**
		 * Primer sumando entero. Se trata de un entero positivo.
		 */
		private int a;
		
		/**
		 * Segundo sumando entero.Se trata de un entero positivo.
		 */
		private int b;
		
		/**
		 * Primer sumando real. Se trata de un real positivo.
		 */
		private double c;
		
		/**
		 * Segundo sumando real. Se trata de un real positivo.
		 */
		private double d;
		
		/**
		 * Tercer sumando real. Se trata de un real positivo.
		 */
		private double e;
		
		// CONSTRUCTORES
		
		/**
		 * Constructor por defecto (asigna valores nulos a los atributos).
		 */
		public Suma() {
			a = 0;
			b = 0;
			c = 0.0;
			d = 0.0;
			e = 0.0;
		}
		
		/**
		 * Construye un objeto de clase Suma con dos sumandos enteros. 
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * Inicializa el resto de los atributos a 0.
		 * 
		 * @param a primer operando entero. 
		 * @param b segundo operando entero.
		 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
		 */
		public Suma(int a, int b) throws IllegalArgumentException {
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
			c = 0.0f;
			d = 0.0f;
			e = 0.0f;
		}
		
		/**
		 * Construye un objeto de clase Suma con dos sumandos reales.
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * Inicializa el resto de los atributos a 0.
		 * 
		 * @param c primer operando real.
		 * @param d segundo operando real.
		 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
		 */
		public Suma(double c, double d) throws IllegalArgumentException {
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
			e = 0.0f;
		}
		
		/**
		 * Construye un objeto de clase Suma con tres sumandos reales.
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * Inicializa el resto de los atributos a 0.
		 * 
		 * @param c primer operando real.
		 * @param d segundo operando real.
		 * @param e tercer operando real.
		 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
		 */
		public Suma(double c, double d, double e) throws IllegalArgumentException {
			a = 0;
			b = 0;
			if (c < 0.0f)
				throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
			else if (c == 0.0)
				throw new IllegalArgumentException("No se pueden introducir operandos nulos");
			else
				this.c = c;
			if (d < 0.0f)
				throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
			else if (d == 0.0)
				throw new IllegalArgumentException("No se pueden introducir operandos nulos");
			else
				this.d = d;
			if (e < 0.0f)
				throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
			else if (e == 0.0)
				throw new IllegalArgumentException("No se pueden introducir operandos nulos");
			else
				this.e = e;
		}
		
		/**
		 * Construye un objeto de clase Suma con dos sumandos enteros y tres reales.
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * 
		 * @param a primer operando entero. 
		 * @param b segundo operando entero.
		 * @param c primer operando real.
		 * @param d segundo operando real.
		 * @param e tercer operando real.
		 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
		 */
		public Suma(int a, int b, double c, double d, double e) throws IllegalArgumentException {
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
		 * Realiza la suma de los dos sumandos enteros.
		 * 
		 * @return resultado de la adición (entero).
		 */
		public int sumaEnteros() { return a + b; }
		
		/**
		 * Realiza la suma de dos de los sumandos reales.
		 * 
		 * @return resultado de la adición (real).
		 */
		public double suma2Reales() { return c + d; }
		
		/**
		 * Realiza la suma de los tres sumandos enteros.
		 * 
		 * @return resultado de la adición (real).
		 */
		public double suma3Reales() { return c + d + e; }
		
		/**
		 * Realiza la suma del primer operando entero con el número acumulado de la llamada a esta función.
		 * 
		 * @return resultado de la adición con el acumulador (entero).
		 */
		public int sumaAcu() { 
			acu += a;
			return acu; 
		}
		
		/**
		 * Obtiene el primer operando entero.
		 * 
		 * @return primer sumando (entero).
		 */
		public int getA() { return a; }
		
		/**
		 * Obtiene el segundo operando entero.
		 * 
		 * @return segundo sumando (entero).
		 */
		public int getB() { return b; }
		
		/**
		 * Obtiene el primer operando real.
		 * 
		 * @return primer sumando (real).
		 */
		public double getC() { return c; }
		
		/**
		 * Obtiene el segundo operando real.
		 * 
		 * @return segundo sumando (real).
		 */
		public double getD() { return d; }
		
		/**
		 * Obtiene el tercer operando real.
		 * 
		 * @return tercer sumando (real).
		 */
		public double getE() { return e; }
		
		/**
		 *  Da un nuevo valor al primero operando entero.
		 *  En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
		 *  
		 * @param a nuevo valor del primer sumando (entero).
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
		 * @param b nuevo valor del segundo sumando (entero).
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
		 * Da un nuevo valor al primer operando real.
		 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
		 *  
		 * @param c nuevo valor del primer sumando (real).
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
		 * @param d nuevo valor del segundo sumando (real).
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
		 * @param e nuevo valor del tercer sumando (real).
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
		 * Adición de dos números enteros.
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * 
		 * @param a primer sumando (entero).
		 * @param b segundo sumando (entero).
		 * @return retultado de la suma (entero).
		 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
		 */
		public static int suma(int a, int b) throws IllegalArgumentException {
			if (a < 0) 
				throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
			else if (a == 0)
				throw new IllegalArgumentException("No se pueden introducir operandos nulos");
			if (b < 0)
				throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
			else if (b == 0)
				throw new IllegalArgumentException("No se pueden introducir operandos nulos");
			return a + b;
		}
		
		/**
		 * Adición de dos números reales.
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * 
		 * @param a primer sumando (real).
		 * @param b segundo sumando (real).
		 * @return resultado de la suma (real).
		 */
		public static double suma(double a, double b) throws IllegalArgumentException {
			if (a < 0.0)
				throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
			else if (a == 0.0)
				throw new IllegalArgumentException("No se pueden introducir operandos nulos");
			if (b < 0.0)
				throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
			else if (b == 0.0)
				throw new IllegalArgumentException("No se pueden introducir operandos nulos");
			return a + b;
		}
		
		/**
		 * Adición de tres números reales.
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * 
		 * @param a primer sumando (real).
		 * @param b segundo sumando (real).
		 * @param c tercer sumando (real).
		 * @return resultado de la suma (real).
		 */
		public static double suma(double a, double b, double c) throws IllegalArgumentException {
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
			return a + b + c;
		}
		
		/**
		 * Adición del sumando con el valor que se va acumulando tras cada llamada a la función.
		 * En caso de introducirse un parámetro nulo o negativo, se mostrará un mensaje de error.
		 * 
		 * @param a sumando (entero).
		 * @return resultado de la suma (entero).
		 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
		 */
		public static int suma(int a) throws IllegalArgumentException {
			if (a < 0) 
				throw new IllegalArgumentException("La calculadora no permite introducir números negativos");
			else if (a == 0)
				throw new IllegalArgumentException("No se pueden introducir operandos nulos");
			acu += a;
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
