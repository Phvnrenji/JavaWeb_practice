package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********************");
		System.out.println("state 1");
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the number of elements: ");
		int num_of_ele = in.nextInt();
		System.out.println("enter the numbers: ");
		double[] ele = new double[num_of_ele];
		double sum = 0;
		for (int i = 0; i < num_of_ele; i++) {
			ele[i] = in.nextDouble();
			sum += ele[i];
		}
		System.out.println("the length of the array is: "+ele.length);
		System.out.println("Sum: " + sum);
		double average;
		average = sum / num_of_ele;
		System.out.println("average: " + average);
		System.out.println("numbers over the average: ");
		for (int j = 0; j < num_of_ele; ++j) {
			if (ele[j] > average) {
				System.out.print(ele[j] + "  ");

			}
		}
		
		System.out.println("*************************");
		System.out.println("state 2");
		System.out.println("enter somer number frome 0-9: ");
		int[] a = new int[10];
		int i;
		int n;
		for(i=0;i<a.length;i++){
			a[i] = 0;
		}
		do {
			n = in.nextInt();
			if(n>0 && n<10){
				a[n]++;
			}
		} while(n != -1);
		for(i=0;i<a.length;i++){
			System.out.println(i+"-"+a[i]);
		}
	}

}
