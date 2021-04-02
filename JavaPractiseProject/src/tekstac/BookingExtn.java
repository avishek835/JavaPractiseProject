package tekstac;

import java.util.Scanner;

public class BookingExtn {

	static String s1, s2, s4;
	static double s3;
	static double airindiaCardPayment = 10.5, spicejetCardPayment = 7.5, goairCardPayment = 9.5,
			indigoCardPayment = 8.5;
	static double airindiaTravelClass = 3200, spicejetTravelClass = 3450, goairTravelClass = 3300, igTravelClass = 3490;
	static double airindiaEconomyClass = 6950, spicejetEconomyClass = 7945, goairEconomyClass = 7250,
			igEconomyClass = 7560;
	static double airindiaBusinessClass = 10340, spicejetBusinessClass = 9500, goairBusinessClass = 9890,
			igBusinessClass = 9990;
	static double spiceExtraDiscountTen = 10, spiceExtraDiscountFifteen = 15;
	static double goExtraDiscountTen=10, goExtraDiscountFifteen=15;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the flight name");
		s1 = in.nextLine();
		s1 = s1.toUpperCase();
		System.out.println("Enter the class");
		s2 = in.nextLine();
		s2 = s2.toUpperCase();
		System.out.println("Enter the number of seats");
		s3 = in.nextDouble();
		System.out.println("Card Payment");
		in.nextLine();
		s4 = in.nextLine();
		s4 = s4.toUpperCase();
		
		if (s1.equals("SPICE JET")) {
			if (s2.equals("TRAVEL CLASS") && (s4.equals("Y")&&((s3>5)&&(s3<10)))) {
				
					long sj = (long) ((spicejetTravelClass * s3)- (spicejetTravelClass * s3 * (spicejetCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountTen / 100)));
					System.out.println(sj);
				} 
				if (s2.equals("TRAVEL CLASS") && (s4.equals("Y")&&(s3>10))){
					long sj = (long) ((spicejetTravelClass * s3)- (spicejetTravelClass * s3 * (spicejetCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					System.out.println(sj);
				}
				if (s2.equals("TRAVEL CLASS") && (s4.equals("N")&&(s3>5)&&(s3<10))) {
				
					long sj = (long) ((spicejetTravelClass * s3));
					sj = (long) ((sj) - ((spiceExtraDiscountTen / 100)));
					System.out.println(sj);
				} 
				if(s2.equals("TRAVEL CLASS") && (s4.equals("N")&&(s3>10))) {
					long sj = (long) ((spicejetTravelClass * s3));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					System.out.println(sj);
					}
			

			if (s2.equals("ECONOMY CLASS") && (s4.equals("Y")&&(s3>5)&&(s3<10))) {
					long sj = (long) ((spicejetEconomyClass * s3)- (spicejetEconomyClass * s3 * (spicejetCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountTen / 100)));
					System.out.println("hello4");
					System.out.println(sj);
				}if (s2.equals("ECONOMY CLASS") && (s4.equals("Y")&&(s3>10))){
					long sj = (long) ((spicejetEconomyClass * s3)-(spicejetEconomyClass * s3 * (spicejetCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					System.out.println(sj);
				}
				if (s2.equals("ECONOMY CLASS") && (s4.equals("N")&&(s3>=5)&&(s3<10))) {
					long sj = (long) ((spicejetEconomyClass * s3));
					System.out.println(sj);
				}
				 if (s2.equals("ECONOMY CLASS") && (s4.equals("N")&&(s3>10))){
					long sj = (long) ((spicejetEconomyClass * s3));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					System.out.println(sj);
				}
				 
			if (s2.equals("BUSINESS CLASS") && (s4.equals("Y")&&(s3>=5)||(s3<5))) {
					long sj = (long) ((spicejetBusinessClass * s3)- (spicejetBusinessClass * s3 * (spicejetCardPayment / 100)));
					System.out.println(sj);
				} 
				 if (s2.equals("BUSINESS CLASS") && (s4.equals("Y")&&(s3>10))) {
					long sj = (long) ((spicejetBusinessClass * s3)- (spicejetBusinessClass * s3 * (spicejetCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					
					System.out.println(sj);
				}
			     if (s2.equals("BUSINESS CLASS") && (s4.equals("N")&&(s3>5))) {
				
					long sj1 = (long) ((spicejetBusinessClass * s3));
					sj1 = (long) ((sj1) - ((spiceExtraDiscountTen / 100)));
					
					System.out.println(sj1);
			}
				if (s2.equals("BUSINESS CLASS") && (s4.equals("N")&&(s3>10))) {
					long sj = (long) ((spicejetBusinessClass * s3));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					
					System.out.println(sj);
				}

			
		}
		
		
		if (s1.equals("INDIGO")) {
				if (s2.equals("TRAVEL CLASS") && (s4.equals("Y")&&((s3>5)&&(s3<10)))) {
				
					long sj = (long) ((igTravelClass * s3)- (igTravelClass * s3 * (indigoCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountTen / 100)));
					System.out.println(sj);
				} 
				if (s2.equals("TRAVEL CLASS") && (s4.equals("Y")&&(s3>10))){
					long sj = (long) ((igTravelClass * s3)- (igTravelClass * s3 * (indigoCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					System.out.println(sj);
				}
				if (s2.equals("TRAVEL CLASS") && (s4.equals("N")&&(s3>5)&&(s3<10))) {
				
					long sj = (long) ((igTravelClass * s3));
					sj = (long) ((sj) - ((spiceExtraDiscountTen / 100)));
					System.out.println(sj);
				} 
				if(s2.equals("TRAVEL CLASS") && (s4.equals("N")&&(s3>10))) {
					long sj = (long) ((igTravelClass * s3));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					System.out.println(sj);
					}
			

		if (s2.equals("ECONOMY CLASS") && (s4.equals("Y")&&(s3>5)&&(s3<10))) {
					long sj = (long) ((goairEconomyClass * s3)- (goairEconomyClass * s3 * (indigoCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountTen / 100)));
					System.out.println("hello4");
					System.out.println(sj);
				}if (s2.equals("ECONOMY CLASS") && (s4.equals("Y")&&(s3>10))){
					long sj = (long) ((goairEconomyClass * s3)-(goairEconomyClass * s3 * (indigoCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					System.out.println(sj);
				}
				if (s2.equals("ECONOMY CLASS") && (s4.equals("N")&&(s3>=5)&&(s3>=10))) {
					long sj = (long) ((goairEconomyClass * s3));
					sj = (long) ((sj)- ((sj*spiceExtraDiscountTen)/100));
					long a=2790;
					sj=sj+a;
					System.out.println(sj);
					
				}
				 if (s2.equals("ECONOMY CLASS") && (s4.equals("N")&&(s3>10))){
					long sj = (long) ((goairEconomyClass * s3));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					System.out.println("Hello2");
					System.out.println(sj);
				}
				 if (s2.equals("BUSINESS CLASS") && (s4.equals("Y")&&(s3>=5)||(s3<5))) {
					long sj = (long) ((igBusinessClass * s3)- (igBusinessClass * s3 * (indigoCardPayment / 100)));
					System.out.println(sj);
				} 
				 if (s2.equals("BUSINESS CLASS") && (s4.equals("Y")&&(s3>10))) {
					long sj = (long) ((igBusinessClass * s3)- (igBusinessClass * s3 * (indigoCardPayment / 100)));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					System.out.println(sj);
				}
		        if (s2.equals("BUSINESS CLASS") && (s4.equals("N")&&(s3>=5))) {
				
					long sj1 = (long) ((igBusinessClass * s3));
					sj1 = (long) ((sj1)- ((sj1*spiceExtraDiscountTen)/100));
					
					System.out.println(sj1);
					
					
			}
				if (s2.equals("BUSINESS CLASS") && (s4.equals("N")&&(s3>10))) {
					long sj = (long) ((igBusinessClass * s3));
					sj = (long) ((sj) - ((spiceExtraDiscountFifteen / 100)));
					
					System.out.println(sj);
					
				}

			
		}
		
		

		/*else if (s1.equals("INDIGO") && (s4.equals("Y")) || (s4.equals("N"))) {
			if (s2.equals("TRAVEL CLASS") && (s4.equals("Y"))) {
				if (s3 > 5) {
					long ig = (long) ((igTravelClass * s3)
							- (igTravelClass * s3 * (indigoCardPayment / 100)));
					ig = (long) ((ig) - (igTravelClass * s3 * (goExtraDiscountTen / 100)));
					System.out.println(ig);
				} else if (s3 > 10) {
					long ig = (long) ((igTravelClass * s3)
							- (igTravelClass * s3 * (indigoCardPayment / 100)));
					ig = (long) ((ig) - (igTravelClass * s3 * (goExtraDiscountFifteen / 100)));
					System.out.println(ig);
				}
			} else if (s2.equals("TRAVEL CLASS") && (s4.equals("N"))) {
				if (s3 > 5) {
					long ig = (long) ((igTravelClass * s3));
					ig = (long) ((ig) - (igTravelClass * s3 * (goExtraDiscountTen / 100)));
					System.out.println(ig);
				} else if (s3 > 10) {
					long ig = (long) ((igTravelClass * s3));
					ig = (long) ((ig) - (igTravelClass * s3 * (goExtraDiscountFifteen / 100)));
					System.out.println(ig);
				}
			}

			if (s2.equals("ECONOMY CLASS") && (s4.equals("Y"))) {
				if (s3 > 5) {
					long ig = (long) ((igEconomyClass * s3)
							- (igEconomyClass * s3 * (indigoCardPayment / 100)));
					ig = (long) ((ig) - (igEconomyClass * s3 * (goExtraDiscountTen / 100)));
					System.out.println(ig);
				}
				if (s3 > 10) {
					long ig = (long) ((igEconomyClass * s3)
							- (igEconomyClass * s3 * (indigoCardPayment / 100)));
					ig = (long) ((ig) - (igEconomyClass * s3 * (goExtraDiscountFifteen / 100)));
					System.out.println(ig);
				}
			} else if (s2.equals("ECONOMY CLASS") && (s4.equals("N"))) {
				if (s3 > 5) {
					long ig = (long) ((igEconomyClass * s3));
					//long ig = (long) ((igEconomyClass) - (igEconomyClass * s3 * (goExtraDiscountTen / 100)));
					 ig=(long) ((ig)-((igEconomyClass * s3)/(100*goExtraDiscountTen)));
					System.out.println(ig);
				}
				if (s3 > 10) {
					long ig = (long) ((igEconomyClass * s3));
					ig = (long) ((ig) - (igEconomyClass * s3 * (goExtraDiscountFifteen / 100)));
					System.out.println(ig);
				}
			}
			if (s2.equals("BUSINESS CLASS") && (s4.equals("Y"))) {
				if (s3 > 5) {
					long ig = (long) ((igBusinessClass * s3)
							- (igBusinessClass * s3 * (indigoCardPayment / 100)));
					ig = (long) ((ig) - (igBusinessClass * s3 * (goExtraDiscountTen / 100)));
					System.out.println(ig);
				} else if (s3 > 10) {
					long ig = (long) ((igBusinessClass * s3)
							- (igBusinessClass * s3 * (indigoCardPayment / 100)));
					ig = (long) ((ig) - (igBusinessClass * s3 * (goExtraDiscountFifteen / 100)));
					System.out.println(ig);
				}
			} else if (s2.equals("BUSINESS CLASS") && (s4.equals("N"))) {
				if (s3 > 5) {
					long ig = (long) ((igBusinessClass * s3));
					ig = (long) ((ig) - (igBusinessClass * s3 * (goExtraDiscountTen / 100)));
					System.out.println(ig);
					//89910/100*10=8991
				}
				if (s3 > 10) {
					long ig = (long) ((goairBusinessClass * s3));
					ig = (long) ((ig) - (goairBusinessClass * s3 * (goExtraDiscountFifteen / 100)));
					System.out.println(ig);
				}

			}

		}*/

	}

}
