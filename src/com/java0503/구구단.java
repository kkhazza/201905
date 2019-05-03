package com.java0503;

public class 구구단 {

	public String lv1() {
		/*****************************
		 * 1난이도 (한행에 하나씩)
		 * 1단 > 2단 (순차적으로 출력)
		 *****************************/
		
		String result = "";				
		for(int y = 1; y <= 9; y++) {
//			System.out.println(y + " 단");
			result = result + y + " 단<br>";
			for(int x = 1; x <= 9; x++) {
//				System.out.println(y + " * " + x + " = " + (y * x));
				result = result + y + " * " + x + " = " + (y * x) + "<br>";
			}
//			System.out.println();
			result = result + "<br>";
		}
		return result;
	}

	public String lv2() {
		/*****************************
		 * 2난이도 (한행에 3단씩)
		 * 1단 2단 3단 > 4단 5단 6단 > 7단 8단 9단
		 *****************************/
		
		String result = "";
		for(int y = 1; y <= 9; y = y + 3) {
			result = result + y + " 단\t";
			result = result + (y + 1) + " 단\t\t";
			result = result + (y + 2) + " 단\t\t";
			result = result + "<br>";
			for(int x = 1; x <= 9; x++) {
				result = result + y + " * " + x + " = " + (y * x) + "\t";
				result = result + (y + 1) + " * " + x + " = " + ((y + 1) * x) + "\t";
				result = result + (y + 2) + " * " + x + " = " + ((y + 2) * x) + "\t";
				result = result + "<br>";
			}
			result = result + "<br>";
		}
		return result;
	}

	public String lv3() {
		/*****************************
		 * 3난이도 (한행에 1,4,7 > 2,5,8 > 3,6,9)
		 * 1단 4단 7단 > 2단 5단 8단 > 3단 6단 9단
		 *****************************/
		
		String result = "";
		for(int y = 1; y <= 3; y++) {
			result = result + y + " 단\t";
			result = result + (y + 3) + " 단\t\t";
			result = result + (y + 6) + " 단\t\t";
			result = result + "<br>";
			for(int x = 1; x <= 9; x++) {
				result = result + y + " * " + x + " = " + (y * x) + "\t";
				result = result + (y + 3) + " * " + x + " = " + ((y + 3) * x) + "\t";
				result = result + (y + 6) + " * " + x + " = " + ((y + 6) * x) + "\t";
				result = result + "<br>";
			}
			result = result + "<br>";
		}
		return result;
	}

}
