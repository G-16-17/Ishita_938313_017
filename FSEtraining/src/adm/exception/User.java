package adm.exception;

public class User {
		// TODO Auto-generated constructor stub
		private int userId;
		private String userName;
		private int age;
		
		private User(int userId, String userName, int age) {
			this.userId= userId;
			this.userName= userName;
			this.age = age;
		}
		
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return String.format("%-10s%-20s%-10s",userId,userName,age);
	}
		//userId, username,age
		public static User createUser(String str) throws InvalidAgeException{
			String[] data= str.split(",");
			int id = Integer.parseInt(data[0]);
			int age= Integer.parseInt(data[2]);
			if (age<18) {
				throw new InvalidAgeException("Invalid Age: Age should be greater than 17");
				
			}
			User user = new User(id, data[1], age);
			return user;
		}
		

}
