
public class Door {

	private boolean isOpenable;
	private boolean isOpen;
	
	public Door() {
		isOpenable = true;
		isOpen = false;
	}
	
	public boolean openDoor() {
		if (!isOpen && isOpenable) {
			isOpen = true;
			return true;
		}
		else 
			return false;
	}
	
	public boolean closeDoor() {
		if (isOpen) {
			isOpen = false;
			return true;
		}
		else
			return false;
	}
}
