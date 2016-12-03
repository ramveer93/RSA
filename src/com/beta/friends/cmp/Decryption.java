
package com.beta.friends.cmp;

/*
 * take a BigInteger c and convert it into m=c^d%n
 */
import java.math.BigInteger;

/**
 * 
 * @author Ramveer
 *
 */
public class Decryption {
   Encryption encryption;
   BigInteger m;
	Decryption(Encryption encryption){
		this.encryption=encryption;
		m=encryption.c.modPow(encryption.rsa.d, encryption.rsa.n);
		System.out.println("m after decription is ->"+m);
	}
}
