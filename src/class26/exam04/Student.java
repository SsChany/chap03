package class26.exam04;

public class Student {

	String name = null;
	int age = 0;
	char gender = 0;
	String phone = null;
	int score = 0;

	public Student() {
		}

	public Student(String name, int age, char gender, String phone, int score) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.score = score;
	}
	public String showStudentInfo() {
	String str = this.name+"\t"+this.age+"\t"+this.gender+"\t"+this.phone+"\t"+this.score;
		return str;
	}
	
	
	
	
	
	
	
	}
	


