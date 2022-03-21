package test;
public class Auto {
	
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    
   public int cantidadAsientos() {
	   int k=0;
	   for (Asiento i : asientos) {
   		if (i instanceof Asiento) {
   			k++;
   		}
   	       }
	  return k;
    }
    
    public String verificarIntegridad() {
    	
    	for (Asiento i : asientos) {
    		if(i.registro != this.registro || i.registro != this.motor.registro || this.registro != this.motor.registro) {
    			return "Las piezas no son originales";	
    	}
    
    }
    	return "Auto original";	
  }
}