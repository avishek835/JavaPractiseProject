package demo;

public class MultiDiamensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2 3 4
		//5	6 7
		int a[][]=new int[2][3];
		a[0][0]=2;
		a[0][1]=3;
		a[0][2]=4;
		a[1][0]=5;
		a[1][1]=6;
		a[1][2]=7;
		//a[0][0]=8;
		
//		int b[][]= {{2,3,4},{5,6,7}};
//		System.out.println(a[0][0]);
//		System.out.println(b[1][0]);
		for(int i=0;i<2;i++ )
		{
			for(int j=0;j<3;j++)
				System.out.println(a[i][j]);
		}
	}

}

 class MultiDiamensionalArrayExten {

	public static void main(String[] args) {
		int c[][]= {{2,3,4},{5,6,7},{1,8,0}};
		int min=c[0][0];
		int mincolumn;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(c[i][j]<min)
				{
				min=c[i][j];
				mincolumn=j;
				}
			}
		
	}
		System.out.println(min);
}

	}
