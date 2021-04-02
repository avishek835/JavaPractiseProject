package tekstac;
import java.util.Scanner;
public class Restaurant {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter the day interval of Sam");
		  int s1 = in .nextInt();
		  System.out.println("Enter the day interval of Riya");
		  int s2 = in .nextInt();
		  if((s1<0)||(s2<0))
			  System.out.println(s1+" to "+s2+" is not a valid interval");
		  
		  
		  else {
		  int lcm;
		      lcm = (s1 > s2) ? s1 : s2;
		      
	        while(true)
	        {
	            if( lcm % s1 == 0 && lcm % s2 == 0 )
	            {
	                System.out.println("Sam and Riya will have their dinner on day " +lcm);
	                break;
	            }
	            ++lcm;
	        }
	}
	}

}
