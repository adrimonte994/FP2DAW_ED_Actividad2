package test;
import operaciones.*;

public class TestOperaciones {

	public static void main(String[] args) {
		Suma s = new Suma(2,3);
		Producto p = new Producto(3,4);
		System.out.println("El resultado de la suma es: " + s.sumaEnteros());
		System.out.println("El resultado del producto es: " + p.productoEnteros());
		
		Resta r = new Resta(12, 5);
		Cociente c = new Cociente(10,2);
		System.out.println("El resultado de la resta es: " + r.restaEnteros());
		System.out.println("El resultado del cociente es: " + c.cocienteEnteros());
	}

}
