package Encapsulation;

public class Users {

	public String name;
	public int age;
	public int userID;

	public Users() {

	}

	public Users(String name, int age, int userID) {
		this.name = name;
		this.age = age;
		this.userID = userID;
	}

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

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}
