package array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("������Ҫ��������ݵĴ�С��");
		int num_of_ele = in.nextInt();
		System.out.println("����������֣�");
		double[] ele = new double[num_of_ele];
		double sum = 0;
		for(int i=0;i<num_of_ele;i++){
			ele[i] = in.nextDouble();
			sum += ele[i];
		}
		System.out.println("�ܺͣ�"+sum);
		double average;
		average = sum/num_of_ele;
		System.out.println("ƽ��ֵ��"+average);
		System.out.println("����ƽ��ֵ�����ǣ�");
		for(int j=0;j<num_of_ele;++j){
			if (ele[j] > average){
				System.out.print(ele[j]+"��");
				
			}
		}
	}

}
