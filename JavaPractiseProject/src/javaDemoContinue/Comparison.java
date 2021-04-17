package javaDemoContinue;

public class Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="10";
		String s2="10";
		String s3=new String("Hello");
		String s4=new String("Hello");
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		System.out.println(s3==s4);//false 
		System.out.println(s3.equals(s4));//true
		//== adress comparison
		//equals content comparison
		
	}

}
