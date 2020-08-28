package domain;

public class NOEmparejado2 {

    public static void main(String[] args) {
        System.out.println("hello world!");
        int []array=new int[5];
        array[0]=8;
        array[1]=3;
        array[2]=7;
        array[3]=3;
        array[4]=8;
	    boolean emparejado=false;
	    int i,e, num, no_emp=0, cont=0;
	    for(i=0; i<array.length; i++){
	       num=i;
	       System.out.println(" num= " + num );
	       for(e=0; e<array.length; e++){
    	        if(e!=num){
    	           cont++;
    	           	       System.out.print(" cont= " + cont + " ");

    	           if(array[num]==array[e]){
    	               emparejado=true;
    	           }
    	           System.out.print(" array= " + array[num] + "/" + array[e] + " emparejado " + emparejado);
    	           System.out.println(" ");
    	        }
    	        if(cont==array.length-1){
    	           cont=0;
    	           if(emparejado==true){emparejado=false;}else{
    	               no_emp=array[num];
    	                }
    	        }
	        }
	    }
	   System.out.print(" no= " + no_emp);
	}

}
