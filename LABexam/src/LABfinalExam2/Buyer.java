package LABfinalExam2;

public class Buyer {

	private String address;
	private String rewards;
	
	
	public Buyer(String address, String rewards) {
		super();
		this.address = address;
		this.rewards = rewards;
	}


	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String getRewards() {
		return rewards;
	}
	public void setRewards(String rewards) {
		this.rewards = rewards;
	}
	
	
	//reference of Order class
	Order order;
	
	public Order placeOrder(Seller seller) {
		
		
		return order;
	}
	
	
	
	
}
