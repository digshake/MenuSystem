package menu;

import java.util.LinkedList;
import java.util.List;

/**
 * A class that represents multiple items from the menu in one order
 * @author Doug Shook
 *
 */
public class Order {

	private List<MenuItem> orderItems;
	private double taxRate;
	
	public Order(double taxRate) {
		this.orderItems = new LinkedList<>();
		this.taxRate = taxRate;
	}
	
	public void addItem(MenuItem item) {
		orderItems.add(item);
	}
	
	public int getSize() {
		return orderItems.size();
	}
	
	/**
	 * Computes the subtotal for all items in this order
	 * @return the sum of all prices of MenuItems
	 */
	public double computeSubtotal() {
		double sum = 0;
		for(MenuItem item : orderItems) {
			sum += item.getPrice();
		}
		return sum;
	}
	
	public double computeTax() {
		return computeSubtotal() * this.taxRate;
	}
}
