package tekstac;

import java.util.*;

public class TriangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		  System.out.print("Input side1: ");
		  int s1 = in .nextInt(); 
		 if(s1==0)
		 {
			 System.out.println("0 is an Invalid Length"); 
			 System.exit(0);
		 } else if (s1<=0){
		     System.out.println(s1+" is an Invalid Length");
		     System.exit(0);
		 }
		 
		  System.out.print("Input side2: ");
		  int s2 = in .nextInt();
		  if(s2==0)
			 {
				 System.out.println("0 is an Invalid Length"); 
				 System.exit(0);
			 }else if (s2<=0){
		     System.out.println(s2+" is an Invalid Length");
		     System.exit(0);
		 }
		  System.out.print("Input side3: ");
		  int s3 = in .nextInt();
		  
		  if(s3==0)
			 {
				 System.out.println("0 is an Invalid Length"); 
				 System.exit(0);
			 }else if (s3<=0){
		     System.out.println(s3+" is an Invalid Length");
		     System.exit(0);
		 }
		 // System.out.print("Is the said sides form a triangle: " + isValidTriangle(s1, s2, s3));
		 
		  if((s1==0)||(s2==0)||(s3==0))
		  {
			 System.out.println("0 is an Invalid Length"); 
			 
			 
		  }else if((s1==s2)&&(s2==s3)&&(s1==s3))
		  	{
			 // System.out.printf("%d,%d,%d",s1,s2,s3 +"are the sides of Equilateral Triangle");
			  System.out.println(s1+","+s2+","+s3+""+"are the sides of Equilateral Triangle");
		  	}else if((s1==s2)||(s1==s3)||(s2==s3))
		  	{
		  		System.out.println(s1+","+s2+","+s3+""+"are the sides of Isosceles Triangle");
		  	}else if((s1!=s2)&&(s2!=s3)&&(s1!=s3))
		  	{
		  		System.out.println(s1+","+s2+","+s3+""+"are the sides of Scalene Triangle");
		  	}
	}

}
