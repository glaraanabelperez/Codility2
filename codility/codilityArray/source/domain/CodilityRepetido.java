package domain;

public class CodilityRepetido {

    public static void main(String[] args) {
        System.out.println("hello world!");
       // int extension;
        int numeros;
        int ciclos=0;
        int i=0;
        boolean repetido=false;

       // extension=(int)(Math.random()*(12-2)+2);
        int array[]=new int[4];
       // System.out.println(extension);
         //       for(i=0; i<array.length; i++){
           //         numeros=(int)(Math.random()*(20-1)+1);
             //       if(array[i]==numeros){
               //         repetido=true;
                 //   }else{
                   //     array[i]=numeros;
                     //   repetido=false;
                    //}
                //}
            array[0]=2;array[1]=3; array[2]=7; array[3]=9;
            for(i=0;i<array.length;i++){
                System.out.print("[ " + array[i] +" " + " ]" + " ");
            }
            int ultimo=array[array.length-1];
                            array[0]=ultimo;
                System.out.print("[ " + array[0] +" " + " ]" + " ");

            for(i=0;i<array.length-1;i++){
                array[i]=array[i+1];
                System.out.print("[ " + array[i] +" " + " ]" + " ");

            }


            
}
    
}
