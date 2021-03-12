package test;
import operaciones.*;

public class TestOperaciones {

	public static void main(String[] args) {
		Suma s = new Suma(2,3);
		Producto p = new Producto(3,4);
		System.out.println("El resultado de la suma es: " + s.sumaEnteros());
		System.out.println("El resultado del producto es: " + p.productoEnteros());
		
	}

}
