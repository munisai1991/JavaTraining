package com.cloudgensys.training.exercise1;

public class StringBuilder1 {
	public static void main(String a[])
	{
		float start = System.nanoTime();
		StringBuilder s =new StringBuilder("HI");
		for(int i=0;i<=1000;i++)
		{
			s.append(i);
		}
		System.out.println(s);
		System.out.println(System.nanoTime() - start);
	}

}
