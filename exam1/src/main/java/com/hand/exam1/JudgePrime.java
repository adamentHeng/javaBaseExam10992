package com.hand.exam1;

public class JudgePrime {
	
	public static boolean isPrime(int n){
		if( n < 2 ) return false;
		for( int i = 2; i * i <= n; i++ ){
			if( n % i == 0 )
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = new int[100];
		for( int i = 101; i <= 200; i++ ){
			if( isPrime(i)){
				arr[sum++] = i;
			}
		}
		System.out.print("101-200之间总共有" + sum + "个素数，分别是：");
		for( int i = 0; i < sum - 1; i++ ){
			System.out.print(arr[i] + ",");
		}
		System.out.println(arr[sum-1]);
	}

}
