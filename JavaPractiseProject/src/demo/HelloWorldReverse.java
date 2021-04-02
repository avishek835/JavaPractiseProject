package demo;

public class HelloWorldReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		String st="Avishek";
		StringBuilder hw=new StringBuilder(st);
		System.out.println(hw.reverse());
		
		System.out.println(st.charAt(6));
		 StringBuffer a =new StringBuffer("Avishek");
				System.out.println(a.reverse());
				System.out.println("--->");
				int n=121;
				if(n%2==0)
				{
				System.out.println("even");	
				}else
					System.out.println("odd");
				
				System.out.println(10+20+"Avi");
				System.out.println("Avi"+10+20);
	}

}

 class Test   
{  
	 int x=2;
    Test(int a, int b)  
    {  
    	x=4;
    	System.out.println(x);
        System.out.println("a = "+a+" b = "+b);  
    }  
    Test(int a, float b)  
    {  
        System.out.println("a = "+a+" b = "+b);  
    }  
    public static void main (String[] args)  
    {  
        byte a = 10;   
        byte b = 15;  
        Test test = new Test(a,b);  
    }  
}  
 
 class A2{  
	  static{System.out.println("static block is invoked");}  
	  public static void main(String[] args){  
	   System.out.println("Hello main");  
	  }  
	}  
 
 class OverloadingCalculation3{    
	  void sum(int a,long b){System.out.println("a method invoked");}    
	  void sum(long a,int b){System.out.println("b method invoked");}    
	    
	  public static void main(String[] args){    
	  OverloadingCalculation3 obj=new OverloadingCalculation3();    
	  //obj.sum(20,20);//now ambiguity    
	  }    
	}    