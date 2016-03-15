package com.cloudgensys.training;

public class OrderOfN {
	public static void main(String[] args) {
		float start = System.nanoTime();
		for(int i=0;i<=100;i++){
			System.out.println("Iteration : "+i);
		}
		float total = System.nanoTime() - start;
		System.out.println(" "+total);
	}

}
