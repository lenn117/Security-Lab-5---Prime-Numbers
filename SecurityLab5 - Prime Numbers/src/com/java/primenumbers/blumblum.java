package com.java.primenumbers;
/* The following code was originally written by Meng Cui,
 * implemented by John Lennon C10321265 DT228/4
 * 
 */

import java.math.*;
import java.util.*;

public class blumblum
{
	public class java {

	}


	private BigInteger initial;
	private BigInteger p;
	private BigInteger q;
	private BigInteger n;
	private BigInteger s;
	public static BigInteger x;
	
	
	public blumblum ()
	{
		Random rnd1  = new Random(new Date().getTime());
		initial = BigInteger.probablePrime(128, rnd1);
		p = initial;
		
		// generate two prime number that have the same remainder 3 when divided by 4
		while(true)
		{
			p = p.nextProbablePrime();
			
			if((p.mod(new BigInteger(new String("4")))).equals(new BigInteger(new String("3"))))
				break;
		}
		
		q = p;
		
		while(true)
		{
			q = q.nextProbablePrime();
			
			if((q.mod(new BigInteger(new String("4")))).equals(new BigInteger(new String("3"))))
				break;
		}
		
		// n = p * q
		n = p.multiply(q);
		
		Random rnd2;
		
		// generate a random number s that is relatively prime to n
		while(true)
		{
			rnd2 = new Random(new Date().getTime());
			s = new BigInteger (128, rnd2);
			if(s.gcd(n).equals(BigInteger.ONE))
				break;
		}
		
		x = (s.multiply(s)).mod(n);
	}
	
	
	public BigInteger generateRondomNumber()
	{
		BigInteger x0 = (x.multiply(x)).mod(n);
		x = x0;
		return x0;
	}
	
}






