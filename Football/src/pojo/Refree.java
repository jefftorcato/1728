package pojo;

public class Refree {
	private String name="Pranita Sawant";
	private int age;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @param name
	 * @param age
	 */
	public Refree(String name, int age) {

		this.name = name;
		this.age = age;
	}

}
