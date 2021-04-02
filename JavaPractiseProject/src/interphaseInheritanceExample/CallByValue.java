package interphaseInheritanceExample;

//If we call a method passing a value, 
//it is known as call by value. The changes being done in the called method, 
//is not affected in the calling method.
public class CallByValue {
	
	static int a=20;
	
	void varb(int a)//called method
	{
		System.out.println(a);//2. 20
		a=30;
		System.out.println(a);//3. 30
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValue cv=new CallByValue();
		System.out.println(a);//1. 20
		cv.varb(a); //calling method
		System.out.println(a);//4. 20
		
	}

}
