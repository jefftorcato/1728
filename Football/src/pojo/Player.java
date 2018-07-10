package pojo;

public class Player {
	
		private String name;
		private Integer age;
		private String team;
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}
		
		public Player(){
			name="Jeff Torcato";
			age=22;
		}
		
		public Player(String name,Integer age){
			this.name=name;
			this.age=age;
		}
		
		public void kick(){
			System.out.println("Kick");
		}
		
	}
