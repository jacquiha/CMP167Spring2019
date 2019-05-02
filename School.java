
public class School {
	
	
	/* 
	 * Attributes: 
	 * +name: String
	 * +classroom: String[]
	 * +location: String
	 * +isOpen: boolean
	 * +isPublic
	 * Behaviors:
	 * +Open: void
	 * +Closed: void
	 */
	String name;
	String classroom;
	String location;
	boolean publicSchool;
	boolean isOpen;
	
	public void open(boolean isOpen) {
		isOpen = true;
	}
	public void close(boolean isOpen) {
		isOpen = false;
	}
}
