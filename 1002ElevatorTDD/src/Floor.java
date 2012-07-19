
public class Floor {
	
	private int floorNumber;
	private Elevator elevator;
	
	public Floor(int floorNumber) {
		this.floorNumber = floorNumber;
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}

	public void callElevator() {
		elevator.callElevator(floorNumber);
	}
}
