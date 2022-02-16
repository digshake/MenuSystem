package menu;

import java.util.LinkedList;
import java.util.List;

public class Order {

	private List<MenuItem> orderItems;
	
	public Order() {
		this.orderItems = new LinkedList<>();
	}
	
	public void addItem(MenuItem item) {
		orderItems.add(item);
	}
	
	public int getSize() {
		return orderItems.size();
	}
	
	public double computeSubtotal() {
		double sum = 0;
		for(MenuItem item : orderItems) {
			sum += item.getPrice();
		}
		return sum;
	}
}
