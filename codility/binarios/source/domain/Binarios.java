package domain;

public class Binarios {

    public static void main(String[] args) {
        System.out.println("hello world!");
        int aleatorio;
        int e;
        int contador=0;
        int contadorMax=0;
        boolean activado=false;
		aleatorio=1041;
        while(aleatorio>0) {
                e=aleatorio%2;
    			aleatorio=aleatorio/2;
    			System.out.println(" resultado/ " + aleatorio);
    		    System.out.println(" Resto " + e);
    		    System.out.println(" contador max " + contadorMax);
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
				System.out.println(" resultado/ " + aleatorio);
		        System.out.println(" Resto " + e);
		        System.out.println(" contador max " + contadorMax);
		} 
		
		System.out.println(" contador " + contadorMax);

    }

}
