package model;

public class Room {

	

	private String name;

	private int number;

	private int capacity;
	
	
	
	public Room() {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param number
	 * @param costForAttendee
	 * @param capacity
	 */
	public Room(String name, int number, int costForAttendee, int capacity) {
		super();
		this.name = name;
		this.number = number;
		this.capacity = capacity;
	}

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
	

}
