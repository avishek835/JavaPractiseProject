package demo;

class AbsClass extends Abs{
	
	@Override
	void eyes() {
		
		System.out.println("Have eyes");
	}

	@Override
	void ears() {
		System.out.println("Have ear");
	}

	public static void main(String[] args) {
		
		//AbsClass ac=new AbsClass();//can't call anything
		Abs ab=new AbsClass();
		
		
		
	}

	

}
