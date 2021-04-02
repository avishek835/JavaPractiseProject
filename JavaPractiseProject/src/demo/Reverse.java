package demo;

public class Reverse {
	static StringBuffer sb;
	public static void main(String[] args) {
		String str="Avishek";
		 sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		System.out.println("-----------------------");
		
		sb= new StringBuffer("Chakraborty");
		System.out.println(sb.reverse());
		
		System.out.println("-----------------------");
		
		String str1="12345";
		 sb=new StringBuffer(str1);
			System.out.println(sb.reverse());
			
			//without using reverse nethod
			System.out.println("--------");
			String s="Piyali";
			int len=s.length();
			System.out.println(len);
			String rev="";
						//4
			for (int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			System.out.println(rev);
			
			///using reverse
			String str2="PIYALI";
			 sb=new StringBuffer(str2);
				System.out.println(sb.reverse());
				
			//remove junk char from string
				
				String str3="%$#@! PIYALI)(*&^%$";
				str3=str3.replaceAll("[^a-zA-Z0-9]", "");
				System.out.println(str3);
				System.out.println("-------------->>>>>>>>>>");
				int n=5678765;
				int re=0;
				while(n!=0)
				{
					re=re*10+n%10;
					n=n/10;
				}
				System.out.println(re);
				if(n==re)
				{
					System.out.println("palindrome");
				}else
				{
					System.out.println("not palindrome");
				}
				String str4="madam";
				String ng="";
				for(int i=str4.length()-1;i>=0;i--)
				{
					ng=ng+str4.charAt(i);
					
				}
				System.out.println(ng);
				if(str4.equals(ng))
				{
					System.out.println("palindrome");
				}else
					System.out.println("not palindrome");
	}

}




