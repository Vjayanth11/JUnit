package onlineshopping;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	@Test
	void addCartItems() {
		ShoppingCart cart = new ShoppingCart();
		Item item = new Item(1, "book", 25.5);
		cart.addItem(item);
		assertTrue(cart.getItems().contains(item));
	}
	
	 @Test
	   void testRemoveItemFromCart() {
	        ShoppingCart cart = new ShoppingCart();
	        Item item = new Item(2, "soap", 35.0);
	        cart.addItem(item);
	        cart.removeItem(item);
	        assertFalse(cart.getItems().contains(item));
	    }
	 @Test
	 void testViewItemsInCart() {
	        ShoppingCart cart = new ShoppingCart();
	        cart.addItem(new Item(3, "Notebook", 100.0));
	        cart.addItem(new Item(4, "Bag", 800.0));
	        List<Item> items = cart.getItems();
	        assertEquals(2, items.size());
	    }
	   @Test
	    void testCalculateTotalPrice() {
	        ShoppingCart cart = new ShoppingCart();
	        cart.addItem(new Item(5, "Shoes", 1500.0));
	        cart.addItem(new Item(6, "Shirt", 800.0));
	        assertEquals(2300.0, cart.calculateTotalPrice());
	    }
}
