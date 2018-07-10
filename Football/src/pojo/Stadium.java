package pojo;

public class Stadium {
	
	private float length;
	private float width;
	private float height;
	private Integer capacity;
	private String stadium_name;
	
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public float getWidth() {
		return width;
	}
	public void setWidth(float width) {
		this.width = width;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public String getStadium_name() {
		return stadium_name;
	}
	public void setStadium_name(String stadium_name) {
		this.stadium_name = stadium_name;
	}
	/**
	 * @param length
	 * @param width
	 * @param height
	 * @param capacity
	 * @param stadium_name
	 */
	public Stadium(float length, float width, float height, Integer capacity, String stadium_name) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.capacity = capacity;
		this.stadium_name = stadium_name;
	}

	public Stadium() {
		this.length = 300;
		this.width = 250;
		this.height = 200;
		this.capacity = 20000;
		this.stadium_name = "Old Trafford";
	}

	
}
