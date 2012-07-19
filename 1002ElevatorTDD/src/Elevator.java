
public class Elevator {

	private ElevatorControlPanel controlPanel;
	private ElevatorDoor elevatorDoor;
	private Floor currentFloor;
	private Building building;
	
	public Elevator(int numOfFloors, Building building) {
		System.out.println("Creating Elevator");
		controlPanel = new ElevatorControlPanel(numOfFloors, this);
		elevatorDoor = new ElevatorDoor();
		this.building = building;
	}
	
	public void callElevator(int floorNumber, Floor floor) {
		if (currentFloor.getFloorNumber() < floor.getFloorNumber())
			this.moveUp(floor);
		else
			this.moveDown(floor);
	}
	
	public void moveUp(Floor floor) {
		
	}
	
	public void moveDown(Floor floor) {
		
	}
	
	
}
