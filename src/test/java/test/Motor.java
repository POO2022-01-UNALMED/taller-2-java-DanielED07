package test;

public class Motor {
	
	int numeroCilindros;
	String tipo;
	int registro;
	
	String[] motores = {"electrico","gasolina"};
	
	void cambiarRegistro(int newregistro) {
		this.registro = newregistro;
	}
	
	void asignarTipo(String tipo) {
		for (String motor : motores) {
			if (motor== tipo) {
				this.tipo = tipo;
				break;
			}else 
				System.out.println("Tipo de motor no disponible");
		}
	}

}
