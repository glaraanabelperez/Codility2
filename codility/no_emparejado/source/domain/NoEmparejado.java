package domain;

public class NoEmparejado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd_array prueba1=new Odd_array();
		prueba1.llenar_array();
		System.out.println(" ");
		prueba1.dame_array();
        prueba1.dame_no_emparejado();		
	}

}
//    Random_No = Min + (int)(Math.Random()*((Max-Min)+1))

 class Odd_array{
	 private int[] array;
	 private int i;
	 private int num;
	 private int numOcupado;
	 
	 public Odd_array() {
		 array=new int[7];
	 }
	 
	 public void construccion_num() {
		 int max=21;
		 num=(int)Math.floor(Math.random()*22+2);
		 if(num%2==0) {
			 if(max%2==0 && num==max) {
				 num=num-1;
			 }
			 else {
				 num=num+1;
			 }
		 }
	 }
	 
	 public void dame_array() {
		 for(i=0; i<array.length; i++) {
			 System.out.print("["+ i + "] = " + array[i] + " " + " / ");
		 }
	 }
	 public void llenar_array() {
		 numOcupado=0+(int)(Math.random()*(((array.length-1)-0)+1));
		 construccion_num();
		 array[numOcupado]=num;
		 int num0=array[numOcupado];
		 System.out.println("Array ocupado, " + "[ " + numOcupado + "] = " + array[numOcupado]);
		 for(i=0; i<array.length-1; i++) {
			 construccion_num();
			 while(num0==num) {
				construccion_num();
			 }
			 if(i==numOcupado){
				 i=i+1;  
			 }
			 array[i]=num;
			 i=i+2;
			 if(i==numOcupado){
				 i=i+1;
			 }
				 array[i]=num;
		 }

	} 
	
	public void dame_no_emparejado(){
	    boolean emparejado=false;
	    int i;
	    int no_emp=0;
	    for(i=0; i<array.length; i++){
	        int e=i++;
	        while(e<array.length){
	            if(array[i]==array[e]){
	                emparejado=true;
	            }
	        }
	        if(!emparejado){
	            no_emp=array[i];
	            	    System.out.print("No emparejado= " + no_emp);
	        }
	    }
	    System.out.print("No emparejado= ");
	}
	 
}
	 
