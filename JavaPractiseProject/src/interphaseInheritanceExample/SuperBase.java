package interphaseInheritanceExample;

public class SuperBase implements Inter{
	public int a;
	public int b;
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Can Walk");
		
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Can Move");
	}
	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		System.out.println("Can laugh");
	}
	
	public void myFuntion()
	{
		System.out.println("I am SuperBase function in myFunction");
	}
	
	
	public static void main(String args[]){
	
	//Inter in=new Inter();
	Inter in=new SuperBase();
	System.out.println("Below is the all Interfase method calling from Superbase which is parent class of SubDerived");
	System.out.println("Creating the object of Superbase class using the refernce varaible of Interface");
	in.walk();
	in.move();
	in.laugh();
	
	SuperBase sb=new SuperBase();
	System.out.println("Below is the all Interfase method calling from Superbase which is parent class of SubDerived");
	System.out.println("Creating the object of Superbase class using the refernce varaible of Superbase class");
	sb.walk();
	sb.move();
	sb.laugh();
	}
	
}
