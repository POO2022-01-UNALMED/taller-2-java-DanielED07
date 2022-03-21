package test;
public class Asiento {
	
	String color;
	int precio;
	int registro;
	
	String[] colores = {"rojo","verde","amarillo","negro","blanco"};
	
	void cambiarColor( String color) {
		
		for (String col : colores) {
			if (col== color) {
				this.color = color;
				break;
			}else 
				System.out.println("Color no disponible");
		}
	}

}
