package demo;

public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}


class CountingContinue
{
	public static void main(String[] args) {
	String str="Avishek";
	String str1="";
	for(int i=str.length()-1;i>=0;i--)
	{
		str1=str1+str.charAt(i);
		
		
	}
	System.out.println(str1);
	System.out.println(str1.length());
	}
	
}
