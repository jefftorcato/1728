package pojo;

public class Ball {
	private Integer size;
	private int weight;
	private String color;
	
	public Ball(){
		size=0;
	}
	
	public Ball(int size){
		this.size=size;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param size
	 * @param weight
	 * @param color
	 */
	public Ball(Integer size, int weight, String color) {
		this.size = size;
		this.weight = weight;
		this.color = color;
	}
	

}
