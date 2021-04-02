package interphaseInheritanceExample;

public class SubDerived extends SuperBase{
	
	int a, b;
	
	SubDerived(int a, int b)
	{
		super.a=a;
		super.b=b;
		this.a=a;
		this.b=b;
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(this.a);
		System.out.println(this.b);
	}
	
	public void myFunction()
	{
		super.myFuntion();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubDerived sd=new SubDerived(10,20);
		sd.myFunction();
	}

}
