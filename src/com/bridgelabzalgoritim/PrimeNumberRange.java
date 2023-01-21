package com.bridgelabzalgoritim;

public class PrimeNumberRange {
    static boolean isPrime(int n){
        if(n==1||n==0) {
            return false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
//		int N = 1000;
//		for(int i=1; i<=N; i++){
//			if(isPrime(i)) {
//				System.out.print(i + " ");
//			}
//		}
        System.out.println(isPrime(491));

    }
}

//419, 491



