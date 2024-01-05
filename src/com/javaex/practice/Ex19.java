package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

/*	???
아래와 같이 은행 프로그램을 작성하세요
“1.예금” 선택후 금액을 입력하면 예금액이 합산됩니다.
“2.출급” 선택후 금액을 입력하면 예금액이 차감됩니다.
“3.잔고” 선택시 현재 잔고가 출력됩니다.
“4.종료” 선택시 종료됩니다.
“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다.

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i=0;
		int deposit;
		int withdraw;
		int d=deposit;
		int w=withdraw;
		int sum;
		
		while (i<=4) {
			System.out.println("-----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			int choice=sc.nextInt();
			
			if (choice==1) {
				System.out.print("예금액>");
				deposit=sc.nextInt();
				d=deposit;
			} else if (choice==2) {
				System.out.print("출금액>");
				withdraw=sc.nextInt();
				w=withdraw;
			} else if (choice==3) {
				System.out.print("잔고액>");
				sum=d-w;
				System.out.println(sum);
			} else if (choice==4) {
				System.out.println("프로그램 종료");
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
		
		sc.close();

	}
*/
}
