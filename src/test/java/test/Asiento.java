package test;

public class Asiento {
	String color;
	int precio;
	static int registro;
	
	String cambiarColor(String color) {
		if ((color!="rojo")||(color!="verde")||(color!="amarillo")||(color!="negro")||
				(color!="blanco")){ 
			return cambiarColor(color);
		}
		else {
			return this.color;
		}
	}
}
