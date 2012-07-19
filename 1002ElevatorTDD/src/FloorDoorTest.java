import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FloorDoorTest {

	FloorDoor floorDoor;
	
	@Before
	public void setUp() throws Exception {
		floorDoor = new FloorDoor(new Floor(1));
	}

	@Test
	public void testGetFloorNumber() {
		assertEquals(1, floorDoor.getFloorNumber());
	}

	@Test
	public void testOpenFloorDoor() {
		assertEquals(true, floorDoor.openFloorDoor());
		assertEquals(false, floorDoor.openFloorDoor());
	}

	@Test
	public void testCloseFloorDoor() {
		floorDoor.openFloorDoor();
		assertEquals(true, floorDoor.closeFloorDoor());
		assertEquals(false, floorDoor.closeFloorDoor());
	}

}
