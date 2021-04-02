package demo;

public class BoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		Box b2=b1;//b2 is pointing to same as pointing b1
		double vol1;
		double vol2;
		b1.width=10;
		b1.height=20;
		b1.depth=30;
		vol1=b1.width*b1.height*b1.depth;
		
		System.out.println(vol1);
		vol2=b2.width*b2.height*b2.depth;
		System.out.println(vol2);
		
	}

}
