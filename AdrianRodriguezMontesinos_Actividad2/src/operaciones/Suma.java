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
	private static int acu;
	
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
		public Suma() {}
		
		/**
		 * Construye un objeto de clase Suma con dos sumandos enteros. 
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * Inicializa el resto de los atributos a 0.
		 * 
		 * @param a primer operando entero. 
		 * @param b segundo operando entero.
		 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
		 */
		public Suma(int a, int b) throws IllegalArgumentException {}
		
		/**
		 * Construye un objeto de clase Suma con dos sumandos reales.
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * Inicializa el resto de los atributos a 0.
		 * 
		 * @param c primer operando real.
		 * @param d segundo operando real.
		 * @throws IllegalArgumentException saltará en caso de que algún parámetro de entrada sea nulo o negativo.
		 */
		public Suma(double c, double d) throws IllegalArgumentException {}
		
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
		public Suma(double c, double d, double e) throws IllegalArgumentException {}
		
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
		public Suma(int a, int b, double c, double d, double e) throws IllegalArgumentException {}
		
		
		
		// MÉTODOS NO ESTÁTICOS
		
		/**
		 * Realiza la suma de los dos sumandos enteros.
		 * 
		 * @return resultado de la adición (entero).
		 */
		public int sumaEnteros() {}
		
		/**
		 * Realiza la suma de dos de los sumandos reales.
		 * 
		 * @return resultado de la adición (real).
		 */
		public double suma2Reales() {}
		
		/**
		 * Realiza la suma de los tres sumandos enteros.
		 * 
		 * @return resultado de la adición (real).
		 */
		public double suma3Reales() {}
		
		/**
		 * Realiza la suma del primer operando entero con el número acumulado de la llamada a esta función.
		 * 
		 * @return resultado de la adición con el acumulador (entero).
		 */
		public int sumaAcu() {}
		
		/**
		 * Obtiene el primer operando entero.
		 * 
		 * @return primer sumando (entero).
		 */
		public int getA() {}
		
		/**
		 * Obtiene el segundo operando entero.
		 * 
		 * @return segundo sumando (entero).
		 */
		public int getB() {}
		
		/**
		 * Obtiene el primer operando real.
		 * 
		 * @return primer sumando (real).
		 */
		public double getC() {}
		
		/**
		 * Obtiene el segundo operando real.
		 * 
		 * @return segundo sumando (real).
		 */
		public double getD() {}
		
		/**
		 * Obtiene el tercer operando real.
		 * 
		 * @return tercer sumando (real).
		 */
		public double getE() {}
		
		/**
		 *  Da un nuevo valor al primero operando entero.
		 *  En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
		 *  
		 * @param a nuevo valor del primer sumando (entero).
		 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
		 */
		public void setA(int a) throws IllegalArgumentException {}
		
		/**
		 * Da un nuevo valor al segundo operando entero.
		 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
		 *  
		 * @param b nuevo valor del segundo sumando (entero).
		 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
		 */
		public void setB(int b) throws IllegalArgumentException {}
		
		/**
		 * Da un nuevo valor al primer operando real.
		 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
		 *  
		 * @param c nuevo valor del primer sumando (real).
		 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
		 */
		public void setC(double c) throws IllegalArgumentException {}
		
		/**
		 * Da un nuevo valor al segundo operando real.
		 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
		 *  
		 * @param d nuevo valor del segundo sumando (real).
		 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
		 */
		public void setD(double d) throws IllegalArgumentException {}
		
		/**
		 * Da un nuevo valor al tercer operando real.
		 * En caso de introducirse un parámetro negativo, se mostrará un mensaje de error.
		 *  
		 * @param e nuevo valor del tercer sumando (real).
		 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo negativo.
		 */
		public void setE(double e) throws IllegalArgumentException {}
		
		
		
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
		public static int suma(int a, int b) throws IllegalArgumentException {}
		
		/**
		 * Adición de dos números reales.
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * 
		 * @param a primer sumando (real).
		 * @param b segundo sumando (real).
		 * @return resultado de la suma (real).
		 */
		public static double suma(double a, double b) throws IllegalArgumentException {}
		
		/**
		 * Adición de tres números reales.
		 * En caso de introducirse parámetros nulos o negativos, se mostrará un mensaje de error.
		 * 
		 * @param a primer sumando (real).
		 * @param b segundo sumando (real).
		 * @param c tercer sumando (real).
		 * @return resultado de la suma (real).
		 */
		public static double suma(double a, double b, double c) throws IllegalArgumentException {}
		
		/**
		 * Adición del sumando con el valor que se va acumulando tras cada llamada a la función.
		 * En caso de introducirse un parámetro nulo o negativo, se mostrará un mensaje de error.
		 * 
		 * @param a sumando (entero).
		 * @return resultado de la suma (entero).
		 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
		 */
		public static int suma(int a) throws IllegalArgumentException {}
		
		/**
		 * Devuelve el valor de la variable acumulada.
		 * 
		 * @return cantidad acumulada.
		 */
		public static int getAcu() {}
		
		/**
		 * Cambio de valor de la variable de acumulación.
		 * En caso de introducirse un parámetro nulo o negativo, se mostrará un mensaje de error.
		 * 
		 * @param newAcu nuevo valor para la variable de acumulación.
		 * @throws IllegalArgumentException saltará en caso de que el parámetro de entrada sea nulo o negativo.
		 */
		public static void setAcu(int newAcu) throws IllegalArgumentException {}
		
		/**
		 * Reseteo de la variable de acumulación a 0.
		 */
		public static void resetAcu() {}
	
}
