package labtest01;

import java.awt.List;
import java.util.Collections;

/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver
{
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
	
	private Driver() {}
	
	/**
	 * @param pArgs Not used
	 */
	public static void main(String[] pArgs)
	{
		Inventory inven = new Inventory("Test");
		for( Item item : ITEMS )
		{
			System.out.println(item.getName());
			inven.stock(item, 1);
			
		}
		
		/** Test for totalValue() **/
		System.out.println("Total Value is: " +inven.totalValue()); 
		
		/** Test for assert **/
		inven.dispose(ITEM_CEREAL, 2);
		
		List test = new List();
		/** Test for Comparator **/
		//Collections.sort(List<Item>);
	}
}
