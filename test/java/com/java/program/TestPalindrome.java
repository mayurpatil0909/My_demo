package com.java.program;

public class TestPalindrome {

	public  void TestPalindromeNumber(Integer num) { //121
		int temp , rev = 0;
		temp= num;
		
		while (temp != 0) {
			int a = temp %10 ;   //   121 % 10 = 1
			
			rev =  (rev*10) + a;
			temp =  temp /10 ;  //    121 / 10 = 12
		}
		
		System.out.println(rev);
		if (num == rev) {
			System.out.println("Its a Palimdrome");
		} else {
			System.out.println("Its not a Palimdrome");
		}
	}
	
	public static void main(String[] args) {
		TestPalindrome obj = new TestPalindrome();
		obj.TestPalindromeNumber(151);
	}
	
}
