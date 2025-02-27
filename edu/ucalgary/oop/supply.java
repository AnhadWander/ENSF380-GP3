package edu.ucalgary.oop;

public class Supply {
	private int quantity;
	private String type;

	Supply(String type, int quantity) {
		this.quantity = quantity;
		this.type = type;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}


}
