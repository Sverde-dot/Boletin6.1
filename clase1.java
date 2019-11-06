
package boletin.pkg6.pkg1;

import java.util.Scanner;


public class clase1 {
    Scanner sc=new Scanner(System.in);
    private int edad;

    public clase1(){
    }

   public clase1(int edad){
        this.edad=edad;
    }
    
    public void setedad(){
        this.edad=edad;
    }
        public int getedad(){
        return edad; 
    }
    public void Paso(int años){
        if (años>=0)
            System.out.println("numero valido");
        else
            System.out.println("numero NO valido");
    } 
    public int pedirInt(){
       //Scanner sc=new Scanner(System.in);
       System.out.println("El numero es: ");
       int ed=sc.nextInt();
       return ed;
    }
}

