package com.cloudgensys.training;

public class OrderOfNSquare {
	public static void main(String[] args) {
		float start = System.nanoTime();
		for(int i=0;i<=100;i++){
			for(int j=0;j<=100;j++){
				System.out.println("Iteration Count: "+j);
			}
		}
		float total = System.nanoTime() - start;
		System.out.println("Total Execution time: "+total);
	}

}
