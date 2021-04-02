package tekstac;
import java.util.Scanner;

public class CalculateFood {

	
	public static void main(String[] args) {

	int totalprice;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the no of pizzas bought:" +" ");
	int i = sc.nextInt();
	
	System.out.print("Enter the no of puffs bought:" +" ");

	int j = sc.nextInt();

	System.out.print("Enter the no of cool drinks bought:" +" ");

	int k = sc.nextInt();

	
	System.out.println("Bill Details");
	System.out.println("No of pizzas " +i);
	System.out.println("No of puffs " +j);
	System.out.println("No of cool drinks " +k);
	i =Math.abs(i)*100;
	j =Math.abs(j)*20;
	k =Math.abs(k)*10;
	totalprice = i+j+k;
	System.out.println("Total Price " +totalprice);
	System.out.println("   "+"Enjoy the Show!!!"+"   ");

	}

	}

	