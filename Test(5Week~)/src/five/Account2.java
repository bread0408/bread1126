package five;

public class Account2 {
	private String customer;
	private long amount;
	private double interestRate;
	
	public Account2() {
		interestRate = 3.8;
	}
	
	public Account2(double interestRate) {
		this.interestRate = interestRate;
	}
	
	//Account2Demo에서  Account2("장보고", 2250000)라고 생성자를 정의하였기 때문에 오버로딩 된 생성자를 선언하였고,
	//매게 변수를 생성자에 넣은 변수값과 맞추어 String customer, long amount라고 선언하였다.
	public Account2(String customer, long amount) {
		//연간 이자율을 선언 하는 부분이 없기 때문에 실행결과를 참조하여 2.5라는 값을 interestRate에 넣게 되었다.
		interestRate = 2.5;
		this.customer = customer;
		this.amount = amount;
	}
	
	public void setCustomer(String newCustomer) {
		customer = newCustomer;
	}
	
	public void setAmount(long newAmount) {
		amount = newAmount;
	}
	
	public void writeOutput() {
		System.out.println("고객명: " + customer);
		System.out.println("예치 금액: " + amount + "원");
		System.out.println("연간 이자율: " + interestRate + "%");
		System.out.println();
	}
	
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
}
