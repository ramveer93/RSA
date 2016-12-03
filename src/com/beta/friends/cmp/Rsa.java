package com.beta.friends.cmp;

import java.math.BigInteger;
import java.util.Random;
/**
 * 
 * @author Ramveer
 *This is the implementation part of RSA algorithm
 */
public class Rsa {
    BigInteger p,q,n,phi,e,d;
    int bitLength;
    Rsa(int bitLength){
    	this.bitLength=bitLength;
    	 /* generate two random no's p and q  
    	 */
    	Random rnd=new Random();
    	/*
    	 * test if these no's are prime or not
    	 * input bit length of e should be smaller then p and q's bit length
    	 */
    	BigInteger temp;
    	p=BigInteger.probablePrime(bitLength, rnd);
    	q=BigInteger.probablePrime(bitLength, rnd);
    	temp=BigInteger.probablePrime(bitLength-6, rnd);
    	System.out.println("P and Q are: "+p+" ->"+q);
    	/*
    	 * calculate n
    	 */
    	n=p.multiply(q);
    	System.out.println("N is ->"+n);
    	phi=(p.subtract(BigInteger.ONE)).multiply((q.subtract(BigInteger.ONE)));
    	System.out.println("phi is :"+phi);
    	while(!(n.gcd(temp)).equals(BigInteger.ONE)){
    		temp=BigInteger.probablePrime(bitLength-6, rnd);
    		System.out.println("rejected temp:"+temp);
    	}
    	if((n.gcd(temp)).equals(BigInteger.ONE)){
    		e=temp;
    	}
    	System.out.println("e is ->"+e);
    	d=e.modInverse(phi);
    	System.out.println(" decr key is :"+d);
    }
}
