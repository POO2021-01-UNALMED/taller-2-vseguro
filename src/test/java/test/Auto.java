package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	Asiento registroAsiento[];
	Motor registroMotor[];
	Auto registroAuto[];
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos() {
		int cont = 0;
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				cont = cont + 1;
			}
		}
		return cont;
	}


	
	String verificarIntegridad() {
		int conta=0;
		for (int i = 0; i < cantidadCreados;i++) {
			if ((registroAsiento!=null) && (registroMotor!=null) && (registroAuto!=null)){
				if ((registroAsiento[i].equals(registroMotor[i]))&&(registroAsiento[i].equals(registroAuto[i]))&&
						(registroAuto[i].equals(registroMotor[i]))){
					conta=0;
				} else {
					conta= conta+1;
				}
			}
			
			}
		if (conta==0) {
			return "Auto original";
		} else {
			return "Las piezas no son originales";
		}
	}
}
