package javaPractice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int year = sc.nextInt();
		if (year%4==0&&year%100!=0) {
			System.out.println(1);
		}else if (year%400==0) {
			System.out.println(1);
		}else {
			System.out.println(0);
			}
		
	}

}