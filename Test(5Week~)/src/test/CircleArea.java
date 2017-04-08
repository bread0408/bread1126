package test;

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		double pi = 3.14159; // 원주율
		double radius; // 반지름(단위: 미터)
		double area; // 면적(단위: 제곱미터)

		Scanner keyboard = new Scanner(System.in);
		System.out.print("원의 반지름을 미터 단위로 입력하세요: ");
		radius = keyboard.nextDouble();
		area = pi * radius * radius;
		System.out.println();
		System.out.println("원의 반지름은 " + radius + " 미터입니다.");
		System.out.println("원의 면적은 " + area + " 제곱미터입니다.");
		
		double circumference; 
		circumference= 2*radius *pi;
		System.out.println("원의 둘레는 "+ circumference+" 미터입니다.");
		
	}
}
