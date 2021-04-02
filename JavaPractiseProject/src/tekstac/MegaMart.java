package tekstac;

import java.util.Scanner;

public class MegaMart {
	static int c=100;
	static double d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		  System.out.println("Enter the Customer Id");
		  int s1 = in .nextInt();
		  System.out.println("Enter the Bill amount");
		  double s2 = in .nextDouble();
		 if((s1<=1)||(s1==0))
			 System.out.println(s1+" is not a valid Customer Id");
		  if ((s2<1)||(s2==0))
			 System.out.println(s1+" is not a valid Bill Amount");
		  if(s2<1000)
			  System.out.printf("Total Price is "+"%.2f",s2);
		  else if((s1>=1)&&(s1<=100))
		  {
		  int a=15;
		  double b=s2/c;
		  double e=b*a;
		   d=s2-e;
		  System.out.printf("Total Price is "+"%.2f",d);
		  }else if((s1>=101)&&(s1<=250))
		  {
		  int a=18;
		  double b=s2/c;
		  double e=b*a;
		  d=s2-e;
		  System.out.printf("Total Price is "+"%.2f",d);
		  }else if((s1>=251)&&(s1<=500))
		  {
		  int a=23;
		  double b=s2/c;
		  double e=b*a;
		  d=s2-e;
		  System.out.printf("Total Price is "+"%.2f",d);
		  }else if((s1>=501)&&(s1<=1000))
		  {
		  int a=28;
		  double b=s2/c;
		  double e=b*a;
		  d=s2-e;
		  System.out.printf("Total Price is "+"%.2f",d);
		  }else if((s1>1000))
		  {
		  int a=32;
		  double b=s2/c;
		  double e=b*a;
		  d=s2-e;
		  System.out.printf("Total Price is "+"%.2f",d); 
		  }
		  
	}

}
