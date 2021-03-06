package menu;

/**
 * A bean that represents an item on a menu
 * @author Doug Shook
 *
 */
public class MenuItem {
	
	private double price;
	private String name;
	
	public MenuItem(double price, String name) {
		this.price = price;
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
