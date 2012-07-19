
public abstract class Button {
	
	private String buttonLabel;
	
	public Button(String buttonLabel) {
		this.buttonLabel = buttonLabel;
	}
	
	public String toString() {
		return buttonLabel;
	}
	
	public abstract void pressButton();
	
}
