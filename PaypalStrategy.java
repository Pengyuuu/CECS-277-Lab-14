
public class PaypalStrategy implements PaymentStrategy {
	
	private String emailid;
	
	private String password;
	
	public PaypalStrategy(String emailid, String password) {
		
		this.emailid = emailid;
		
		this.password = password;
	}
	
	public void pay(int amount) {
		System.out.println("Paying $" + amount + " with your paypal account");
	}

}
