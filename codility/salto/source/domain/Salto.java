package domain;

public class Salto {

    public static void main(String[] args) {
        System.out.println("hello world!");
        int x=10, y=85, d=9999999, z=0;
        System.out.println("X= " + x +" Y= " + y + " D= " + d + " Z= " + z);
            z=(int)(y-x)/d;
            System.out.println(z);
            System.out.println((y-x) % d == 0 ? d*(z)+x : d*(z+1)+x);
            System.out.println((y-x) % d == 0 ? (y-x) / d : (y-x) / d + 1);
        
       // return (Y-X) % D == 0 ? (Y-X) / D : (Y-X) / D + 1;
    }

}
