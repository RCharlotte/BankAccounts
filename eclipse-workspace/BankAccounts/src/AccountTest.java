public class AccountTest {
	public static void main (String[] args) {
		
		Account Account1= new Account("Charlotte", "101TY",5000000);
		Account Account2= new Account("Blue", "450GH",5000000);
		System.out.println(Account1);
		Account2.withdraw(50000);
		System.out.println(Account2);
//		System.out.println("Enter new name");
//		Scanner input = new Scanner(System.in);
//		String newName= input.nextLine();
//		
//		Account1.setName(newName);
//		System.out.println(Account1);
//		
	}
	
		
}
