package tekstac;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("");
		  long s1 = in.nextLong();
		  long s0=s1;
		  long count=0, rem;
		  int counter = 0;
		  System.out.println("");
		  long s2 = in.nextLong();
		 	
		  if(s2>9)//45 is not valid
			  System.out.println(s2+" is not valid");
		  else if(s0<0)//-1 falls behind the limit
		  {
			  System.out.println(s0+" falls behind the limit");
		  }
		  //System.out.println(counter);
		  
		  else if(s0!=0)
		  {
			  while(s0>10)
			  {
				  
				  rem=s0%10;
				  if(rem==s2)
				  	{
					  count++;
				  	}
				  s0=s0/10;
			  }
			  if(s0==s2) 
			  	{
				  count++;
				}
			  System.out.println("Count of "+s2+" in "+s1+" is "+count);
			 
			
			 }
		  
		
		}
	
}

//Count of 6 in 56164 is 2
		//8 is not available in 754231
	  
//	           
//		  }
//		
//		
//		else
//		{
//			System.out.println(s2+" is not available in "+s1);
//		}
		  /*else if(s0 != 0)//8342312389 exceeds the limit
		  {
			  s0 /= 10;
			  ++count;
	            System.out.println(s1+" exceeds the limit");
		  }*/
	/* if(count>7) {
			  for(; s0 != 0; s0/=10, ++counter) {   
		        }
			  	
		        System.out.println(s1+" exceeds the limit");
	            System.out.println(counter);*/
