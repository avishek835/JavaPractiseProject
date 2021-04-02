package interphaseInheritanceExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.walk();
		c.move();
		c.talk();
		c.sleep();
		
		Parent p=new Parent();
		p.walk();
		p.move();
		p.talk();
		
		
		Parent p1=new Child();
		p1.walk();
		p1.move();
		p1.talk();
		
		System.out.println("--------------->");
		
		Inter in=new Child();
		in.laugh();
		

	}

}
