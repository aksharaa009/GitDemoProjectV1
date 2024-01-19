/**
 * 
 */
package org.ict.git;

import java.util.*;

public class TestPalindrome {

	
	public static void main(String[] args) {
	
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int s = sc.nextInt();
		int j =0, n=s;
		while (n>0)
		{
			int rev=n%10; //remainder
			n=n/10; //quotient
			j=(10*j)+rev;
		}
    if (j==s)
    {
      System.out.println("Number is palindrome");
    }
     else 
    {
    	 System.out.println("Number is not palindrome");
     }
     }
     }
	

