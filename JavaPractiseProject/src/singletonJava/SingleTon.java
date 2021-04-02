package singletonJava;

public class SingleTon {
	
	private static SingleTon singleton_instance=null;
	public String str;//global variable declared
	
	//private constructor
	private SingleTon()
	{
		str="I am inside Singleton constructor";
	}
	
	//public static method(get instance) that has return type of object in this singleton class
	public static SingleTon getInstance()
	{
		if(singleton_instance==null)
			singleton_instance = new SingleTon();
		return singleton_instance;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleTon x= SingleTon.getInstance();
		System.out.println(x.str);

	}

}
