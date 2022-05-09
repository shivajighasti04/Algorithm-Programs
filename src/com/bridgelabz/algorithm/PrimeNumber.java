package com.bridgelabz.algorithm;
import java.util.Scanner;
/**
 * 
 * @author Shivaji
 * Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.
 *
 */

public class PrimeNumber {
public boolean checkIfPrime(int numberToCheck) {
		
		boolean isPrime = true;
		
		if (numberToCheck == 1 || numberToCheck == 0) {
			return false;
		}

		for (int index = 2; index <= numberToCheck / 2; index++) {
			if (numberToCheck % index == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		
		System.out.println("The prime numbers between 0-1000 are: ");
		PrimeNumber primeNumber = new PrimeNumber();
		for(int index = 2 ; index<=1000; index++) {
			boolean isPrime = primeNumber.checkIfPrime(index);	
			if (isPrime) {
				System.out.println(index );
			}
		}

	}


}
	