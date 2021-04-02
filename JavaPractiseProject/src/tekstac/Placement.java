package tekstac;

import java.util.Scanner;

public class Placement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int c,e,m;
		System.out.println("Enter the no of students placed in CSE:");
		c=sc.nextInt();
		System.out.println("Enter the no of students placed in ECE:");
		e=sc.nextInt();
		System.out.println("Enter the no of students placed in MECH:");
		m=sc.nextInt();
		if((c==e)&&(e==m))
			System.out.println("None of the department has got the highest placement");
		else if(c<0||e<0||m<0)
			System.out.println("Input is invalid");
		else {
			System.out.println("Highest placement");
			if((c>=e)&&(c>=m))
			{
				if(c==e)
				{
					System.out.println("CSE"+"\nECE");
				}
				else if(c==m)
				{
					System.out.println("CSE"+"\nMECH");
				}else
					System.out.println("CSE");
			}
			else if(e>=m)
			{
				if(e==m)
					System.out.println("ECE"+"\nMECH");	
				else 
				System.out.println("ECE");
			}
			else 
				System.out.println("MECH");
		
	}
	}

}
