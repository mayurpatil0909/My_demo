package com.java.program;

public class TestFactorial {
	int result = 1;
	public Integer TestFact(Integer num) {  // 3 = 3*2*1  == 6
		
		for (int i = num; i >= num; i--) {
			result = result * num;
		}

/*		//	by Recursion  Way
		while (num != 0)
			if (num == 1) {
				return result;

			} else {
				result = result * num;
				TestFact(num - 1);
				return result;
			}
*/

		return result;
	}
	
	public static void main(String[] args) {
		TestFactorial obj = new TestFactorial();
		System.out.println("Fact: " + obj.TestFact (3)); 
	}

}
