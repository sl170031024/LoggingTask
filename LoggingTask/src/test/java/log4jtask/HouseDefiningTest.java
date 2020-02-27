package log4jtask;

import static org.junit.Assert.*;


import org.junit.Test;


public class HouseDefiningTest {
    HouseDefining t=new HouseDefining();
    
	@Test
	public void testCost() {
		assertEquals(250000.0,t.cost("high standard material" , 100, "fully automated home"),0);
		assertEquals(400000.0,t.cost("StandardMaterials",125,"not"),0);
		assertEquals(437500.0,t.cost("above standard materials",25,"not"),0);
		assertEquals(617500.0,t.cost("high standard",100,"not"),0);

}
}