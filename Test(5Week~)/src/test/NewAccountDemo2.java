package test;

public class NewAccountDemo2 {

	public static void main(String[] args) {
		NewAccount firstAccount, secondAccount;
		firstAccount = new NewAccount();
		secondAccount = new NewAccount();
		firstAccount.set("홍길동", 12000000, 3.5);
	   secondAccount.set("홍길동", 12000000, 3.5);
		
		if (firstAccount == secondAccount)
			System.out.println("==로 일치함.");
		else
			System.out.println("==로 일치하지 않음.");
		
		if (firstAccount.equals(secondAccount))
			System.out.println("equals() 메소드로 일치함.");
		else
			System.out.println("equals() 메소드로 일치하지 않음.");
	}
}

