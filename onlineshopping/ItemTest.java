package onlineshopping;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ItemTest {
	
	@Test
	public void checkValidItems() {
		Item item = new Item(1, "ipad", 35000.00);
		assertNotNull(item);
	}
	
	@Test
	public void checkItemDetails() {
		Item item = new Item(2, "iphone", 85000);
		assertEquals(2, item.getId());
		assertEquals("iphone", item.getName());
		
	}
	
}
