package demo;

public class JavaReverseRecursion {

	void reverse(String name)
	{
		 if ((name==null)||(name.length() <= 1))
	           System.out.println(name);
	        else
	        {
	            System.out.print(name.charAt(name.length()-1));
	            reverse(name.substring(0,name.length()-1));
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Avishek";
		JavaReverseRecursion strRev=new JavaReverseRecursion();
		strRev.reverse(name);
		System.out.println("---------------------");
	}

}

class LineReverse{
	 static StringBuffer SB;
	
	public static void main(String[] args) {
		String myName="Krishna";
		SB=new StringBuffer(myName);
		System.out.println(SB.reverse());
	}
}