package test;

import java.util.*;

/**
 * 정기예금 계좌 정보에 대한 입출력과 예상 지급액을 계산할 수 있는 클래스. 
 */
public class NewAccount {
	private String customer;
	private long amount;
	private double interestRate;
	
	public void set(String newCustomer, long newAmount, double interestRate) {
		customer = newCustomer;
		if (newAmount >= 0)
			amount = newAmount;
		else {
			System.out.println("ERROR: 금액은 양의 정수로 입력하세요.");
			System.exit(0);
		}
		this.interestRate = interestRate;
	}

	public String getCustomer() {
		return customer;
	}

	public long getAmount() {
		return amount;
	}

	public double getInterestRate() {
		return interestRate;
	}	

	/**
	 * 키보드로부터 계좌 정보(고객명, 예치 금액, 연간 이자율)를 입력받는 메소드.
	 */
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("고객명을 입력하세요.");
		customer = keyboard.nextLine();
		
		System.out.println("예치 금액(단위: 원)을 입력하세요.");
		amount = keyboard.nextLong();
		while (amount < 0) {
			System.out.println("예치 금액은 음수가 될 수 없습니다.");
			System.out.println("예치 금액을 다시 입력하세요.");
			amount = keyboard.nextLong();
		}
		System.out.println("연간 이자율(단위: %)을 입력하세요.");
		interestRate = keyboard.nextDouble();
	}
	
	/**
	 * 계좌 정보(고객명, 예치 금액, 연간 이자율)를 화면으로 출력하는 메소드.<p>
	 * 실행 전에 호출하는 객체의 인스턴스 변수는 해당하는 데이터를 가지고 있어야 함.
	 */
	public void writeOutput() {
		System.out.println("고객명: " + customer);
		System.out.println("예치 금액: " + amount + "원");
		System.out.println("연간 이자율: " + interestRate + "%");
	}
	
	/**
	 * 예상 지급액을 계산하여 반환하는 메소드.<p>
	 * @param years 예치 기간(단위: 년)을 나타내는 양의 정수.
	 * @return 복리식으로 계산된 예상 지급액(단위: 원)
	 */
	public long expectedAmount(int years) {
		long newAmount = amount;
		int count = years;
		while ((count > 0) && (newAmount > 0)) {
			newAmount = (long)(newAmount + (interestRate/100) * newAmount);
			count--;
		}
		if (newAmount > 0)
			return newAmount;
		else
			return 0;
	}
	
	public boolean equals(NewAccount otherAccount) {
		System.out.println(otherAccount.customer +" : "+ this.customer);
		return ((this.customer.equals(otherAccount.customer))
				&& (this.amount == otherAccount.amount)
				&& (this.interestRate == otherAccount.interestRate));
	}
}
