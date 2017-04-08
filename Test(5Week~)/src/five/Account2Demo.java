package five;

public class Account2Demo {

	public static void main(String[] args) {
		Account2 myAccount = new Account2();
		myAccount.setCustomer("홍길동");
		myAccount.setAmount(15000000);
		myAccount.writeOutput();
		
		Account2 yourAccount = new Account2(4.5);
		yourAccount.setCustomer("임꺽정");
		yourAccount.setAmount(57000000);
		yourAccount.writeOutput();
		
		Account2 anyAccount = new Account2("장보고", 2250000);
		anyAccount.writeOutput();
	}
}
