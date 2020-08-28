package codility;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio;
		aleatorio=(int) (Math.random()* ((Math.pow(2, 21))-9.7152)+1);
		System.out.println(" Aleatorio: " + aleatorio);
		Espacios_binario binarioUno= new Espacios_binario(aleatorio);
		binarioUno.establece_binario();
		System.out.println( binarioUno.dame_datos());
		
	}

}
