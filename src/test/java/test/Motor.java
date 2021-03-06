package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	int cambiarRegistro(int registro){
		this.registro = cambiarRegistro(registro);
		return registro;
	}
	
	String asignarTipo(String tipo) {
		if ((tipo!="electrico")||(tipo!="gasolina")) {
			return tipo;
		}
		else {
			return asignarTipo(tipo);
		}
	}

}
