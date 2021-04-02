package demo;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		int a[]={1,2,3};
		System.out.println(a.length);//3
		for(int x:a)
		{
			System.out.println("The array values are:"+x);
		}
		
		
		System.out.println("----------");
		
		int b[] =new int[5];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		b[3]=40;
		b[4]=50;
		
		System.out.println(b.length);//5
		System.out.println("----------");
		System.out.println(b[1]);//20
		System.out.println("----------");
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println(i);
			
		}
		
		System.out.println("----------");
		
		for(int j=b.length-1;j>=0;j--)
		{
			System.out.println(b[j]);
		}
		
		ArrayList<String> list=new ArrayList<String>();//dynamic growing, can have duplicate value
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println(list.size());

	}

}
