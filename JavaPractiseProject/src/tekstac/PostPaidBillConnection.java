package tekstac;

import java.util.Scanner;

public class PostPaidBillConnection {
	static double a=5.5;
	  static double b=100, c=150;
	  static double  d,e;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		  System.out.println("Enter the number of calls:");
		  int s1 = in .nextInt(); 
		  if(s1<=0)
		  {
			  System.out.println(s1+"is an invalid input");
			 
		  }
		  
		  System.out.println("Enter the number of SMS:");
		  int s2 = in .nextInt();
		 
		  if(s2>1000)
			  System.out.println(s2+"exceeds the maximum limit");
		  if((s1<=100)&&(s2<=100))
		  {
			d=a/b*c;
			e=d+c;
			System.out.println(e);
		  }else if((s1>100)&&(s2>100))
		  {
			  double i=1.5, j=0.5;
			  double f=(s1-b)*i;
			  double g=(s2-b)*j;
			 
			  	d=a/b*c;
				e=d+c;
				double k;
				k=e+(f+g);
				
			  System.out.println("Amount to be paid is Rs. "+k);
			 
			  
		  }
			  
		  

	}

}
