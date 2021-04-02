package interphaseInheritanceExample;

public class Parent implements Inter {
	
	

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Child, I can walk");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Child, I can move my hand");
	}

	public void talk()
	{
		System.out.println("Child, I can  talk");	
	}

	@Override
	public void laugh() {
		// TODO Auto-generated method stub
		
	}
	
}
