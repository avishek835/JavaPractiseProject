package demo;

public class Outer {
	
	 int a=10;
	static class Inner{
		
		public static void main(String[] args)
		{
			//System.out.println(a);
			Outer o=new Outer();
			System.out.println(o.a);
		}
		interface in{
			void eye();
			public class Hello implements in {
				int a=2;

				@Override
				public void eye() {
					// TODO Auto-generated method stub
					
				}
			}
		}
	}

}
