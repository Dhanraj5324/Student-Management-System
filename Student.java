package StudentManagementSystem;

public class Student {
	private int rollNumber;
	private String name;
	private int age;
	private double grade;
	public Student(int rollNumber , String name , int age , double grade) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public int getRollNumber() {return rollNumber;}
	public String getName() {return name;}
	public int getAge() {return age;}
	public double getGrade() {return grade;}
	
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
	public void setGrade(double grade) {this.grade = grade;}
	
	@Override
	public String toString() {
		return "Roll no : "+ rollNumber + " , Name : " + name + " , Age : "+ age + " , Grade : "+ grade;
	}

}
