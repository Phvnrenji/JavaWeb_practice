package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		System.out.println("Hello World !");
		System.out.println("Please enter bill num: ");
		Scanner in = new Scanner(System.in);
		float bill = 0;
		bill = in.nextFloat();
		System.out.println("Please enter price: ");
		float price = 0;
		price = in.nextFloat();
		System.out.println("The change is: ");
		//float change = 0;
		System.out.println(bill-price);
		*/
		
		double meters;
		Scanner in = new Scanner(System.in);
		meters = in.nextDouble();
		//System.out.println(meters);
		int foot = 0;
		int inch = 0;
		double x = 0;
		x = meters/0.3048;
		//System.out.println(x);
		foot = (int)x;//强制转换，掐掉小数部位
		double y = x - foot;
		inch = (int)Math.round(y*12);//Math.round()四舍五入
		System.out.print(foot+"foot,");
		System.out.println(inch+"inch");
	}

}
