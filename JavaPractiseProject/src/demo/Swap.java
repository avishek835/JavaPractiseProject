package demo;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		
		//with using third variable
		/*int t;
		
		t=a;
		a=b;
		b=t;
		
		System.out.println(a);
		System.out.println(b);*/
		
		//without using third variable
		
		/*a=a+b;//30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println(a);
		System.out.println(b);*/
		
		/*a=a*b;//200
		b=a/b;//10
		a=a/b;//20
		
		System.out.println(a);
		System.out.println(b);*/
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
		
		

	}

}

 class Username{
	 
	 
    public static void main (String[] args) {
    	
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an Username: ");
        String s=input.next();
        
        System.out.println("Username"+s);
    }
}

 
class Customer{
	 
	
	 static int num;
    public static void main (String[] args) {
    	
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("Enter your name: ");
        String s1=input.nextLine();
        
               
        System.out.println("Enter age: ");
        num=input.nextInt();
        
        Scanner g=new Scanner(System.in);  

        
        System.out.println("Enter gender: ");   
        String s2=g.nextLine();
       
        Scanner s=new Scanner(System.in);
        System.out.println("Hailing from: ");   
        String s3=s.nextLine();
        
        System.out.println("Welcome, "+s1);
        System.out.println("Age:"+num);
        System.out.println("Gender:"+s2);
        System.out.println("City:"+s3);
       
        input.close();
        g.close();
        s.close();
    }
}


class CustomerOne{
	 
	static String s1,s2,s3;
	 static int num;
   public static void main (String[] args) {
   	
       Scanner input=new Scanner(System.in);
       System.out.println("Enter your name: ");
       s1=input.nextLine();
       System.out.println("Enter age: ");
       num=input.nextInt();
       System.out.println("Enter gender: "); 
       s2=input.next();
       input.nextLine();
       System.out.println("Hailing from: ");              
       s3=input.nextLine();
       
       
        System.out.println("Welcome, "+s1);
        System.out.println("Age:"+num);        
        System.out.println("Gender:"+s2);
        System.out.println("City:"+s3);
      
       
         
       input.close();
      
   }
}


