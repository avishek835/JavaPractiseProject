package tekstac;

import java.util.Scanner;

public class Booking {

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

		if (s1.equals("AIR INDIA") && (s4.equals("Y")) || (s4.equals("N"))) {
			if (s2.equals("TRAVEL CLASS")) {
				if (s4.equals("Y")) {
					long tc = (long) ((airindiaTravelClass * s3)- (airindiaTravelClass * s3 * (airindiaCardPayment / 100)));
					
					System.out.println(tc);
				}  if (s4.equals("N")) {
					long tc = (long) ((airindiaTravelClass * s3));
					
					System.out.println(tc);
				}
				// (3200*8)-(3200*8*(10.5/100))
			} if (s2.equals("ECONOMY CLASS") && (s4.equals("Y")))  {
				
					long ec = (long) ((airindiaEconomyClass * s3)- (airindiaEconomyClass * s3 * (airindiaCardPayment / 100)));
					
					System.out.println(ec);
				} if(s1.equals("AIR INDIA")&&s2.equals("ECONOMY CLASS") && (s4.equals("N"))){
					long ec = (long) ((airindiaEconomyClass * s3));
					
					System.out.println(ec);
				}
			 if (s2.equals("BUSINESS CLASS")) {
				if (s4.equals("Y")) {
					long bc = (long) ((airindiaBusinessClass * s3)
							- (airindiaBusinessClass * s3 * (airindiaCardPayment / 100)));
					
					System.out.println(bc);
				} if (s4.equals("N")&&(s1.equals("AIR INDIA"))) {
					long bc = (long) ((airindiaBusinessClass * s3));
					
					System.out.println(bc);
				}
			}
		}

		
		
		
		else if (s1.equals("GO AIR") && (s4.equals("Y")) || (s4.equals("N"))) {
			if (s2.equals("TRAVEL CLASS")) {
				if (s4.equals("Y")) {
					long tc = (long) ((goairTravelClass * s3) - (goairTravelClass * s3 * (goairCardPayment / 100)));
					
					System.out.println(tc);
				} else if (s4.equals("N")) {
					long tc = (long) ((goairTravelClass * s3));
					
					System.out.println(tc);
				}
			} else if (s2.equals("ECONOMY CLASS")) {
				if (s4.equals("Y")) {
					long ec = (long) ((goairEconomyClass * s3) - (goairEconomyClass * s3 * (goairCardPayment / 100)));
					System.out.println(ec);
				} else if (s4.equals("N")) {
					long ec = (long) ((goairEconomyClass * s3));
					
					System.out.println(ec);
				}
			}else if (s2.equals("BUSINESS CLASS")) {
				if (s4.equals("Y")) {
					long bc = (long) ((goairBusinessClass * s3) - (goairBusinessClass * s3 * (goairCardPayment / 100)));
					System.out.println(bc);
				} else if (s4.equals("N")) {
					long bc = (long) ((goairBusinessClass * s3));
					
					System.out.println(bc);
				}
			}
		}
		
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
	
	


		
	}

}
