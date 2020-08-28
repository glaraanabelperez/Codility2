package codility;

public class Espacios_binario {
	private int aleatorio;
	private int e;
	private int contador;
	private int contadorMax;
	StringBuilder binario;	
	private boolean activado;
	
	public Espacios_binario(int aleatorio) {
		this.aleatorio=aleatorio;
		binario = new StringBuilder();
		activado=false;
	}
	
	public void establece_binario() {
        while(aleatorio>0) {
                e=aleatorio%2;
    			aleatorio=aleatorio/2;
    			binario.insert(0, String.valueOf(e));
    			if(e==1) {
    			    activado=true;
    			    contador=0;
    			}		
    			if(e==0 && activado==true){
    				contador++;
    				if(contador>contadorMax) {
								contadorMax=contador;
							}
    				}
		} 
	}
		
	public String dame_datos() {
		return  " Binario: " +  binario.toString() +  " El contador Maximo:  " + contadorMax;
		
	}
	
}
