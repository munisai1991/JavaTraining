package com.cloudgensys.training;

public class Prime {
	public int isPrime(int num){
		int count = 0;
		for(int i=2;i<=num/2;i++){
			if(num%i==0) count++;			
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
		int num = 2;
		Prime prime = new Prime();
		int result = prime.isPrime(num);
		if(result == 0){
			System.out.println(num+" is a prime number");
		}else{
			System.out.println(num+" is not a prime number");
		}
		
	}

}
