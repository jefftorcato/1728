package application;


import pojo.Player;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player captain=new Player();
		captain.setAge(22);
		captain.setName("Jeff Torcato");
		
		Player goalkeeper=new Player("Kedar",22);
		System.out.println("Captian name="+captain.getName());
		System.out.println("Team Leader="+goalkeeper.getName()+"  "+"Age="+goalkeeper.getAge());
		
	}

}
