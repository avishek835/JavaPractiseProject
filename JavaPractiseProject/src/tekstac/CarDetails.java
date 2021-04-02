package tekstac;

import java.text.DecimalFormat;
import java.util.Scanner;
class CarDetails{
    static String str;
    static int num;
    static double price;
    public static void main (String[] args) {
        /* code */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the car name:");
        str=in.nextLine();
        
        System.out.println("Enter the car no:");
        num=in.nextInt();
        
       
        System.out.println("Enter the price:");
        price=in.nextDouble();
        
        System.out.println("Car name:"+str);
        System.out.println("Car no:"+num);
      //  System.out.println("Price:"+price+" rs only");
        System.out.println("Price:"+new DecimalFormat("0.00").format(price)+" rs only");
        in.close();
    }
}
