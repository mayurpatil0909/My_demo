package com.java.program;

public class TestArmstrong {

	public void getArmstrong(Integer number) {

		int temp, digit = 0, lastNum = 0, sum = 0;

		temp = number ;
		while (temp > 0) {
			temp = temp / 10;
			digit ++;
		}

		temp = number ;
		while(temp > 0) {
			lastNum = temp % 10 ;   // 153--3
			//sum += Math.pow(lastNum, digit); 
			
			int result = 1;
			for(int i = 1 ; i<=digit; i++) {
				result = result*lastNum;
			}

			sum += result;
			temp = temp/10;	
		}
		
		if  (number == sum) {
			System.out.println(String.format("The number :%d is Armstrong number. ", number));
		} else {
			System.out.println(String.format("The number :%d is not Armstrong number. ", number));
		}
	}

	public static void main(String[] args) {
		TestArmstrong obj = new TestArmstrong();
		obj.getArmstrong(153);
	}

}
