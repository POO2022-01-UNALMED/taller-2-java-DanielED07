package test;
public class Auto {
	
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;
    
    
   public int cantidadAsientos(Auto auto) {
	   int k=0;
	   for (Asiento i : auto.asientos) {
   		if (i instanceof Asiento) {
   			k++;
   		}
   	       }
	  return k;
    }
    
    public String verificarIntegridad(Auto auto) {
    	
    	for (Asiento i : auto.asientos) {
    		if(i.registro != auto.registro || i.registro != auto.motor.registro || auto.registro != auto.motor.registro) {
    			System.out.println("Las piezas no son originales");
    			break;
    		}else 
    			System.out.println("Auto original");
    	}
    	
    	
    	
    }

}
