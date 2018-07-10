package pojo;

public class Score {
	private String winner;
	private Integer goal;
	
	public String getWinner() {
		return winner;
	}
	
	public Score() {
		this.winner = "Manchester United";
		this.goal = 2;
	}
	
	public Score(String winner, Integer goal) {
		this.winner = winner;
		this.goal = goal;
	}


	public void setWinner(String winner) {
		this.winner = winner;
	}
	public Integer getGoal() {
		return goal;
	}
	public void setGoal(Integer goal) {
		this.goal = goal;
	}
	
	
	public void calculateWinner(){
		System.out.println("Winner Name:");
	}
}
