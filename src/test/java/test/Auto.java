package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	Motor motor;
	String marca;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos() {	
		int cont = 0;
		for (int i = 0; i < asientos.length;i++) {
			if (asientos[i]!=null) {
				cont=cont+1;
			}
		}
		return cont;
	}


	
	String verificarIntegridad() {
		int conta1=0;
		int conta2=0;
		if (motor.registro==registro) {
			conta1=0;
		}
		for (int i = 0; i < asientos.length;i++) {
			if (asientos[i]!=null) {
			if ((asientos[i].registro!=(registro))){
				conta2=conta2+1;
			}
		}
		}
		if (conta1==0 && conta2==0){
			return "Auto original";
			
		}else {
			return "Las piezas no son originales";
		
		}
				

	}
}
