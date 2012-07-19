
public class FloorPanel {
	
	private Floor floor;
	private FloorButton upButton;
	private FloorButton downButton;
	
	public FloorPanel() {
		upButton = new FloorButton("UP", this);
		downButton = new FloorButton("DOWN", this);
	}
	
	public void callElevator() {
		
	}
}
