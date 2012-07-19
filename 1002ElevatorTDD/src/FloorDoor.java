
public class FloorDoor extends Door {
	private int floorNumber;
	
	public FloorDoor(Floor floor) {
		this.floorNumber = floor.getFloorNumber();
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}
	
	public boolean openFloorDoor() {
		return openDoor();
	}
	
	public boolean closeFloorDoor() {
		return closeDoor();
	}
}
