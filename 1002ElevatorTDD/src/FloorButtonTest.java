import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class FloorButtonTest {
	
	private FloorButton floorButton;
	private FloorPanel floorPanel;
	
	@Before
	public void setUp() throws Exception {
		floorButton = new FloorButton("Up", floorPanel);
	}
	
	
}
