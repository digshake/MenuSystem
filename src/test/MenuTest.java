package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import menu.MenuItem;

//price
//name
//calories
//allergens

class MenuTest {

	private MenuItem item;
	
	@BeforeEach
	void setup() {
		item = new MenuItem(2.50, "bagel"); //setup
	}
	
	@Test
	void testGetPrice() {
		double price = item.getPrice(); //test a method
		assertEquals(2.50, price, 0.05); //assert
	}
	
	@Test
	void testGetName() {
		String name = item.getName();
		assertTrue("bagel".equals(name));
	}
	
	
	
	

}
