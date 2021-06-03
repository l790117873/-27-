

import java.util.Scanner;

class student
{
	private String name;
	private String phoneNumbers;
	private String studentNumber;
	public  student(String name,String phoneNumbers,String studentNumber) {
		this.name = name;
		this.phoneNumbers = phoneNumbers;
		this.studentNumber = studentNumber;
	}
	
	public void displayStudent() {
		System.out.println("姓名:"+ name +'\t'+"电话号码:" + phoneNumbers +'\t'+"学号:" +studentNumber);
	}
}
public class Studentclass {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		student s1=new student("刘声","18963964601","1914300322");
		student s2=new student("test","100002","420102");
		s1.displayStudent();
		s2.displayStudent();
	}
}
