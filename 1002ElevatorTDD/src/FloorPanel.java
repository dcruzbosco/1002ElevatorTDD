
public class FloorPanel {
	
	private Floor floor;
	private FloorButton upButton;
	private FloorButton downButton;
	private LED directionLed;
	
	public FloorPanel() {
		upButton = new FloorButton("UP", this);
		downButton = new FloorButton("DOWN", this);
		directionLed = new LED();
		this.floor = floor;
	}
	
	public void callElevator() {
		floor.callElevator();
	}
}
