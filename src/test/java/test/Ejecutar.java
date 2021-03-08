package test;

public class Ejecutar {

	public static void main(String[] args) {
		Asiento asiento1 = new Asiento();
		Asiento asiento2= new Asiento();
		asiento1.registro=1;
		asiento2.registro=2;
		
		Motor motor1= new Motor();
		motor1.registro=1;
		asiento1.color="azul";
		asiento1.cambiarColor("amarillo");
		System.out.println(asiento1.color);
		motor1.tipo="basura";
		motor1.asignarTipo("electrico");
		System.out.println(motor1.tipo);
		//Auto.asientos= {1,2};
		System.out.println();
	}

}
