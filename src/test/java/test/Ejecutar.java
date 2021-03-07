package test;

public class Ejecutar {

	public static void main(String[] args) {
		Asiento asiento1 = new Asiento();
		Motor motor1= new Motor();
		asiento1.color="azul";
		asiento1.cambiarColor("amarillo");
		System.out.println(asiento1.color);
		motor1.tipo="basura";
		motor1.asignarTipo("electrico");
		System.out.println(motor1.tipo);
		
	}

}
