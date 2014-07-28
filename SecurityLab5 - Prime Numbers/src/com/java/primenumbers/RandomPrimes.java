package com.java.primenumbers;
import java.io.Console;
import java.math.*;
import java.security.SecureRandom;
import java.util.Random;

public class RandomPrimes {

	//Sample Java program that prints out prime numbers.
	
		public static void main(String[] args) {
			

			System.out.println("Please select an option:\n");
			System.out.println("1: Generate v.large pseudorandom numbers ");
			System.out.println("2: Test if number generated is a prime number");
			System.out.println("3: Generate a set of 10 large prime numbers");
			System.out.println("4: Given a prime a number, generate the next number");
			System.out.println("5: Check if public key is a prime number");
			
			Random ran = new SecureRandom();
			
			System.out.println("A random prime number has been generated: ");
			
			for(int i = 0; i < 10; i++){
				
			System.out.println("Random number is: " + BigInteger.probablePrime(100,ran));	
			}
		}
}