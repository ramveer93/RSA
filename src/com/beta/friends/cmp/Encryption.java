package com.beta.friends.cmp;

import java.math.BigInteger;
/**
 * 
 * @author Ramveer
 *
 */
public class Encryption {
	Rsa rsa;
	Decoding decoding;
	BigInteger c;
	Encryption(Rsa rsa,Decoding decoding){
		this.rsa=rsa;
		this.decoding=decoding;
		c=(decoding.m).modPow(rsa.e, rsa.n);
		System.out.println("C value is:"+c);
	}

}
