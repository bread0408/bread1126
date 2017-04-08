package six;

public class TestEquals {

	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = new int[3];
		int i;
		
		for (i = 0; i < a.length; i++)
			a[i] = i;

		for (i = 0; i < b.length; i++)
			b[i] = i;
		if (a == b)
			System.out.println("Equal by ==.");
		else
			System.out.println("Not equal by ==.");
		if (equals(a, b))
			System.out.println("Equal by the equals method.");
		else
			System.out.println("Not equal by the equals method.");
	}
	
	public static boolean equals(int[] a, int[] b) {
		boolean match;
		System.out.println(b.length);
		
		if (a.length != b.length)
			match = false;
		else {
			match = true;
			int i = 0;
			while (match && (i < a.length)) {
				System.out.println(" i : "+i );
				System.out.println(a[0]+" "+a[1]+" "+a[2]);
				if (a[i] != b[i])
					match = false;
				i++;
			}
		}
		return match;
	}
}
