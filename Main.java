
public class Main {
	
	public static void main(String[] args) {
		
		CreditCardStrategy card = new CreditCardStrategy("Eric Truong", "0000000000000000", "111", "01/01");
		PaypalStrategy paypal = new PaypalStrategy("hello@gmail.com", "hello");
		
		ShoppingCart cart = new ShoppingCart();
		
		Item eggplant = new Item("Eggplant", 1);
		Item eggs = new Item("Eggs", 5);
		Item milk = new Item("Milk", 5);
		Item apples = new Item("Apples", 3);
		
		cart.addItem(eggplant);
		cart.addItem(eggs);
		cart.addItem(milk);
		cart.addItem(apples);
		
		cart.pay(card);
		cart.pay(paypal);
	}

}
